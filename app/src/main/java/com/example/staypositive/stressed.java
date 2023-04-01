package com.example.staypositive;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class stressed extends AppCompatActivity {

    private Button startOver11;
    private Button back9;
    private Button journal5;
    private Button selfcare4;
    private Button exercise5;
    private Button talkToSomeone5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stressed);

        startOver11 = (Button) findViewById(R.id.startOver11);
        startOver11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketoMainActivityPage();
            }
        });

        back9 = (Button) findViewById(R.id.back9);
        back9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketogettingStartedPage();
            }
        });

        journal5 = (Button) findViewById(R.id.journal5);
        journal5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketojournalPage();
            }
        });
        selfcare4= (Button) findViewById(R.id.selfcare4);
        selfcare4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketoselfcarePage();
            }
        });
        exercise5 = (Button) findViewById(R.id.exercise5);
        exercise5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketoexercisePage();
            }
        });
        talkToSomeone5 = (Button) findViewById(R.id.talkToSomeone5);
        talkToSomeone5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketotalkToSomeonePage();
            }
        });
    }
    private void taketoMainActivityPage(){
        Intent mainActivityIntent = new Intent(stressed.this, (MainActivity.class));
        startActivity(mainActivityIntent);
    }

    private void taketogettingStartedPage(){
        Intent gettingStartedIntent = new Intent(stressed.this, (gettingStarted.class));
        startActivity(gettingStartedIntent);
    }
    private void taketojournalPage(){
        Intent journalIntent = new Intent(stressed.this, (journal.class));
        startActivity(journalIntent);
    }
    private void taketoselfcarePage(){
        Intent selfcareIntent = new Intent(stressed.this, (selfcare.class));
        startActivity(selfcareIntent);
    }
    private void taketoexercisePage(){
        Intent exerciseIntent = new Intent(stressed.this, (exercise.class));
        startActivity(exerciseIntent);
    }
    private void taketotalkToSomeonePage(){
        Intent talkToSomeoneIntent = new Intent(stressed.this, (talkToSomeone.class));
        startActivity(talkToSomeoneIntent);
    }
}