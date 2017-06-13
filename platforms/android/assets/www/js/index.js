
    var app = {
        // Application Constructor
        testplugin: function(){
            console.log('hi');
            cordova.plugins.Player.alert('hello');
        },

        
        // deviceready Event Handler
        //
        // Bind any cordova events here. Common events are:
        // 'pause', 'resume', etc.
        player: function() {
            var song = new Media('')
        }
    };