cordova.define("com.example.cordova.alert.Alert", function(require, exports, module) {
function Plugin(){}
Plugin.alert = function(content){
  window.alert(content);
};
module.exports = Plugin;
});
