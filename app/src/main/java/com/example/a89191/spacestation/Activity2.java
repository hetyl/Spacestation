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

public class Activity2 extends AppCompatActivity  implements View.OnClickListener {
    ImageButton arrow1;
    ImageButton start;
    String[] list = new String[5];
    TextView question;
    int i;
    int id = DatabaseAccess.id;

    //DataBaseHelper myDbHelper = new DataBaseHelper(this);

    //private Cursor employees;
    //private MyDatabase db;

   // Cursor c = null;

   // private DatabaseHelper mDatabaseHelper;
   // private SQLiteDatabase mSqLiteDatabase;

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
        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);
        databaseAccess.open();


        String[] list = databaseAccess.getQuotes(id);
        databaseAccess.close();

        //ArrayAdapter<String> text = new ArrayAdapter<String>(this, android.R.layout., quotes);



        // ContentValues values = new ContentValues();

        
        //question = (TextView) findViewById(R.id.question);

       /* ((ImageButton) findViewById(R.id.start)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseHelper myDbHelper = new DatabaseHelper(Activity2.this);
                try {
                    myDbHelper.createDataBase();
                } catch (IOException ioe) {
                    throw new Error("Unable to create database");
                }
                try {
                    myDbHelper.openDataBase();
                } catch (SQLException sqle) {
                    throw sqle;
                }
                Toast.makeText(Activity2.this, "Success", Toast.LENGTH_SHORT).show();
                c = myDbHelper.query("questions", null, null, null, null, null, null);
                if (c.moveToFirst()) {
                    do {
                        Toast.makeText(Activity2.this,
                                "_id: " + c.getString(0) + "\n" +
                                        "question: " + c.getString(1) + "\n" +
                                        "rightanswer: " + c.getString(2) + "\n" +
                                        "wronganswer1:  " + c.getString(3),
                                Toast.LENGTH_LONG).show();
                    } while (c.moveToNext());
                }
            }
        });
        */



    }
    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.arrow1:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.start: i++;
                 if (i==1) {
                     /* try {
                         myDbHelper.createDataBase();
                     } catch (IOException ioe) {
                         throw new Error("Unable to create database");
                     }

                     try {
                         myDbHelper.openDataBase();
                     }catch(SQLException sqle){
                         throw sqle;
                     } */
                     start.setImageDrawable(getResources().getDrawable(R.drawable.finish));

                     question.setText(DatabaseAccess.Question.getQuestion());
                     id++;

            } else {

                 }
                break;



                /* case R.id.start:
                Cursor cursor = mSqLiteDatabase.query("questions", new String[]{DatabaseHelper.question_COLUMN,
                                DatabaseHelper.rightanswer_COLUMN},
                        null, null,
                        null, null, null);
                cursor.moveToNext();
                    String rightanswer = cursor.getString(cursor.getColumnIndex(DatabaseHelper.rightanswer_COLUMN));
                    String name = cursor.getString(cursor.getColumnIndex(DatabaseHelper.question_COLUMN));
                    question.append(" "  +cursor.getString(0)+cursor.getString(1));

                cursor.close();

*/


             /* String product = "";
             Cursor cursor = mDb.rawQuery("SELECT * FROM quest_math", null);
             cursor.moveToFirst();
             while (!cursor.isAfterLast()) {
             product += cursor.getString(1) + " | ";
             cursor.moveToNext();
             }
             cursor.close();
             question.setText(product); */





            //break;
            default:
                break;
        }
    }
}
