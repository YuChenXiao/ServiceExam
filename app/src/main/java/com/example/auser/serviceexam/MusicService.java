package com.example.auser.serviceexam;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.util.Log;

import java.io.IOException;

public class MusicService extends Service {
    MediaPlayer mp;
    public static boolean isPlaying = false;

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
    mp = MediaPlayer.create(this, R.raw.boss);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        playOrPause();
        return super.onStartCommand(intent, flags, startId);
    }


    public void playOrPause(){
        if(!isPlaying){
            mp.pause();
            Log.d("TAG","暫停");
        }else {
            mp.start();
            Log.d("TAG","開始");
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mp.stop();
        mp.release();
        mp = null;
        Log.d("TAG","結束");
    }
}
