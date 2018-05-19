package com.example.a89191.spacestation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity implements View.OnClickListener {
    ImageButton arrow2;
    int[] score = new int[10];
    String[] name = new String [10];
    TextView score1;
    TextView score2;
    TextView score3;
    TextView score4;
    TextView score5;
    TextView score6;
    TextView score7;
    TextView score8;
    TextView score9;
    TextView score10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        arrow2= (ImageButton) findViewById(R.id.arrow2);
        arrow2.setOnClickListener(this);
        this.score1 = (TextView) findViewById(R.id.score1);
        this.score2 = (TextView) findViewById(R.id.score2);
        this.score3 = (TextView) findViewById(R.id.score3);
        this.score4 = (TextView) findViewById(R.id.score4);
        this.score5 = (TextView) findViewById(R.id.score5);
        this.score6 = (TextView) findViewById(R.id.score6);
        this.score7 = (TextView) findViewById(R.id.score7);
        this.score8 = (TextView) findViewById(R.id.score8);
        this.score9 = (TextView) findViewById(R.id.score9);
        this.score10 = (TextView) findViewById(R.id.score10);
//       for (int i=0; i<10; i++) {
//            score[i]=0;
//           name[i]=null;
//        }
        int newScore=EnterNick.scoreNick;
        String newName = EnterNick.name;
        for (int i=0; i<10; i++) {
            if (newScore>score[i]) {
                for (int j=9; j>i; j--) {
                 score [j]=score[j-1];
                 name [j]=name[j-1];
                }
                score[i]=newScore;
                name[i]=newName;
                newScore=0;
                //score[i+1]=score[i]
               // score[i]=newScore;
               // newScore=0;
            }
        }
        for (int i=0; i<10; i++) {
            if (score[i]>0) {if (i==0) {score1.setText("1. " +name[0] + " " + String.valueOf(score[0]) );}
                if (i==1) {score2.setText("2. "+ name[1] + " " + String.valueOf(score[1]) );}
                if (i==2) {score3.setText("3. "+ name[2] + " " + String.valueOf(score[2]) );}
                if (i==3) {score4.setText("4. "+ name[3] + " " + String.valueOf(score[3]) );}
                if (i==4) {score5.setText("5. "+ name[4] + " " + String.valueOf(score[4]) );}
                if (i==5) {score6.setText("6. "+ name[5] + " " + String.valueOf(score[5]) );}
                if (i==6) {score7.setText("7. "+ name[6] + " " + String.valueOf(score[6]) );}
                if (i==7) {score8.setText("8. "+ name[7] + " " + String.valueOf(score[7]) );}
                if (i==8) {score9.setText("9. "+ name[8] + " " + String.valueOf(score[8]) );}
                if (i==9) {score10.setText("10. "+ name[9] + " " + String.valueOf(score[9]) );}

            }


            }
        }

    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.arrow2:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
