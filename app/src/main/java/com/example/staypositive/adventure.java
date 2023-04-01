package com.example.staypositive;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class adventure extends AppCompatActivity {

    private Button back6;
    private Button startOver8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure);

        back6 = (Button) findViewById(R.id.back6);
        back6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taketohappyPage();
            }
        });
        startOver8 = (Button) findViewById(R.id.startOver8);
        startOver8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taketoMainActivityPage();
            }
        });
    }
    private void taketohappyPage() {
        Intent happyIntent = new Intent(adventure.this, (happy.class));
        startActivity(happyIntent);
    }
    private void taketoMainActivityPage() {
        Intent MainActivityIntent = new Intent(adventure.this, (MainActivity.class));
        startActivity(MainActivityIntent);
    }

}