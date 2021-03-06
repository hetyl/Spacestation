package com.example.a89191.spacestation;

import android.app.ActionBar;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    Button play;
    Button score;
    ImageButton question1;
    MediaPlayer mPlayer;
    ImageButton sound;
    static int p=0;
    static int k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.equation).setRotation(45);
        findViewById(R.id.star1).setRotation(145);
        findViewById(R.id.star5).setRotation(60);
        findViewById(R.id.star3).setRotation(135);
        findViewById(R.id.star9).setRotation(75);
        findViewById(R.id.star12).setRotation(15);
        findViewById(R.id.star15).setRotation(115);
        findViewById(R.id.star18).setRotation(35);
        findViewById(R.id.star20).setRotation(300);
        findViewById(R.id.star8).setRotation(165);
        mPlayer=MediaPlayer.create(this, R.raw.music);
        if (k==0 || mPlayer==null) {
            mPlayer.start();
            k++;
        }
        sound=(ImageButton) findViewById(R.id.sound);
        sound.setOnClickListener(this);
        //ImageView meteorite = (ImageView)  findViewById(R.id.meteorite);
       // float density = getApplicationContext().getResources().getDisplayMetrics().density;
        //meteorite.setLayoutParams(new ActionBar.LayoutParams((int) (density * 40), (int) (density * 80)));
        play= (Button) findViewById(R.id.play);
        play.setOnClickListener(this);

        score= (Button) findViewById(R.id.score);
        score.setOnClickListener(this);
        question1= (ImageButton) findViewById(R.id.question1);
        question1.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {
      switch (v.getId()) {
          case R.id.question1:
              Intent intent2 = new Intent(this, Activity4.class);
              startActivity(intent2);
              break;
          case R.id.play:
              Intent intent = new Intent (this, Activity2.class);
              startActivity(intent);
              break;
          case R.id.score:
              Intent intent1 = new Intent (this, Activity3.class);
              startActivity(intent1);
              break;
          case R.id.sound:
              if ((p % 2) ==0) {
                  mPlayer.pause();
                  p++;
                  sound.setImageDrawable(getResources().getDrawable(R.drawable.sound_off));
              } else {
                  mPlayer.start();
                  p++;
                  sound.setImageDrawable(getResources().getDrawable(R.drawable.sound_on));
              }
              break;
          default:
              break;

      }
    }
    public void onDestroy() {
        super.onDestroy();
        if (mPlayer.isPlaying()) {
            stopPlay();
        }
    }
    private void stopPlay(){
        mPlayer.stop();
        try {
            mPlayer.prepare();
            mPlayer.seekTo(0);
        }
        catch (Throwable t) {
        }
    }
}
