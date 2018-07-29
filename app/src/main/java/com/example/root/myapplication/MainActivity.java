package com.example.root.myapplication;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    EditText etn1;
    EditText etn2;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(),  " Prashant sinha welcomes you. ", Toast.LENGTH_LONG).show();

    etn1=(EditText) findViewById(R.id.edit1);
    etn2=(EditText) findViewById(R.id.edit2);
    res=(TextView) findViewById(R.id.result);
Button bt=(Button) findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      float n1 = Float.parseFloat(etn1.getText().toString());
                                      float n2 = Float.parseFloat(etn2.getText().toString());
                                      float add = n1 + n2;
                                      res.setText(String.valueOf(add));

                                  }
                              });
        Button sub=(Button) findViewById(R.id.button2);
        sub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float n1 = Float.parseFloat(etn1.getText().toString());
                float n2 = Float.parseFloat(etn2.getText().toString());
                float sub = n1 - n2;
                res.setText(String.valueOf(sub));

            }
        });

        Button mul=(Button) findViewById(R.id.button3);
        mul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float n1 = Float.parseFloat(etn1.getText().toString());
                float n2 = Float.parseFloat(etn2.getText().toString());
                float mul = n1 * n2;
                res.setText(String.valueOf(mul));

            }
        });

        Button div=(Button) findViewById(R.id.button4);
        div.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float n1 = Float.parseFloat(etn1.getText().toString());
                float n2 = Float.parseFloat(etn2.getText().toString());
                if(n2==0){
                    Toast.makeText(getApplicationContext(),  " Undefined or Infinity", Toast.LENGTH_LONG).show();
                }else {
                    float div = n1 / n2;
                    res.setText(String.valueOf(div));
                }

            }
        });
        FloatingActionButton fab=(FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),  " Prashant sinha welcomes you. ", Toast.LENGTH_LONG).show();
            }

        });



    }
}
