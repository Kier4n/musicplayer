    var app = {
        play: function() {
            cordova.plugins.Player.play();
        },
        pause: function() {
            cordova.plugins.Player.pause();
        }
        next: function() {
            cordova.plugins.Player.next();

        }
        previous: function() {
            cordova.plugins.Player.previous();
        }
    };