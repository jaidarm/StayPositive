package com.example.staypositive;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class anxious extends AppCompatActivity {

    private Button startOver12;
    private Button back10;
    private Button journal6;
    private Button selfcare5;
    private Button exercise6;
    private Button talkToSomeone6;
    private Button mechanisms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anxious);
        startOver12 = (Button) findViewById(R.id.startOver12);
        startOver12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketoMainActivityPage();
            }
        });

        back10 = (Button) findViewById(R.id.back10);
        back10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketogettingStartedPage();
            }
        });

        journal6 = (Button) findViewById(R.id.journal6);
        journal6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketojournalPage();
            }
        });
        selfcare5= (Button) findViewById(R.id.selfcare5);
        selfcare5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketoselfcarePage();
            }
        });
        exercise6 = (Button) findViewById(R.id.exercise6);
        exercise6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketoexercisePage();
            }
        });
        talkToSomeone6 = (Button) findViewById(R.id.talkToSomeone6);
        talkToSomeone6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketotalkToSomeonePage();
            }
        });

        mechanisms = (Button) findViewById(R.id.mechanisms);
        mechanisms.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {taketomechanismsPage();
            }
        });
    }
    private void taketoMainActivityPage(){
        Intent mainActivityIntent = new Intent(anxious.this, (MainActivity.class));
        startActivity(mainActivityIntent);
    }

    private void taketogettingStartedPage(){
        Intent gettingStartedIntent = new Intent(anxious.this, (gettingStarted.class));
        startActivity(gettingStartedIntent);
    }
    private void taketojournalPage(){
        Intent journalIntent = new Intent(anxious.this, (journal.class));
        startActivity(journalIntent);
    }
    private void taketoselfcarePage(){
        Intent selfcareIntent = new Intent(anxious.this, (selfcare.class));
        startActivity(selfcareIntent);
    }
    private void taketoexercisePage(){
        Intent exerciseIntent = new Intent(anxious.this, (exercise.class));
        startActivity(exerciseIntent);
    }
    private void taketotalkToSomeonePage(){
        Intent talkToSomeoneIntent = new Intent(anxious.this, (talkToSomeone.class));
        startActivity(talkToSomeoneIntent);
    }
    private void taketomechanismsPage(){
        Intent mechanismsIntent = new Intent(anxious.this, (mechanisms.class));
        startActivity(mechanismsIntent);
    }
}