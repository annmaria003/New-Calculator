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

public class Addition extends AppCompatActivity {

    EditText ea1,ea2;
    Button ba1,ba2;
    String getNum1,getNum2,result;
    int Num1,Num2,sum;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addition);

        ea1=(EditText) findViewById(R.id.num1);
        ea2=(EditText) findViewById(R.id.num2);

        ba1=(Button) findViewById(R.id.addition);
        ba2=(Button) findViewById(R.id.back1);

        tv=(TextView) findViewById(R.id.resToDisp);

        ba1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getNum1=ea1.getText().toString();
                getNum2=ea2.getText().toString();
                Num1=Integer.parseInt(getNum1);
                Num2=Integer.parseInt(getNum2);

                sum=Num1+Num2;

                result=String.valueOf(sum);

                tv.setText(result);

                System.out.println();
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });

        ba2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oba2=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(oba2);
            }
        });


    }
}