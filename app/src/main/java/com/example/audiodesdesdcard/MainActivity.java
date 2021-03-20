package com.example.audiodesdesdcard;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ejecutar(View v) {
        Uri datos = Uri.parse(getExternalFilesDir(null).toString() + "/mario-bros vida.mp3");
        MediaPlayer mp = MediaPlayer.create(this, datos);
        mp.start();
    }

}