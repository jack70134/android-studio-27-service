package com.example.android_studio_27_service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import androidx.annotation.Nullable;

public class MyService extends Service {
    private  MediaPlayer player;
    @Nullable
    @Override
    public Binder onBind(Intent intent) {
        return null;
    }
    public MyService() {
        super();
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        player = MediaPlayer.create(getApplicationContext(), R.raw.music);
        player.setLooping(true);
        player.start();
        return START_STICKY;
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        player.stop();
    }
}