package com.example.audioplayer1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView play1;
MediaPlayer mediaPlayer;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play1=findViewById(R.id.play1);


      play1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
if(play1.getTag()!=null && play1.getTag().toString().contains("Not_playing")) {


    if (mediaPlayer != null) mediaPlayer.release();
    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.gojol);
    mediaPlayer.start();
    play1.setImageResource(R.drawable.stop);
    play1.setTag("plaing_Now");

}else{
   if(mediaPlayer!=null)mediaPlayer.release();
   play1.setImageResource(R.drawable.pause);
   play1.setTag("Not_Playing");
}





          }
      });


    }
}