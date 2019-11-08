package com.example.projectx;

import androidx.appcompat.app.AppCompatActivity;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.widget.MediaController;
import android.widget.VideoView;
import android.os.Bundle;

public class ProfileActivity extends AppCompatActivity {

    VideoView videoView;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Create a VideoView widget in the layout file
        //use setContentView method to set content of the activity to the layout file which contains videoView
        setContentView(R.layout.profile_activity);

        videoView = (VideoView)this.findViewById(R.id.videoView);

        //add controls to a MediaPlayer like play, pause.
        MediaController mc = new MediaController(this);
        videoView.setMediaController(mc);

        //Set the path of Video or URI
        videoView.setVideoURI(Uri.parse("rtsp://tv.hindiworldtv.com:1935/live/getpnj"));
        //

        //Set the focus
        videoView.requestFocus();
    }
}
