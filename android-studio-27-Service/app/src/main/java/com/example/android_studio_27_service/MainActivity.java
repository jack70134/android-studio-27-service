package com.example.android_studio_27_service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button start, stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = (Button)findViewById(R.id.playbutton);
        stop = (Button)findViewById(R.id.stopbutton);
        start.setOnClickListener(this);
        stop.setOnClickListener(this);
    }
    @Override
    public void onClick(View b) {
        if (b == start){
            startService(new Intent(this, MyService.class));
        }
        else if (b == stop){
            stopService(new Intent(this, MyService.class));
        }
    }
}