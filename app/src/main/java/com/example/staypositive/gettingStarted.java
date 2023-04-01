package com.example.staypositive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gettingStarted extends AppCompatActivity {

    private Button startOver;
    private Button happy;
    private Button sad;
    private Button angry;
    private Button stressed;
    private Button anxious;
    private Button excited;
    private Button tired;
    private Button hopeless;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getting_started);

        startOver = (Button) findViewById(R.id.startOver);
        startOver.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketoMainActivityPage();
            }
        });

        happy = (Button) findViewById(R.id.happy);
        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { taketohappyPage();}
        });

        sad = (Button) findViewById(R.id.sad);
        sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { taketosadPage();}
        });
        angry = (Button) findViewById(R.id.angry);
        angry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { taketoangryPage();}
        });
        stressed = (Button) findViewById(R.id.stressed);
        stressed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { taketostressedPage();}
        });
        anxious = (Button) findViewById(R.id.anxious);
        anxious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { taketoanxiousPage();}
        });
        excited = (Button) findViewById(R.id.excited);
        excited.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { taketoexcitedPage();}
        });
        tired = (Button) findViewById(R.id.tired);
        tired.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { taketotiredPage();}
        });
        hopeless = (Button) findViewById(R.id.hopeless);
        hopeless.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {taketohopelessPage();}
        });
    }
    private void taketoMainActivityPage(){
        Intent mainActivityIntent = new Intent(gettingStarted.this, (MainActivity.class));
        startActivity(mainActivityIntent);
    }

    private void taketohappyPage(){
        Intent happyIntent = new Intent(gettingStarted.this, (happy.class));
        startActivity(happyIntent);
    }
    private void taketosadPage(){
        Intent sadIntent = new Intent(gettingStarted.this, (sad.class));
        startActivity(sadIntent);
    }
    private void taketoangryPage(){
        Intent angryIntent = new Intent(gettingStarted.this, (angry.class));
        startActivity(angryIntent);
    }
    private void taketostressedPage(){
        Intent stressedIntent = new Intent(gettingStarted.this, (stressed.class));
        startActivity(stressedIntent);
    }
    private void taketoanxiousPage(){
        Intent anxiousIntent = new Intent(gettingStarted.this, (anxious.class));
        startActivity(anxiousIntent);
    }
    private void taketoexcitedPage(){
        Intent excitedIntent = new Intent(gettingStarted.this, (excited.class));
        startActivity(excitedIntent);
    }
    private void taketotiredPage(){
        Intent tiredIntent = new Intent(gettingStarted.this, (tired.class));
        startActivity(tiredIntent);
    }
    private void taketohopelessPage(){
        Intent hopelessIntent = new Intent(gettingStarted.this, (hopeless.class));
        startActivity(hopelessIntent);
    }
}