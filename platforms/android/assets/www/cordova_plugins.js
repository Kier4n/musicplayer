cordova.define('cordova/plugin_list', function(require, exports, module) {
module.exports = [
    {
        "id": "com.example.cordova.alert.Alert",
        "file": "plugins/com.example.cordova.alert/www/plugin.js",
        "pluginId": "com.example.cordova.alert",
        "clobbers": [
            "cordova.plugins.Alert"
        ]
    }
];
module.exports.metadata = 
// TOP OF METADATA
{
    "cordova-plugin-whitelist": "1.3.2",
    "com.example.cordova.alert": "0.0.1"
};
// BOTTOM OF METADATA
});