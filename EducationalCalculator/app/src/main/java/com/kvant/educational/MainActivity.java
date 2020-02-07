package com.kvant.educational;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    char operation = '+';
    double oldSum = 0;
    TextView Resulter;

    // double = Double.parseDouble(String), int = Integer.parseInt(String), String = String.valueOf(int or double)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resulter = (TextView)findViewById(R.id.Resulter);
    }

    public void onOperation(View view){
        oldSum = Double.parseDouble(Resulter.getText().toString());
        operation = ((Button) view).getText().charAt(0);
        Resulter.setText("");

    }

    public void onNumber(View view){
        Resulter.append(((Button)view).getText());
    }

    public void onResult(View view){
        if(operation == '+')
            oldSum+=Double.parseDouble(Resulter.getText().toString());
        if(operation == '-')
            oldSum-=Double.parseDouble(Resulter.getText().toString());
        if(operation == '*')
            oldSum*=Double.parseDouble(Resulter.getText().toString());
        if(operation == '/')
            oldSum/=Double.parseDouble(Resulter.getText().toString());

        Resulter.setText(String.valueOf(oldSum));
    }
}
