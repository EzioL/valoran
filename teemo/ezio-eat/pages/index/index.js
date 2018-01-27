//index.js
//获取应用实例
const app = getApp()

Page({
  data: {
    no_times: false,
    frequency: 7,
    pre_frequency: 7,
    hidden: false,
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
    food: "",
    pre_food: "",
  },
  //用户点击右上角分享
  onShareAppMessage: function () {
    var title;
    var desc;
    var imageUrl;
    if ((this.data.frequency == this.data.pre_frequency) && this.data.pre_frequency  > 0){
      //没随机 
      title = "想好一会去吃什么了嘛？"
      desc = "褐言的生活瞎指南或许可以解决这个宇宙难题~"
    }else{
      title = "要去吃" + this.data.foodName +"啦，有人一起嘛？";
      desc = " 它在 " + this.data.pre_food.shop_name + " (" + this.data.pre_food.shop_address+")"
      imageUrl = this.data.foodImgUrl;
    }
    
    return {
      title: title, // 分享标题
      desc: desc, // 分享描述
      path: 'pages/index/index' // 分享路径
    }
  },
  //事件处理函数
  bindViewTap: function () {
    wx.navigateTo({
      url: '../logs/logs'
    })
  },
  onLoad: function () {
    //野狗云测试数据绑定
    /* app.todoRef.bindAsArray(this, 'todo', function (err) {
       if (err != null) {
         // 数据绑定失败，失败原因：err.message;
       } else {
         // 数据绑定成功
       }
     })*/

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

    if (!this.data.run && this.data.frequency > 0 && this.data.pre_frequency > 0) {

      var n = this.data.frequency - 1;
      var pre_n = this.data.frequency;
      this.setData({
        pre_frequency: pre_n,
        frequency: n,
        run: true,
        sw: "停止",
        foodImgUrl: ""
      })
      if (n == 0) {
        this.setData({
          no_times: true
        })
      }
    } else {
      this.setData({
        run: false,
        sw: "不行，换一个",
        motto: "吃什么? 吃这个！",
      })

      //一坨神奇的判断
      if (this.data.pre_frequency == 0 && this.data.frequency <= 0) {
        this.setData({
          pre_frequency: -1,
        })
      }
      if (this.data.pre_frequency == 1 && this.data.frequency <= 0) {
        this.setData({
          pre_frequency: 0,
        })
      }
      if (this.data.pre_frequency >= 0 && this.data.frequency >= 0) {
        console.log("load img")
        var path = this.data.food.image_path
        var p1 = path.substring(0, 1)
        var p2 = path.substring(1, 3)
        var p3 = path.substring(3, path.length)
        path = p1 + "/" + p2 + "/" + p3
        var suffix = "png"
        if (path.indexOf("jpeg") >= 0) {
          suffix = "jpeg"
        }
        if (path.indexOf("png") >= 0) {
          suffix = "png"
        }
        var url = "http://fuss10.elemecdn.com/" + path + "." + suffix + "?imageMogr2/thumbnail/240x240/format/webp/quality/85"
        console.log("url-->" + url)
        //点了停止 还会多循环一次 ~ ..
        this.setData({
          foodName: this.data.pre_food.name,
          foodImgUrl: url

        })
      }
    }

    if (this.data.frequency <= 0 && this.data.pre_frequency < 0) {
      wx.showToast({
        title: '这么作，别吃了，等死吧，告辞~',
        icon: "none",
        duration: 2000
      })
    } else if (this.data.run) {
      getBingoFood(this)
    }

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
    url: 'https://www.ele.me/restapi/shopping/restaurants?limit=20&latitude=' + that.data.latitude + '&longitude=' + that.data.longitude + "&restaurant_category_ids%5B%5D=-100&sign=1516949807400&terminal=web",
    data: {},
    method: 'GET', // OPTIONS, GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT
    // header: {}, // 设置请求的 header
    success: function (res) {
      // success
      that.setData({
        shops: res.data
      })
      getElmFoodData(that, res.data)
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

function getElmFoodData(that, shops) {
  var index = 1;
  for (var i = 1; i < shops.length; i++) {
    var shop = shops[i];
    wx.request({
      url: 'https://www.ele.me/restapi/shopping/v2/menu?restaurant_id=' + shop.id,
      data: {},
      method: 'GET', // OPTIONS, GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT
      // header: {}, // 设置请求的 header
      success: function (res) {
        // success
        if (res.data[0] != null) {
          //把商家名字 地址写进去
          var todoFoods = res.data[0].foods;
          var shopx = shops[index];
          for (var t = 0; t < todoFoods.length; t++) {
            todoFoods[t].shop_name = shopx.name;
            todoFoods[t].shop_address = shop.address;
          }
          that.setData({
            foods: that.data.foods.concat(res.data[0].foods),
          });
        }
      },
      fail: function (res) {
        // fail
        console.log("fail");
      },
      complete: function (res) {
        // complete
        index++;
        console.log("index" + index);
        if (index == shops.length) {
          console.log("========");
          shuffle(that)
        }
      }
    })
  }

}


function getBingoFood(that) {
  console.log("bingo")
  console.log("bingo run " + that.data.run)
  var size = that.data.foods.length;
  if (that.data.run) {
    setTimeout(function () {
      //要延时执行的代码
      var random = Math.round(Math.random() * size);
      var pre_food = that.data.food
      var food = that.data.foods[random]
      console.log("food-->" + food.name)
      console.log("pre_food-->" + pre_food.name)
      that.setData({
        foodName: food.name,
        food: food,
        pre_food: pre_food
      })
      getBingoFood(that)
    }, 120)
  }


}

//把数据乱序
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
    hidden: true
  });
  console.log(that.data.foods);
}
