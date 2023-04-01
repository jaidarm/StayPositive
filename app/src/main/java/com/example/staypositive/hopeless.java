package com.example.staypositive;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class hopeless extends AppCompatActivity {

    private Button back12;
    private Button startOver14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hopeless);

        startOver14 = (Button) findViewById(R.id.startOver14);
        startOver14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketoMainActivityPage();
            }
        });

        back12 = (Button) findViewById(R.id.back12);
        back12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                taketogettingStartedPage();
            }
        });
    }

    private void taketoMainActivityPage(){
        Intent mainActivityIntent = new Intent(hopeless.this, (MainActivity.class));
        startActivity(mainActivityIntent);
    }

    private void taketogettingStartedPage(){
        Intent gettingStartedIntent = new Intent(hopeless.this, (gettingStarted.class));
        startActivity(gettingStartedIntent);
    }
}