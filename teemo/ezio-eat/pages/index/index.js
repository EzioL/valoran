//index.js
//获取应用实例
const app = getApp()

Page({
  data: {
    latitude: 1.00,
    longitude: 2.00,
    sw: "开始",
    motto: '一会去吃什么?',
    userInfo: {},
    run: false,
    foodName: "",
    foodImgUrl: "",
    list: ["馄饨", "拉面", "烩面", "热干面", "高贵沙县", "黄焖鸡米饭", "喝粥", "有家川菜", "花椒鱼"],
    shops: [],
    foods: [],
    food:""
  },
  //事件处理函数
  bindViewTap: function () {
    wx.navigateTo({
      url: '../logs/logs'
    })
  },
  onLoad: function () {
    //获取地理位置
    getLocation(this);
    //获取用户信息
    if (app.globalData.userInfo) {
      this.setData({
        userInfo: app.globalData.userInfo,
        hasUserInfo: true
      })
    } else if (this.data.canIUse) {
      // 由于 getUserInfo 是网络请求，可能会在 Page.onLoad 之后才返回
      // 所以此处加入 callback 以防止这种情况
      app.userInfoReadyCallback = res => {
        this.setData({
          userInfo: res.userInfo,
          hasUserInfo: true
        })
      }
    } else {
      // 在没有 open-type=getUserInfo 版本的兼容处理
      wx.getUserInfo({
        success: res => {
          app.globalData.userInfo = res.userInfo
          this.setData({
            userInfo: res.userInfo,
            hasUserInfo: true
          })
        }
      })
    }

  },
  getUserInfo: function (e) {
    app.globalData.userInfo = e.detail.userInfo
    this.setData({
      userInfo: e.detail.userInfo,
      hasUserInfo: true
    })
  },
  getEat: function (e) {
    if (!this.data.run) {
      this.setData({
        run: true,
        sw: "停止",
        foodImgUrl: ""
      })
    } else {
      var path = this.data.food.image_path
      var p1 = path.substring(0,1)
      var p2 = path.substring(1, 3)
      var p3 = path.substring(3, path.length)
      path = p1+"/"+p2+"/"+p3
      var url = "http://fuss10.elemecdn.com/" + path +".jpeg?imageMogr2/thumbnail/100x100/format/webp/quality/85"
      console.log("url-->" + url)
      this.setData({
        run: false,
        sw: "不行，换一个",
        motto: "吃什么? 吃这个！",
        foodImgUrl: url
      })
    }
    //getFood(this)
    getElmFood(this)
  }

})

function getLocation(that) {
  wx.getLocation({
    type: 'wgs84',
    success: function (res) {

      that.setData({
        latitude: res.latitude,
        longitude: res.longitude
      })
      getElmShops(that)
    }
  })
}

function getElmShops(that) {
  wx.request({
    url: 'https://www.ele.me/restapi/shopping/restaurants?limit=10&latitude=' + that.data.latitude + '&longitude=' + that.data.longitude +"&restaurant_category_ids%5B%5D=-100&sign=1516949807400&terminal=web",
    data: {},
    method: 'GET', // OPTIONS, GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT
    // header: {}, // 设置请求的 header
    success: function (res) {
      // success
      that.setData({
        shops: res.data
      })
      getElmFoods(that, res.data)
    },
    fail: function (res) {
      // fail
      console.log("fail");
    },
    complete: function (res) {
      // complete
    }
  })
}

function getElmFoods(that, shops) {
  var lastIndex = shops.length;
  for (var i = 1; i < shops.length; i++) {
    var shop = shops[i];
    var cIndex = i;
    wx.request({
      url: 'https://www.ele.me/restapi/shopping/v2/menu?restaurant_id=' + shop.id,
      data: {},
      method: 'GET', // OPTIONS, GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT
      // header: {}, // 设置请求的 header
      success: function (res) {
        // success
        that.setData({
          foods: that.data.foods.concat(res.data[0].foods),
        });
        if (i == shops.length) {
          console.log(that.data.foods);
        }
      },
      fail: function (res) {
        // fail
        console.log("fail");
      },
      complete: function (res) {
        // complete
      }
    })
  }

}


function getElmFood(that) {
  console.log("getElmFood")
  var size = that.data.foods.length;
  if (that.data.run) {
    setTimeout(function () {
      //要延时执行的代码
      var random = Math.round(Math.random() * size);
      var foodx = that.data.foods[random]
      console.log("ElmFood-->" + foodx.name)
      that.setData({
        foodName: foodx.name,
        food: foodx
      })
      getElmFood(that)
    }, 100)
  }
}


function shuffle(that) {
  var a = that.data.foods;
  var j, x, i;
  for (i = a.length - 1; i > 0; i--) {
    j = Math.floor(Math.random() * (i + 1));
    x = a[i];
    a[i] = a[j];
    a[j] = x;
  }
  that.setData({
    foods: a,
  });
}
