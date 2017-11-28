package com.example.auser.serviceexam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent =new Intent(MainActivity.this,MusicService.class);
    }
    public void clickok(View v){
        startService(intent);
        MusicService.isPlaying=true;
    }
    public void clickdown(View v){
        startService(intent);
        MusicService.isPlaying=false;
    }
    public void clickstop(View v){
        stopService(intent);
    }
}
