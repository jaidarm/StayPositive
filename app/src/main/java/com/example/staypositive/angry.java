package com.example.staypositive;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class angry extends AppCompatActivity {

    private Button startOver10;
    private Button back8;
    private Button journal4;
    private Button selfcare3;
    private Button exercise4;

    private Button talkToSomeone4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angry);

        startOver10 = (Button) findViewById(R.id.startOver10);
        startOver10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketoMainActivityPage();
            }
        });

        back8 = (Button) findViewById(R.id.back8);
        back8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketogettingStartedPage();
            }
        });

        journal4 = (Button) findViewById(R.id.journal4);
        journal4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketojournalPage();
            }
        });
        selfcare3= (Button) findViewById(R.id.selfcare3);
        selfcare3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketoselfcarePage();
            }
        });
        exercise4 = (Button) findViewById(R.id.exercise4);
        exercise4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketoexercisePage();
            }
        });
        talkToSomeone4 = (Button) findViewById(R.id.talkToSomeone4);
        talkToSomeone4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketotalkToSomeonePage();
            }
        });
    }
    private void taketoMainActivityPage(){
        Intent mainActivityIntent = new Intent(angry.this, (MainActivity.class));
        startActivity(mainActivityIntent);
    }

    private void taketogettingStartedPage(){
        Intent gettingStartedIntent = new Intent(angry.this, (gettingStarted.class));
        startActivity(gettingStartedIntent);
    }
    private void taketojournalPage(){
        Intent journalIntent = new Intent(angry.this, (journal.class));
        startActivity(journalIntent);
    }
    private void taketoselfcarePage(){
        Intent selfcareIntent = new Intent(angry.this, (selfcare.class));
        startActivity(selfcareIntent);
    }
    private void taketoexercisePage(){
        Intent exerciseIntent = new Intent(angry.this, (exercise.class));
        startActivity(exerciseIntent);
    }
    private void taketotalkToSomeonePage(){
        Intent talkToSomeoneIntent = new Intent(angry.this, (talkToSomeone.class));
        startActivity(talkToSomeoneIntent);
    }
}