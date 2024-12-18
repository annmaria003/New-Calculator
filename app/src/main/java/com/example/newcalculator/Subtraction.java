package com.example.newcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Subtraction extends AppCompatActivity {

    EditText es1,es2;
    Button bs1,bs2;
    String getNm1,getNm2,result;
    int Nm1,Nm2,difference;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_subtraction);

        es1=(EditText) findViewById(R.id.num1);
        es2=(EditText) findViewById(R.id.num2);
        bs1=(Button) findViewById(R.id.subtraction);
        bs2=(Button) findViewById(R.id.BTL2);
        tv=(TextView) findViewById(R.id.resToDisp1);

        bs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNm1=es1.getText().toString();
                getNm2=es2.getText().toString();
                Nm1=Integer.parseInt(getNm1);
                Nm2=Integer.parseInt(getNm2);

                difference=Nm1-Nm2;
                result=String.valueOf(difference);
                tv.setText(result);

                System.out.println();
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });

        bs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obs2=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(obs2);
            }
        });


    }
}