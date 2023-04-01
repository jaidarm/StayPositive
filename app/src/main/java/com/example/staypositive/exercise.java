package com.example.staypositive;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class exercise extends AppCompatActivity {

    private Button back4;

    private Button startOver5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        back4 = (Button) findViewById(R.id.back4);
        back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taketohappyPage();
            }
        });
        startOver5 = (Button) findViewById(R.id.startOver5);
        startOver5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taketoMainActivityPage();
            }
        });
    }
    private void taketohappyPage() {
        Intent happyIntent = new Intent(exercise.this, (happy.class));
        startActivity(happyIntent);
    }
    private void taketoMainActivityPage() {
        Intent MainActivityIntent = new Intent(exercise.this, (MainActivity.class));
        startActivity(MainActivityIntent);
    }
}