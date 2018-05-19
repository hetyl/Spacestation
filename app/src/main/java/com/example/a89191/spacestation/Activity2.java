package com.example.a89191.spacestation;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.List;

public class Activity2 extends AppCompatActivity implements View.OnClickListener {
    ImageButton arrow1;
    ImageButton start;
    Button answer1;
    Button answer2;
    Button answer3;
    Button answer4;
    String[] list = new String[5];
    TextView question;
    int i;
    int id = DatabaseAccess.id;
    String[] questions;
    DatabaseAccess databaseAccess;
    static int score=0;
    TextView score2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        findViewById(R.id.meteorite1).setRotation(15);
        findViewById(R.id.meteorite3).setRotation(345);
        findViewById(R.id.galaxy2).setRotation(90);
        findViewById(R.id.star1_2).setRotation(45);
        findViewById(R.id.star2_2).setRotation(335);
        findViewById(R.id.star5_2).setRotation(75);
        findViewById(R.id.star8_2).setRotation(115);
        findViewById(R.id.star9_2).setRotation(15);



        arrow1= (ImageButton) findViewById(R.id.arrow1);
        arrow1.setOnClickListener(this);
        start= (ImageButton) findViewById(R.id.start);
        start.setOnClickListener(this);

        this.question = (TextView) findViewById(R.id.question);
        this.score2 = (TextView) findViewById(R.id.score2);
        answer1= (Button) findViewById(R.id.answer1);
        answer1.setOnClickListener(this);
        answer2= (Button) findViewById(R.id.answer2);
        answer2.setOnClickListener(this);
        answer3= (Button) findViewById(R.id.answer3);
        answer3.setOnClickListener(this);
        answer4= (Button) findViewById(R.id.answer4);
        answer4.setOnClickListener(this);
        databaseAccess = DatabaseAccess.getInstance(this);
        databaseAccess.open();



    }

    @Override
    protected void onPause() {
        super.onPause();
        databaseAccess.close();
    }

    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.arrow1:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.start:
                i++;
                if ((i % 2)==1) {
                    id=1;
                    score=0;
                    start.setImageDrawable(getResources().getDrawable(R.drawable.finish));
                    questions = databaseAccess.getQuotes(id);
                    question.setText(questions[0]);
                    answer1.setText(questions[1]);
                    answer2.setText(questions[2]);
                    answer3.setText(questions[3]);
                    answer4.setText(questions[4]);
                    //id++;

                } else {Intent intent1 = new Intent(this, EnterNick.class);
                startActivity(intent1);
                }
                break;

            case R.id.answer1:
                if (id==7 || id==9) {
                    score = score + 10;
                    score2.setText(String.valueOf(score));
                }
                if (id==15) {
                    score = score + 15;
                    score2.setText(String.valueOf(score));
                }
                if (id==20) {
                    score = score + 20;
                    score2.setText(String.valueOf(score));
                    question.setText("Click on the button 'finish'");
                    answer1.setText(null);
                    answer2.setText(null);
                    answer3.setText(null);
                    answer4.setText(null);
                    break;
                }
                id++;
                questions = databaseAccess.getQuotes(id);
                question.setText(questions[0]);
                answer1.setText(questions[1]);
                answer2.setText(questions[2]);
                answer3.setText(questions[3]);
                answer4.setText(questions[4]);
                break;
            case R.id.answer2:
                if (id==2 || id==3) {
                    score = score + 5;
                    score2.setText(String.valueOf(score));
                }
                if (id==11 || id==12 || id==13) {
                    score = score + 15;
                    score2.setText(String.valueOf(score));
                }
                if (id==17 || id==18) {
                    score = score + 20;
                    score2.setText(String.valueOf(score));
                }
                if (id==20) {
                    question.setText("Click on the button 'finish'");
                    answer1.setText(null);
                    answer2.setText(null);
                    answer3.setText(null);
                    answer4.setText(null);
                    break;
                }
                id++;
                questions = databaseAccess.getQuotes(id);
                question.setText(questions[0]);
                answer1.setText(questions[1]);
                answer2.setText(questions[2]);
                answer3.setText(questions[3]);
                answer4.setText(questions[4]);
                break;
            case R.id.answer3:
                if (id==1 || id==4) {
                    score = score + 5;
                    score2.setText(String.valueOf(score));
                }
                if (id==10) {
                    score = score + 10;
                    score2.setText(String.valueOf(score));
                }
                if (id==14) {
                    score = score + 15;
                    score2.setText(String.valueOf(score));
                }
                if (id==19) {
                    score = score + 20;
                    score2.setText(String.valueOf(score));
                }
                if (id==20) {
                    question.setText("Click on the button 'finish'");
                    answer1.setText(null);
                    answer2.setText(null);
                    answer3.setText(null);
                    answer4.setText(null);
                    break;
                }
                id++;
                questions = databaseAccess.getQuotes(id);
                question.setText(questions[0]);
                answer1.setText(questions[1]);
                answer2.setText(questions[2]);
                answer3.setText(questions[3]);
                answer4.setText(questions[4]);
                break;
            case R.id.answer4:
                if (id==5) {
                    score = score + 5;
                    score2.setText(String.valueOf(score));
                }
                if (id==6 || id==8) {
                    score = score + 10;
                    score2.setText(String.valueOf(score));
                }
                if (id==16) {
                    score = score + 20;
                    score2.setText(String.valueOf(score));
                }
                if (id==20) {
                    question.setText("Click on the button 'finish'");
                    answer1.setText(null);
                    answer2.setText(null);
                    answer3.setText(null);
                    answer4.setText(null);
                    break;
                }
                id++;
                questions = databaseAccess.getQuotes(id);
                question.setText(questions[0]);
                answer1.setText(questions[1]);
                answer2.setText(questions[2]);
                answer3.setText(questions[3]);
                answer4.setText(questions[4]);
                break;

            default:
                break;
        }
    }
}