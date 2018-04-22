package com.example.a89191.spacestation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Activity3 extends AppCompatActivity implements View.OnClickListener {
    ImageButton arrow2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        arrow2= (ImageButton) findViewById(R.id.arrow2);
        arrow2.setOnClickListener(this);
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
