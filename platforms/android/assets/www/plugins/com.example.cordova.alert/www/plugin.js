cordova.define("com.example.cordova.alert.Player", function(require, exports, module) {
function Plugin(){}
Plugin.alert = function(content){
  var onSuccess = function(){};
  var onFail = function(){};
  cordova.exec(onSuccess, onFail, 'PlayerPlugin', 'alert', [content]);
};
module.exports = Plugin;
});
