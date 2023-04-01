package com.example.staypositive;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
public class journal extends AppCompatActivity {

    private Button back2;

    private Button startOver3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journal);

        back2 = (Button) findViewById(R.id.back2);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taketohappyPage();
            }
        });

        startOver3 = (Button) findViewById(R.id.startOver3);
        startOver3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taketoMainActivityPage();
            }
        });
    }
        private void taketohappyPage(){
            Intent happyIntent = new Intent(journal.this, (happy.class));
            startActivity(happyIntent);
    }
         private void taketoMainActivityPage(){
            Intent MainActivityIntent = new Intent(journal.this, (MainActivity.class));
            startActivity(MainActivityIntent);
         }
}