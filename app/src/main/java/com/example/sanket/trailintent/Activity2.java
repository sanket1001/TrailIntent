package com.example.sanket.trailintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Activity2 extends AppCompatActivity {

    TextView idTxt2;
    Button idBtn3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        idTxt2=(TextView) findViewById(R.id.idTxt2);
        idBtn3=(Button) findViewById(R.id.idBtn3);

        String name=getIntent().getStringExtra("casualInfo");
        idTxt2.setText("Welcome to Activity 2, "+name);

        idBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity2.this, "Activity 2", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
