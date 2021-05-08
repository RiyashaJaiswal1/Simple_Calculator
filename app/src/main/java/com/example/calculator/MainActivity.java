package com.example.calculator;







import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button ADD,SUB,MUL,DIV;
    TextView TV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        ADD=findViewById(R.id.ADD);
        SUB=findViewById(R.id.SUB);
        MUL=findViewById(R.id.MUL);
        DIV=findViewById(R.id.DIV);
        TV=findViewById(R.id.TV);
        ADD.setOnClickListener(view -> {

                    int f,s,a;
                    f=Integer.parseInt(et1.getText().toString());
                    s=Integer.parseInt(et2.getText().toString());
                    a=f+s;
                    TV.setText("RESULT=" +a);

                }
        );

        SUB.setOnClickListener(view -> {

                    int f,s,a;
                    f=Integer.parseInt(et1.getText().toString());
                    s=Integer.parseInt(et2.getText().toString());
                    a=f-s;
                    TV.setText("RESULT=" +a);

                }
        );

        MUL.setOnClickListener(view -> {

                    int f,s,a;
                    f=Integer.parseInt(et1.getText().toString());
                    s=Integer.parseInt(et2.getText().toString());
                    a=f*s;
                    TV.setText("RESULT=" +a);

                }
        );

        DIV.setOnClickListener(view -> {

                    int f,s,a;
                    f=Integer.parseInt(et1.getText().toString());
                    s=Integer.parseInt(et2.getText().toString());
                    a=f/s;
                    TV.setText("RESULT=" +a);

                }
        );
    }
}