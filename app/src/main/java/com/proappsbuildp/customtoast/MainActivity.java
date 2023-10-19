package com.proappsbuildp.customtoast;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.toast_sound);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        imageView.setOnClickListener(v -> {
            mediaPlayer.start();
            LayoutInflater layoutInflater = getLayoutInflater();
            View view = layoutInflater.inflate(R.layout.custom_toast, findViewById(R.id.customtoast));

            Toast toast = new Toast(MainActivity.this);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(view);
            toast.show();

        });
    }
}