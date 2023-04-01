package com.example.staypositive;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class sad extends AppCompatActivity {

    private Button startOver9;
    private Button back7;
    private Button journal3;
    private Button selfcare2;
    private Button exercise3;
    private Button talkToSomeone3;
    private Button hopeless2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sad);

        startOver9 = (Button) findViewById(R.id.startOver9);
        startOver9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketoMainActivityPage();
            }
        });

        back7 = (Button) findViewById(R.id.back7);
        back7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketogettingStartedPage();
            }
        });

        journal3 = (Button) findViewById(R.id.journal3);
        journal3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketojournalPage();
            }
        });
        selfcare2 = (Button) findViewById(R.id.selfcare2);
        selfcare2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketoselfcarePage();
            }
        });
        exercise3 = (Button) findViewById(R.id.exercise3);
        exercise3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketoexercisePage();
            }
        });
        talkToSomeone3 = (Button) findViewById(R.id.talkToSomeone3);
        talkToSomeone3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketotalkToSomeonePage();
            }
        });
        hopeless2 = (Button) findViewById(R.id.hopeless2);
        hopeless2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketohopelessPage();
            }
        });
    }

    private void taketoMainActivityPage(){
        Intent mainActivityIntent = new Intent(sad.this, (MainActivity.class));
        startActivity(mainActivityIntent);
    }

    private void taketogettingStartedPage(){
        Intent gettingStartedIntent = new Intent(sad.this, (gettingStarted.class));
        startActivity(gettingStartedIntent);
    }
    private void taketojournalPage(){
        Intent journalIntent = new Intent(sad.this, (journal.class));
        startActivity(journalIntent);
    }
    private void taketoselfcarePage(){
        Intent selfcareIntent = new Intent(sad.this, (selfcare.class));
        startActivity(selfcareIntent);
    }
    private void taketoexercisePage(){
        Intent exerciseIntent = new Intent(sad.this, (exercise.class));
        startActivity(exerciseIntent);
    }
    private void taketotalkToSomeonePage(){
        Intent talkToSomeoneIntent = new Intent(sad.this, (talkToSomeone.class));
        startActivity(talkToSomeoneIntent);
    }
    private void taketohopelessPage(){
        Intent hopelessIntent = new Intent(sad.this, (hopeless.class));
        startActivity(hopelessIntent);
    }
}