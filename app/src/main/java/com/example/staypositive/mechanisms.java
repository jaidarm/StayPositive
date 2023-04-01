package com.example.staypositive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class mechanisms extends AppCompatActivity {

    private Button journal7;
    private Button back11;
    private Button startOver13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanisms);

        startOver13 = (Button) findViewById(R.id.startOver13);
        startOver13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketoMainActivityPage();
            }
        });

        back11 = (Button) findViewById(R.id.back11);
        back11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketogettingStartedPage();
            }
        });

        journal7 = (Button) findViewById(R.id.journal7);
        journal7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketojournalPage();
            }
        });
    }
    private void taketoMainActivityPage(){
        Intent mainActivityIntent = new Intent(mechanisms.this, (MainActivity.class));
        startActivity(mainActivityIntent);
    }

    private void taketogettingStartedPage(){
        Intent gettingStartedIntent = new Intent(mechanisms.this, (gettingStarted.class));
        startActivity(gettingStartedIntent);
    }
    private void taketojournalPage(){
        Intent journalIntent = new Intent(mechanisms.this, (journal.class));
        startActivity(journalIntent);
    }

}