package com.example.k46f.calculaye;

import android.icu.text.DecimalFormat;
import android.icu.text.NumberFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button buttonSeven, buttonFour, buttonOne, buttonDot, buttonEight, buttonFive,
            buttonTwo, buttonZero, buttonNine, buttonSix, buttonThree, buttonEqual,
            buttonAdd, buttonSubtract, buttonMultiply, buttonDivision;

    private String operator;

    private EditText ayeProcess, ayeBack;

    private Double numberOne, numberTwo, result;

    private NumberFormat nf = new DecimalFormat("##.###");

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
        ayeProcess = (EditText) findViewById(R.id.ayeProcess);

        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ayeBack = (EditText)findViewById(R.id.ayeProcess);
                ayeProcess.setText(ayeBack.getText().toString() + "7");
            }
        });
        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ayeBack = (EditText)findViewById(R.id.ayeProcess);
                ayeProcess.setText(ayeBack.getText().toString() + "4");
            }
        });
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ayeBack = (EditText)findViewById(R.id.ayeProcess);
                ayeProcess.setText(ayeBack.getText().toString() + "1");
            }
        });
        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ayeBack = (EditText)findViewById(R.id.ayeProcess);
                ayeProcess.setText(ayeBack.getText().toString() + "8");
            }
        });
        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ayeBack = (EditText)findViewById(R.id.ayeProcess);
                ayeProcess.setText(ayeBack.getText().toString() + "5");
            }
        });
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ayeBack = (EditText)findViewById(R.id.ayeProcess);
                ayeProcess.setText(ayeBack.getText().toString() + "2");
            }
        });
        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ayeBack = (EditText)findViewById(R.id.ayeProcess);
                ayeProcess.setText(ayeBack.getText().toString() + "0");
            }
        });
        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ayeBack = (EditText)findViewById(R.id.ayeProcess);
                ayeProcess.setText(ayeBack.getText().toString() + "9");
            }
        });
        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ayeBack = (EditText)findViewById(R.id.ayeProcess);
                ayeProcess.setText(ayeBack.getText().toString() + "6");
            }
        });
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ayeBack = (EditText)findViewById(R.id.ayeProcess);
                ayeProcess.setText(ayeBack.getText().toString() + "3");
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ayeBack = (EditText)findViewById(R.id.ayeProcess);
                ayeProcess.setText(ayeBack.getText().toString() + ".");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "+";
                ayeBack = (EditText)findViewById(R.id.ayeProcess);
                numberOne = Double.parseDouble(ayeBack.getText().toString());
                ayeProcess.setHint(ayeBack.getText());
                ayeProcess.setText("");
            }
        });
        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "-";
                ayeBack = (EditText)findViewById(R.id.ayeProcess);
                numberOne = Double.parseDouble(ayeBack.getText().toString());
                ayeProcess.setHint(ayeBack.getText());
                ayeProcess.setText("");
            }
        });
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "x";
                ayeBack = (EditText)findViewById(R.id.ayeProcess);
                numberOne = Double.parseDouble(ayeBack.getText().toString());
                ayeProcess.setHint(ayeBack.getText());
                ayeProcess.setText("");
            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "/";
                ayeBack = (EditText)findViewById(R.id.ayeProcess);
                numberOne = Double.parseDouble(ayeBack.getText().toString());
                ayeProcess.setHint(ayeBack.getText());
                ayeProcess.setText("");
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ayeBack = (EditText)findViewById(R.id.ayeProcess);
                numberTwo = Double.parseDouble(ayeBack.getText().toString());
                if(operator.equals("+")){
                    ayeProcess.setText("");
                    result = numberOne + numberTwo;
                }
                if(operator.equals("-")){
                    ayeProcess.setText("");
                    result = numberOne - numberTwo;
                }
                if(operator.equals("x")){
                    ayeProcess.setText("");
                    result = numberOne * numberTwo;
                }
                if(operator.equals("/")){
                    ayeProcess.setText("");
                    if(numberTwo != 0){
                        result = numberOne / numberTwo;
                    }else {
                        ayeProcess.setText("Infinite");
                    }
                }
                ayeProcess.setText(String.valueOf(result));
            }
        });


    }
}
