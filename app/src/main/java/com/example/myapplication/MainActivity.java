package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText e;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b= findViewById(R.id.button);
        e= findViewById(R.id.editTextNumber);
        t= findViewById(R.id.textView3);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ne = e.getText().toString();
                if(TextUtils.isEmpty(ne))
                {
                    Toast.makeText(MainActivity.this, "Please Enter a Number ..", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int f = Integer.parseInt(ne);
                    String table="";
                    for(int i=1;i<=10;i++)
                    {
                        table += f + " * " + i + " = " + f * i + "\n";
                        //t.setText(f + " * " + i + " = " + f*i );
                        //t.setText("\n");
                    }
                    t.setText(table);
                }
            }
        });


    }
}