package com.ramirongo.fistapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bt1,bt2,bt3;

    String myText = "Bienvenido";
    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = (Button)findViewById(R.id.button);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Entrando a la segunda actividad",Toast.LENGTH_LONG).show();

                Intent myIntent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(myIntent);

            }
        });

        myTextView = (TextView)findViewById(R.id.textView2);
        myTextView.setText(myText);

        callingSecondButton();
        callingThirdButton();
        callingFourthButton();
    }

    public void callingSecondButton(){
        bt2 = (Button)findViewById(R.id.button3);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this,thirdActivity.class);
                startActivity(myIntent);

            }
        });
    }

    public void callingThirdButton(){
        bt3 = (Button)findViewById(R.id.button4);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this,FourthActivity.class);
                startActivity(myIntent);

            }
        });
    }

    public void callingFourthButton(){
        bt3 = (Button)findViewById(R.id.button5);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this,FifthActivity.class);
                startActivity(myIntent);

            }
        });
    }
}

//https://www.youtube.com/watch?v=siUQzchtOEI&index=14&list=PLM8gmU39ZoDeWWtDFxNM2N-2N9CtGum_E


