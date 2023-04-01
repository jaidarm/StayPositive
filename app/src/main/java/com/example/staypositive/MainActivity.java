package com.example.staypositive;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    private Button gettingStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gettingStarted = (Button) findViewById(R.id.button);
        gettingStarted.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                takeToEnglish1Page();
            }
        });
    }
    private void takeToEnglish1Page(){
        Intent gettingStartedIntent = new Intent(MainActivity.this, (gettingStarted.class));
        startActivity(gettingStartedIntent);
    }

}