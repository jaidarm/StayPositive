package com.example.staypositive;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class tired extends AppCompatActivity {

    private Button back14;
    private Button startOver16;
    private Button journal8;
    private Button selfcare6;
    private Button exercise7;
    private Button talkToSomeone7;
    private Button adventure3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tired);

        startOver16 = (Button) findViewById(R.id.startOver16);
        startOver16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketoMainActivityPage();
            }
        });

        back14 = (Button) findViewById(R.id.back14);
        back14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketogettingStartedPage();
            }
        });

        journal8 = (Button) findViewById(R.id.journal8);
        journal8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketojournalPage();
            }
        });
        selfcare6 = (Button) findViewById(R.id.selfcare6);
        selfcare6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketoselfcarePage();
            }
        });
        exercise7 = (Button) findViewById(R.id.exercise7);
        exercise7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketoexercisePage();
            }
        });
        talkToSomeone7 = (Button) findViewById(R.id.talkToSomeone7);
        talkToSomeone7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketotalkToSomeonePage();
            }
        });
        adventure3 = (Button) findViewById(R.id.adventure3);
        adventure3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketoadventurePage();
            }
        });
    }
    private void taketoMainActivityPage(){
        Intent mainActivityIntent = new Intent(tired.this, (MainActivity.class));
        startActivity(mainActivityIntent);
    }

    private void taketogettingStartedPage(){
        Intent gettingStartedIntent = new Intent(tired.this, (gettingStarted.class));
        startActivity(gettingStartedIntent);
    }
    private void taketojournalPage(){
        Intent journalIntent = new Intent(tired.this, (journal.class));
        startActivity(journalIntent);
    }
    private void taketoselfcarePage(){
        Intent selfcareIntent = new Intent(tired.this, (selfcare.class));
        startActivity(selfcareIntent);
    }
    private void taketoexercisePage(){
        Intent exerciseIntent = new Intent(tired.this, (exercise.class));
        startActivity(exerciseIntent);
    }
    private void taketotalkToSomeonePage(){
        Intent talkToSomeoneIntent = new Intent(tired.this, (talkToSomeone.class));
        startActivity(talkToSomeoneIntent);
    }
    private void taketoadventurePage(){
        Intent adventureIntent = new Intent(tired.this, (adventure.class));
        startActivity(adventureIntent);
    }
}