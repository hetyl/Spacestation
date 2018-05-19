package com.example.a89191.spacestation;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;



public class DatabaseAccess {
    static public int id=1;
    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase database;
    private static DatabaseAccess instance;

    String[] list = new String[5];
    static public String questions;
    static public String answer1;
    static public String answer2;
    static public String answer3;
    static public String answer4;
   // static DatabaseAccess questionn;

    private DatabaseAccess(Context context) {
        this.openHelper = new DatabaseOpenHelper(context);
    }

    public static DatabaseAccess getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseAccess(context);
        }
        return instance;
    }

    public void open() {
        this.database = openHelper.getWritableDatabase();
    }

    public void close() {
        if (database != null) {
            this.database.close();
        }
    }
/* public void addQuote(String element) {
this.database.execSQL("INSERT INTO questions values (NULL, '" + element + "', '42', '2', '2', '2')");
} */


/* class Question {
private String question1;
private String[] answers = new String[4];
public Question(String question, String[] answers) {
this.question1 = list[0];
this.answers[0] = list[1];
this.answers[1] = list[2];
this.answers[2] = list[3];
this.answers[3] = list[4];
}
//public String getQuestion() {
//return this.question1;
// }
} */

//static public String getQuestion (int id) {
// return (questions);
//}


    public String[] getQuotes(int id) {

        Cursor cursor = database.rawQuery("SELECT * FROM questions where _id = " + id, null);
        cursor.moveToFirst();
        String[] list = new String[5];
        list[0] = cursor.getString(1);
        list[1] = cursor.getString(2);
        list[2] = cursor.getString(3);
        list[3] = cursor.getString(4);
        list[4] = cursor.getString(5);
//int k=2;
/*
while (!cursor.isAfterLast()) {
// String[] answers = {cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5)};
//list.add(cursor.getString(1));

// k++;
cursor.moveToNext();
}*/
        cursor.close();
        return list;
    }
}