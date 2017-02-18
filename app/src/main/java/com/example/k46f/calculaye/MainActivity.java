package com.example.k46f.calculaye;

import android.content.Context;
import android.icu.text.DecimalFormat;
import android.icu.text.NumberFormat;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    final String LOG_TAG = ">>>>>> Calculator";

    private Button buttonSeven, buttonFour, buttonOne, buttonDot, buttonEight, buttonFive,
            buttonTwo, buttonZero, buttonNine, buttonSix, buttonThree, buttonEqual,
            buttonAdd, buttonSubtract, buttonMultiply, buttonDivision, buttonClear, buttonRoot,
            buttonSin, buttonCos, buttonTan, buttonFact, buttonMod;

    private String operator;

    private EditText ayeProcess, ayeBack;

    private Double result;

    private Double numberOne = 0.0;
    private Double numberTwo = 0.0;

    private Double fact =1.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Preguntar
        final MediaPlayer ayeSr = MediaPlayer.create(this, R.raw.ayesound);

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
        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonRoot = (Button) findViewById(R.id.buttonRoot);
        buttonSin = (Button) findViewById(R.id.buttonSin);
        buttonCos = (Button) findViewById(R.id.buttonCos);
        buttonTan = (Button) findViewById(R.id.buttonTan);
        buttonFact = (Button) findViewById(R.id.buttonFact);
        buttonMod = (Button) findViewById(R.id.buttonMod);
        ayeProcess = (EditText) findViewById(R.id.ayeProcess);

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ayeProcess.setText("");
                ayeProcess.setHint("0");
            }
        });

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
        buttonMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                operator ="mod";
                ayeBack = (EditText)findViewById(R.id.ayeProcess);
                numberOne = Double.parseDouble(ayeBack.getText().toString());
                ayeProcess.setHint(ayeBack.getText());
                ayeProcess.setText("");
            }
        });
        buttonRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Double.parseDouble(ayeProcess.getText().toString());
                result = Math.sqrt(result);
                ayeProcess.setText(String.valueOf(result));
            }
        });
        buttonSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Double.parseDouble(ayeProcess.getText().toString());
                result = Math.sin(result);
                ayeProcess.setText(String.valueOf(result));
            }
        });
        buttonCos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                result = Double.parseDouble(ayeProcess.getText().toString());
                result = Math.cos(result);
                ayeProcess.setText(String.valueOf(result));
            }
        });
        buttonTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Double.parseDouble(ayeProcess.getText().toString());
                result = Math.tan(result);
                ayeProcess.setText(String.valueOf(result));
            }
        });
        buttonFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Double.parseDouble(ayeProcess.getText().toString());
                for (Double i =1.0; i <= result; i++) {
                    fact *=i;
                }
                ayeProcess.setText(String.valueOf(fact));
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ayeSr.start();
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
                if (operator.equals("mod")){
                    ayeProcess.setText("");
                    result = numberOne % numberTwo;
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
