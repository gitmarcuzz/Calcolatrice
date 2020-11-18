package com.example.calcolatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {

        private Button zero;
        private Button one;
        private Button two;
        private Button three;
        private Button four;
        private Button five;
        private Button six;
        private Button seven;
        private Button eight;
        private Button nine;
        private Button add;
        private Button meno;
        private Button div;
        private Button per;
        private Button uguale;
        private Button clear;
        private TextView display;
        private TextView result;
        private final char ADDITION = '+';
        private final char SUBTRACTION = '-';
        private final char MULTIPLICATION = '*';
        private final char DIVISION = '/';
        private final char EQU = 0;
        private double val1 = Double.NaN;
        private double val2;
        private char ACTION;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            zero = (Button)findViewById(R.id.btn0);
            one = (Button)findViewById(R.id.btn1);
            two = (Button)findViewById(R.id.btn2);
            three = (Button)findViewById(R.id.btn3);
            four = (Button)findViewById(R.id.btn4);
            five = (Button)findViewById(R.id.btn5);
            six = (Button)findViewById(R.id.btn6);
            seven = (Button)findViewById(R.id.btn7);
            eight = (Button)findViewById(R.id.btn8);
            nine = (Button)findViewById(R.id.btn9);
            add = (Button)findViewById(R.id.btnadd);
            meno = (Button)findViewById(R.id.btnmeno);
            div = (Button)findViewById(R.id.btndiv);
            per = (Button)findViewById(R.id.btnper);
            uguale = (Button)findViewById(R.id.btnuguale);
            clear = (Button)findViewById(R.id.btnclear);
            display = (TextView)findViewById(R.id.display);
            result = (TextView)findViewById(R.id.result);

            zero.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    display.setText(display.getText().toString() + "0");
                }
            });

            one.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    display.setText(display.getText().toString() + "1");
                }
            });

            two.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    display.setText(display.getText().toString() + "2");
                }
            });

            three.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    display.setText(display.getText().toString() + "3");
                }
            });

            four.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    display.setText(display.getText().toString() + "4");
                }
            });

            five.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    display.setText(display.getText().toString() + "5");
                }
            });

            six.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    display.setText(display.getText().toString() + "6");
                }
            });

            seven.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    display.setText(display.getText().toString() + "7");
                }
            });

            eight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    display.setText(display.getText().toString() + "8");
                }
            });

            nine.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    display.setText(display.getText().toString() + "9 ");
                }
            });

            meno.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    calcola();
                    ACTION = SUBTRACTION;
                    result.setText(String.valueOf(val1) + "-");
                    display.setText(null);
                }
            });

            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    calcola();
                    ACTION = ADDITION;
                    result.setText(String.valueOf(val1) + "+");
                    display.setText(null);
                }
            });

            per.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    calcola();
                    ACTION = MULTIPLICATION;
                    result.setText(String.valueOf(val1) + "*");
                    display.setText(null);
                }
            });

            div.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    calcola();
                    ACTION = DIVISION;
                    result.setText(String.valueOf(val1) + "/");
                    display.setText(null);
                }
            });

            uguale.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    calcola();
                    ACTION = EQU;
                    display.setText(/*result.getText().toString() + String.valueOf(val2) + "=" + */String.valueOf(val1));
                    result.setText(null);
                }
            });

            clear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(display.getText().length() > 0){
                        CharSequence name = display.getText().toString();
                        display.setText(name.subSequence(0, name.length()-1));
                    }
                    else{
                        val1 = Double.NaN;
                        val2 = Double.NaN;
                        display.setText(null);
                        result.setText(null);
                    }
                }
            });

        }

        private void calcola() {
            if (!Double.isNaN(val1)) {
                val2 = Double.parseDouble(display.getText().toString());

                switch (ACTION) {
                    case ADDITION:
                        val1 = val1 + val2;
                        break;
                    case SUBTRACTION:
                        val1 = val1 - val2;
                        break;
                    case MULTIPLICATION:
                        val1 = val1 * val2;
                        break;
                    case DIVISION:
                        val1 = val1 / val2;
                        break;
                    case EQU:
                        break;
                }
            } else {
                val1 = Double.parseDouble(display.getText().toString());
            }
        }
    }