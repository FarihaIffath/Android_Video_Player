package com.example.fariha.video_player;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView videoView;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView=findViewById(R.id.v);
        mediaController=new MediaController(this);

       // videoView.setVideoPath("android.resources://"+getPackageName()+"/"+R.raw.sunflower);
        Uri u= Uri.parse("android.resources://"+getPackageName()+"/"+R.raw.sunflower);
         videoView.setVideoURI(u);

        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.start();

    }
}
