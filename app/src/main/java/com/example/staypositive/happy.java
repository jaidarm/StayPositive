package com.example.staypositive;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class happy extends AppCompatActivity {

    private Button startOver2;
    private Button back;
    private Button journal;
    private Button selfcare;
    private Button exercise;
    private Button talkToSomeone;
    private Button adventure;

    private Button haveAGoodDay;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy);

        startOver2 = (Button) findViewById(R.id.startOver2);
        startOver2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketoMainActivityPage();
            }
        });

        back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketogettingStartedPage();
            }
        });

        journal = (Button) findViewById(R.id.journal);
        journal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketojournalPage();
            }
        });
        selfcare = (Button) findViewById(R.id.selfcare);
        selfcare.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketoselfcarePage();
            }
        });
        exercise = (Button) findViewById(R.id.exercise);
        exercise.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketoexercisePage();
            }
        });
        talkToSomeone = (Button) findViewById(R.id.talkToSomeone);
        talkToSomeone.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketotalkToSomeonePage();
            }
        });
        adventure = (Button) findViewById(R.id.adventure);
        adventure.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketoadventurePage();
            }
        });
        haveAGoodDay = (Button) findViewById(R.id.haveAGoodDay);
        haveAGoodDay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketohaveAGoodDayPage();
            }
        });
    }

    private void taketoMainActivityPage(){
        Intent mainActivityIntent = new Intent(happy.this, (MainActivity.class));
        startActivity(mainActivityIntent);
    }

    private void taketogettingStartedPage(){
        Intent gettingStartedIntent = new Intent(happy.this, (gettingStarted.class));
        startActivity(gettingStartedIntent);
    }
    private void taketojournalPage(){
        Intent journalIntent = new Intent(happy.this, (journal.class));
        startActivity(journalIntent);
    }
    private void taketoselfcarePage(){
        Intent selfcareIntent = new Intent(happy.this, (selfcare.class));
        startActivity(selfcareIntent);
    }
    private void taketoexercisePage(){
        Intent exerciseIntent = new Intent(happy.this, (exercise.class));
        startActivity(exerciseIntent);
    }
    private void taketotalkToSomeonePage(){
        Intent talkToSomeoneIntent = new Intent(happy.this, (talkToSomeone.class));
        startActivity(talkToSomeoneIntent);
    }
    private void taketoadventurePage(){
        Intent adventureIntent = new Intent(happy.this, (adventure.class));
        startActivity(adventureIntent);
    }
    private void taketohaveAGoodDayPage(){
        Intent haveAGoodDayIntent = new Intent(happy.this, (haveAGoodDay.class));
        startActivity(haveAGoodDayIntent);
    }
}