package com.example.k46f.calculaye;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button buttonSeven, buttonFour, buttonOne, buttonDot, buttonEight, buttonFive,
            buttonTwo, buttonZero, buttonNine, buttonSix, buttonThree, buttonEqual,
            buttonAdd, buttonSubtract, buttonMultiply, buttonDivision;

    private String operator;

    private EditText ayeProcess, ayeBack ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            buttonSeven = (Button) findViewById(R.id.buttonSeven);
            buttonFour = (Button) findViewById(R.id.buttonFour);
            buttonOne = (Button) findViewById(R.id.buttonOne);
            buttonDot = (Button) findViewById(R.id.buttonDot);
            buttonEight = (Button) findViewById(R.id.buttonEight);
            buttonFive = (Button) findViewById(R.id.buttonFive);
            buttonTwo = (Button) findViewById(R.id.buttonTwo);
            buttonZero = (Button) findViewById(R.id.buttonZero);
            buttonNine = (Button) findViewById(R.id.buttonNine);
            buttonSix = (Button) findViewById(R.id.buttonSix);
            buttonThree = (Button) findViewById(R.id.buttonThree);
            buttonEqual = (Button) findViewById(R.id.buttonEqual);
            buttonAdd = (Button) findViewById(R.id.buttonAdd);
            buttonSubtract = (Button) findViewById(R.id.buttonSubtract);
            buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
            buttonDivision = (Button) findViewById(R.id.buttonDivision);


    }
}
