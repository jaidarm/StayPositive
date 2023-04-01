package com.example.staypositive;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
public class selfcare extends AppCompatActivity {

    private Button back3;
    private Button startOver4;
    private Button journal2;
    private Button exercise2;
    private Button talkToSomeone2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selfcare);

        back3 = (Button) findViewById(R.id.back3);
        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taketohappyPage();
            }
        });
        startOver4 = (Button) findViewById(R.id.startOver4);
        startOver4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taketoMainActivityPage();
            }
        });
        journal2 = (Button) findViewById(R.id.journal2);
        journal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taketojournalPage();
            }
        });
        exercise2 = (Button) findViewById(R.id.exercise2);
        exercise2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taketoexercisePage();
            }
        });
        talkToSomeone2 = (Button) findViewById(R.id.talkToSomeone2);
        talkToSomeone2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taketotalkToSomeonePage();
            }
        });
    }
    private void taketohappyPage() {
        Intent happyIntent = new Intent(selfcare.this, (happy.class));
        startActivity(happyIntent);
    }
    private void taketoMainActivityPage() {
        Intent MainActivityIntent = new Intent(selfcare.this, (MainActivity.class));
        startActivity(MainActivityIntent);
    }
    private void taketojournalPage() {
        Intent journalIntent = new Intent(selfcare.this, (journal.class));
        startActivity(journalIntent);
    }
    private void taketoexercisePage() {
        Intent exerciseIntent = new Intent(selfcare.this, (exercise.class));
        startActivity(exerciseIntent);
    }
    private void taketotalkToSomeonePage() {
        Intent talkToSomeoneIntent = new Intent(selfcare.this, (talkToSomeone.class));
        startActivity(talkToSomeoneIntent);
    }
}