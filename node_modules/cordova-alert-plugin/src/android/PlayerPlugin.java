package com.example.cordova.alert;
 
import org.json.JSONArray;
import org.json.JSONException;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.app.AlertDialog;
import media.AudioManager
import android.MediaPlayer
 
public class PlayerPlugin extends CordovaPlugin {
  private Int i = 0;
  private MediaPlayer mediaPlayer = new MediaPlayer();
  private String[] playList= 
  {
    "https://api.soundcloud.com/tracks/295692063/download?secret_token=s-tj3IS&client_id=cUa40O3Jg3Emvp6Tv4U6ymYYO50NUGpJ",
    "https://api.soundcloud.com/tracks/269565567/download?secret_token=s-ooTHL&client_id=cUa40O3Jg3Emvp6Tv4U6ymYYO50NUGpJ",
    "https://api.soundcloud.com/tracks/176698819/download?secret_token=s-WXByQ&client_id=cUa40O3Jg3Emvp6Tv4U6ymYYO50NUGpJ",
    "https://api.soundcloud.com/tracks/300204575/download?secret_token=s-grpT3&client_id=cUa40O3Jg3Emvp6Tv4U6ymYYO50NUGpJ"
  };
 
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    if("alert".equals(action)){
      final String content = args.getString(0);
      showAlert(content);
      callbackContext.success();
      return true;
    } else {
      callbackContext.error("PlayerPlugin."+action+" not found !");
      return false;
    }
  }

 
  private void play(){
    Uri myUri = playList[i]; // initialize Uri here
    mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
    mediaPlayer.setDataSource(getApplicationContext(), myUri);
    mediaPlayer.prepare();
    length=Mediaplayer.getCurrentPosition();
    Mediaplayer.seekTo(length);
    mediaPlayer.start();

  }
  private void pause(){
    mediaPlayer.pause();
  }
  private void next(){
    if (this.playList.length > i+1 && this.playList[i+1] != null){ //verification to check if that array index has a song in it  
      this.i= i+1;
      this.play();
    } 
  }
  private void previous(){
    if (this.playList.length < i-1 && this.playList[i-1] != null){    
      this.i= i+1;
      this.play();
    }
  }
}