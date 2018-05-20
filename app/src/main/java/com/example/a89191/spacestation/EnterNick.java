package com.example.a89191.spacestation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class EnterNick extends AppCompatActivity implements View.OnClickListener {
    TextView textView1;
    ImageButton arrow5;
    Button next;
    int i=0;
    EditText editText1;
    static int scoreNick;
    static String newName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_nick);
        arrow5 = (ImageButton) findViewById(R.id.arrow5);
        arrow5.setOnClickListener(this);
        next = (Button) findViewById(R.id.next);
        next.setOnClickListener(this);
        textView1 = (TextView) findViewById(R.id.textView1);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText1.setOnKeyListener(new View.OnKeyListener() {
                                       public boolean onKey(View v, int keyCode, KeyEvent event) {
                                           if (event.getAction() == KeyEvent.ACTION_DOWN &&
                                                   (keyCode == KeyEvent.KEYCODE_ENTER)) {
                                               if (editText1 != null) {
                                                   newName = editText1.getText().toString();
                                                   scoreNick=Activity2.score;
                                                   i=1;
                                                   textView1.setText("");
                                                   return true;
                                               }
                                           } else {
                                               textView1.setText("You did not enter name!");
                                           }
                                           return false;
                                       }
                                   }
        );

//        public void intent2() {
//            Intent intent = new Intent(this, Activity3.class);
//            startActivity(intent);
//        }
    }

//        editText1.setOnKeyListener(new View.OnKeyListener() { public boolean onKey(View v, int keyCode, KeyEvent event) {
//            if (event.getAction() == KeyEvent.ACTION_DOWN && (keyCode == KeyEvent.KEYCODE_ENTER)) {
//                if (editText1 != null) {
//                    String name = editText1.getText().toString();
//                    return true;
//                }
//                else { textView1.setText("You did not enter name!");
//                return false;
//                }
//            }
//            return false;
//        }
//        );
//
//
//        }
//        {
//            Intent intent = new Intent(this, Activity3.class);
//            startActivity(intent);
//        }
//    }

    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.arrow5:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
        }

     switch (v.getId()) {
        case R.id.next: if (i==1) {
            textView1.setText("");
            Intent intent = new Intent(this, Activity3.class);
            startActivity(intent);
        } else {
            textView1.setText("You did not enter name!");
        }
            break;
    }
  }
}
