Page({
  data: {
    banner: [],
    topics: [],
    items: [],
    loadingHidden: false,
    loadMoreHidden: true
  },
  onLoad: function (options) {
    // 生命周期函数--监听页面加载
    requestBannerData(this);
    requestTopicData(this, true);
  },
  onReady: function () {
    // 生命周期函数--监听页面初次渲染完成
  },
  onShow: function () {
    // 生命周期函数--监听页面显示
  },
  onHide: function () {
    // 生命周期函数--监听页面隐藏
  },
  onUnload: function () {
    // 生命周期函数--监听页面卸载
  },
  onPullDownRefresh: function () {
    // 页面相关事件处理函数--监听用户下拉动作

  },
  onReachBottom: function () {
    // 页面上拉触底事件的处理函数
   
    this.setData({
      loadMoreHidden: false
    });
    requestTopicData(this, false);
  },
  onShareAppMessage: function () {
    // 用户点击右上角分享
    return {
      title: 'title', // 分享标题
      desc: 'desc', // 分享描述
      path: 'path' // 分享路径
    }
  },
})

/**
 * 请求数据
 * @param that Page的对象，用其进行数据的更新
 * @param targetPage 请求的目标页码
 */
function requestBannerData(that) {
  //轮播图
  wx.request({
    url: 'http://v3.wufazhuce.com:8000/api/banner/list/3',
    data: {},
    method: 'GET', // OPTIONS, GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT
    // header: {}, // 设置请求的 header
    success: function (res) {
      // success
      //console.log(res.data.data);
      that.setData({
        banner: res.data.data,
        loadingHidden: true
      });

    },
    fail: function (res) {
      // fail
      console.log("fail");
    },
    complete: function (res) {
      // complete
    }
  })
  //
}


function requestTopicData(that, first) {
  var url = 'http://v3.wufazhuce.com:8000/api/banner/list/4';
  if (!first) {
    url = url + "?last_id=" + that.data.topics[that.data.topics.length - 1].id
    console.log(" last_id" + that.data.topics[that.data.topics.length - 1].id);
  }

  //专题
  wx.request({
    url: url,
    data: {},
    method: 'GET', // OPTIONS, GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT
    // header: {}, // 设置请求的 header
    success: function (res) {
      // success
      console.log(res.data.data);
      that.setData({
        topics: that.data.topics.concat(res.data.data),
      });
      if (first) {
        that.setData({
          loadingHidden: true
        });
      } else {
        that.setData({
          loadMoreHidden: true
        });
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