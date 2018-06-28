package com.example.sanket.trailintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {

    TextView idTxt3;
    Button idBtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        idTxt3=(TextView)findViewById(R.id.idTxt3);
        idBtn4=(Button)findViewById(R.id.idBtn4);

        String name=getIntent().getStringExtra("casualInfo2");
        idTxt3.setText("Welcome to Activity 3, "+name);



        idBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity3.this, "Activity 3", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
