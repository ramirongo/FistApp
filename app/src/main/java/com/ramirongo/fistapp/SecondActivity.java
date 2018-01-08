package com.ramirongo.fistapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class SecondActivity extends AppCompatActivity {

    ToggleButton tg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tg = (ToggleButton)findViewById(R.id.toggleButton);
        tg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(b){
                    Toast.makeText(SecondActivity.this, "ON", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(SecondActivity.this, "OFF", Toast.LENGTH_SHORT).show();
                }

            }
        });

        final TextView textView = (TextView)findViewById(R.id.textView3);
        final EditText editText = (EditText)findViewById(R.id.editText);
        Button button = (Button)findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String etString = editText.getText().toString();
                textView.setText(etString);
            }
        });
    }
}

//https://www.youtube.com/watch?v=zhd2Ye9FMdw&index=11&list=PLM8gmU39ZoDeWWtDFxNM2N-2N9CtGum_E
