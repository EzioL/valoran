//app.js

//野狗云服务
var wilddog = require('wilddog-weapp-all')
var config = {
  syncURL: 'https://wd8874942640aetgpo.wilddogio.com',
  authDomain: 'wd8874942640aetgpo.wilddog.com'
}

App({
  onLaunch: function () {
    // 展示本地存储能力
    var logs = wx.getStorageSync('logs') || []
    logs.unshift(Date.now())
    wx.setStorageSync('logs', logs)
    // 登录
    wx.login({
      success: res => {
        // 发送 res.code 到后台换取 openId, sessionKey, unionId
      }
    })
    // 获取用户信息
    wx.getSetting({
      success: res => {
        if (res.authSetting['scope.userInfo']) {
          // 已经授权，可以直接调用 getUserInfo 获取头像昵称，不会弹框
          wx.getUserInfo({
            success: res => {
              // 可以将 res 发送给后台解码出 unionId
              this.globalData.userInfo = res.userInfo

              // 由于 getUserInfo 是网络请求，可能会在 Page.onLoad 之后才返回
              // 所以此处加入 callback 以防止这种情况
              if (this.userInfoReadyCallback) {
                this.userInfoReadyCallback(res)
              }
            }
          })
        }
      }
    })
    wilddog.initializeApp(config)
    // this.todoRef = wilddog.sync().ref('todo').orderByPriority().limitToFirst(20)
    wilddog.auth().signInWeapp(function (err, user) {
      // do your logic
      console.log("野狗云服务")
      var date = new Date();
      var seperator1 = "-";
      var seperator2 = ":";
      var month = date.getMonth() + 1;
      var strDate = date.getDate();
      if (month >= 1 && month <= 9) {
        month = "0" + month;
      }
      if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
      }
      var currentTime = date.getFullYear() + seperator1 + month + seperator1 + strDate
        + " " + date.getHours() + seperator2 + date.getMinutes()
        + seperator2 + date.getSeconds();
      //判断更新还是创建 算了 还是lasttime把
      wilddog.sync().ref("/users").child(user.uid).set({
        "uid": user.uid,
        "displayName": user.displayName,
        "email": user.email,
        "isAnonymous": user.isAnonymous,
        "phone": user.phone,
        "photoURL": user.photoURL,
        "lastTime": currentTime,
      }, function (error) {
        if (error == null) {
          // 数据同步到野狗云端成功完成
          console.log("数据同步成功")
        } else {
          console.log(error)
        }
      });

    })
  },
  globalData: {
    userInfo: null
  }
})