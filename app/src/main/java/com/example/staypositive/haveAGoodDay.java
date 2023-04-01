package com.example.staypositive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class haveAGoodDay extends AppCompatActivity {

    private Button startOver7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_have_agood_day);

        startOver7 = (Button) findViewById(R.id.startOver7);
        startOver7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taketoMainActivityPage();
            }
        });
    }
    private void taketoMainActivityPage() {
        Intent MainActivityIntent = new Intent(haveAGoodDay.this, (MainActivity.class));
        startActivity(MainActivityIntent);
    }
}