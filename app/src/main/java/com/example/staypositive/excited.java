package com.example.staypositive;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class excited extends AppCompatActivity {

    private Button back13;
    private Button startOver15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excited);

        startOver15 = (Button) findViewById(R.id.startOver15);
        startOver15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketoMainActivityPage();
            }
        });

        back13 = (Button) findViewById(R.id.back13);
        back13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketogettingStartedPage();
            }
        });

    }

    private void taketoMainActivityPage(){
        Intent mainActivityIntent = new Intent(excited.this, (MainActivity.class));
        startActivity(mainActivityIntent);
    }

    private void taketogettingStartedPage(){
        Intent gettingStartedIntent = new Intent(excited.this, (gettingStarted.class));
        startActivity(gettingStartedIntent);
    }
}