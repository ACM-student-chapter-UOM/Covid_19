package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button done = findViewById(R.id.submit_button);
        
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Done button is clicked", Toast.LENGTH_SHORT).show();

                Intent next = new Intent(MainActivity.this, PhoneNumberActivity.class);
                startActivity(next);
            }
        });
        

    }
}
