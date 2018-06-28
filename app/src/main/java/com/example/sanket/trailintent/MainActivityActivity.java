package com.example.sanket.trailintent;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityActivity extends AppCompatActivity {

    EditText et1;
    Button btn1,btn2;
    TextView idTxt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        et1=(EditText) findViewById(R.id.etBox1);
        btn1=(Button) findViewById(R.id.idBtn1);
        btn2=(Button) findViewById(R.id.idBtn2);
        idTxt1=(TextView) findViewById(R.id.idTxt1);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name=et1.getText().toString().trim();
                Toast.makeText(MainActivityActivity.this, "Activity 2 Btn", Toast.LENGTH_SHORT).show();
                Intent intent1=new Intent(MainActivityActivity.this, com.example.sanket.trailintent.Activity2.class);
                intent1.putExtra("casualInfo",name);
                startActivity(intent1);
                Toast.makeText(MainActivityActivity.this,"Hey made some changes!", Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name=et1.getText().toString().trim();
                Toast.makeText(MainActivityActivity.this, "Activity 3 Btn", Toast.LENGTH_SHORT ).show();
                Intent intent2=new Intent(MainActivityActivity.this, com.example.sanket.trailintent.Activity3.class);
                intent2.putExtra("casualInfo2",name);
                startActivity(intent2);
            }
        });
    }
}
