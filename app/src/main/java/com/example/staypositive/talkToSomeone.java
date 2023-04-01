package com.example.staypositive;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
public class talkToSomeone extends AppCompatActivity {

    private Button back5;

    private Button startOver6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talk_to_someone);

        back5 = (Button) findViewById(R.id.back5);
        back5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taketohappyPage();
            }
        });
        startOver6 = (Button) findViewById(R.id.startOver6);
        startOver6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taketoMainActivityPage();
            }
        });

    }
    private void taketohappyPage() {
        Intent happyIntent = new Intent(talkToSomeone.this, (happy.class));
        startActivity(happyIntent);
    }
    private void taketoMainActivityPage() {
        Intent MainActivityIntent = new Intent(talkToSomeone.this, (MainActivity.class));
        startActivity(MainActivityIntent);
    }
}