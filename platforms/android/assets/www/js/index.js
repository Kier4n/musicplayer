    var app = {
        play: function() {
            cordova.plugins.Alert.play();
        },
        pause: function() {
            cordova.plugins.Alert.pause();
        },
        next: function() {
            cordova.plugins.Alert.next();

        },
        previous: function() {
            cordova.plugins.Alert.previous();
        }
    };