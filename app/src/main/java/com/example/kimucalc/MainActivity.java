package com.example.kimucalc;

import androidx.appcompat.app.AppCompatActivity;
import org.mariuszgromada.math.mxparser.*;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.text.style.UpdateAppearance;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button kimunote;
    private EditText display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kimunote=findViewById(R.id.notepad);
        kimunote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,kimunote.class);
                startActivity(intent);
            }
        });

        display = findViewById(R.id.input);
        display.setShowSoftInputOnFocus(false);
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getString(R.string.display).equals(display.getText().toString()))
                    display.setText("");

            }
        });
    }

    private void updateText(String strToAdd){
        String oldStr = display.getText().toString();
        int cursorPos = display.getSelectionStart();
        String leftStr = oldStr.substring(0,cursorPos);
        String rightStr = oldStr.substring(cursorPos);
        if(getString(R.string.display).equals(display.getText().toString())){
            display.setText(strToAdd);
            display.setSelection(cursorPos+1);
        }
        else{
            display.setText(String.format("%s%s%s",leftStr,strToAdd,rightStr));
            display.setSelection(cursorPos+1);
        }
    }

    public void zeroBTN(View view) {
        Button clearBTN =findViewById(R.id.zero);

        @SuppressLint("ServiceCast") Vibrator vibrator =(Vibrator) getSystemService(VIBRATOR_SERVICE);
        updateText("0");
        final long[] pattern={20,60};
        clearBTN.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vibrator.vibrate(pattern,-1);
                updateText("0");
            }
        });
    }


    public void oneBTN(View view){
        updateText("1");
        Button clearBTN =findViewById(R.id.one);

        @SuppressLint("ServiceCast") Vibrator vibrator =(Vibrator) getSystemService(VIBRATOR_SERVICE);

        final long[] pattern={20,60};
        clearBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(pattern,-1);
                updateText("1");
            }
        });
    }
    public void twoBTN(View view){
        updateText("2");
        Button clearBTN =findViewById(R.id.two);

        @SuppressLint("ServiceCast") Vibrator vibrator =(Vibrator) getSystemService(VIBRATOR_SERVICE);

        final long[] pattern={20,60};
        clearBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(pattern,-1);
                updateText("2");
            }
        });
    }
    public void threeBTN(View view){
        updateText("3");
        Button clearBTN =findViewById(R.id.three);

        @SuppressLint("ServiceCast") Vibrator vibrator =(Vibrator) getSystemService(VIBRATOR_SERVICE);

        final long[] pattern={20,60};
        clearBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(pattern,-1);
                updateText("3");
            }
        });
    }
    public void fourBTN(View view){
        updateText("4");
        Button clearBTN =findViewById(R.id.four);

        @SuppressLint("ServiceCast") Vibrator vibrator =(Vibrator) getSystemService(VIBRATOR_SERVICE);

        final long[] pattern={20,60};
        clearBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(pattern,-1);
                updateText("4");
            }
        });
    }
    public void fiveBTN(View view){
        updateText("5");
        Button clearBTN =findViewById(R.id.five);

        @SuppressLint("ServiceCast") Vibrator vibrator =(Vibrator) getSystemService(VIBRATOR_SERVICE);

        final long[] pattern={20,60};
        clearBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(pattern,-1);
                updateText("5");
            }
        });
    }
    public void sixBTN(View view){
        updateText("6");
        Button clearBTN =findViewById(R.id.six);

        @SuppressLint("ServiceCast") Vibrator vibrator =(Vibrator) getSystemService(VIBRATOR_SERVICE);

        final long[] pattern={20,60};
        clearBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(pattern,-1);
                updateText("6");
            }
        });
    }
    public void sevenBTN(View view){
        updateText("7");
        Button clearBTN =findViewById(R.id.seven);

        @SuppressLint("ServiceCast") Vibrator vibrator =(Vibrator) getSystemService(VIBRATOR_SERVICE);

        final long[] pattern={20,60};
        clearBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(pattern,-1);
                updateText("7");
            }
        });
    }
    public void eightBTN(View view){
        updateText("8");
        Button clearBTN =findViewById(R.id.eight);

        @SuppressLint("ServiceCast") Vibrator vibrator =(Vibrator) getSystemService(VIBRATOR_SERVICE);

        final long[] pattern={20,60};
        clearBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(pattern,-1);
                updateText("8");
            }
        });
    }
    public void nineBTN(View view){
        updateText("9");
        Button clearBTN =findViewById(R.id.nine);

        @SuppressLint("ServiceCast") Vibrator vibrator =(Vibrator) getSystemService(VIBRATOR_SERVICE);

        final long[] pattern={20,60};
        clearBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(pattern,-1);
                updateText("9");
            }
        });
    }
    public void addBTN(View view){
        updateText("+");
        Button clearBTN =findViewById(R.id.add);

        @SuppressLint("ServiceCast") Vibrator vibrator =(Vibrator) getSystemService(VIBRATOR_SERVICE);

        final long[] pattern={20,60};
        clearBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(pattern,-1);
                updateText("+");
            }
        });
    }
    public void subtractBTN(View view){
        updateText("-");
        Button clearBTN =findViewById(R.id.subtract);

        @SuppressLint("ServiceCast") Vibrator vibrator =(Vibrator) getSystemService(VIBRATOR_SERVICE);

        final long[] pattern={20,60};
        clearBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(pattern,-1);
                updateText("-");
            }
        });
    }
    public void multiplyBTN(View view){
        updateText("×");
        Button clearBTN =findViewById(R.id.multiply);

        @SuppressLint("ServiceCast") Vibrator vibrator =(Vibrator) getSystemService(VIBRATOR_SERVICE);

        final long[] pattern={20,60};
        clearBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(pattern,-1);
                updateText("×");
            }
        });
    }
    public void divideBTN(View view){
        updateText("÷");
        Button clearBTN =findViewById(R.id.divide);

        @SuppressLint("ServiceCast") Vibrator vibrator =(Vibrator) getSystemService(VIBRATOR_SERVICE);

        final long[] pattern={20,60};
        clearBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(pattern,-1);
                updateText("÷");
            }
        });
    }
    public void plusMinusBTN(View view){
        updateText("-");
        Button clearBTN =findViewById(R.id.plusMinus);

        @SuppressLint("ServiceCast") Vibrator vibrator =(Vibrator) getSystemService(VIBRATOR_SERVICE);

        final long[] pattern={20,60};
        clearBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(pattern,-1);
                updateText("-");
            }
        });
    }
    public void equalsBTN(View view){
        String userExp =display.getText().toString();

        userExp = userExp.replaceAll("÷","/");
        userExp = userExp.replaceAll("×","*");

        Expression exp = new Expression(userExp);

        String result = String.valueOf(exp.calculate());

        display.setText(result);
        display.setSelection(result.length());


    }
    public void backspaceBTN(View view){
          int cursorPos = display.getSelectionStart();
          int textLen = display.getText().length();
          if(cursorPos != 0 && textLen != 0){
              SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
              selection.replace(cursorPos-1,cursorPos,"");
              display.setText(selection);
              display.setSelection(cursorPos-1);
          }
    }
    public void clearBTN(View view){
        display.setText("");
        Button clearBTN =findViewById(R.id.clear);

        @SuppressLint("ServiceCast") Vibrator vibrator =(Vibrator) getSystemService(VIBRATOR_SERVICE);

        final long[] pattern={20,60};
        clearBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(pattern,-1);
                display.setText("");
            }
        });


    }
    public void parBTN(View view){
        int cursorPos =display.getSelectionStart();
        int openPar = 0;
        int closePar = 0;
        int textLen = display.getText().length();

        for (int i=0;i<cursorPos;i++){
            if(display.getText().toString().substring(i, i+1).equals("(")){
                openPar +=1;
            }
            if(display.getText().toString().substring(i, i+1).equals(")")){
                closePar +=1;
            }
        }
        if(openPar==closePar || display.getText().toString().substring(textLen-1,textLen).equals("(")){
           updateText("(");

        }
        else if(closePar < openPar && ! display.getText().toString().substring(textLen-1,textLen).equals("(")){
            updateText(")");

        }
        display.setSelection(cursorPos + 1);
    }
    public void pointBTN(View view){
        updateText(".");
        Button clearBTN =findViewById(R.id.point);

        @SuppressLint("ServiceCast") Vibrator vibrator =(Vibrator) getSystemService(VIBRATOR_SERVICE);

        final long[] pattern={20,60};
        clearBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(pattern,-1);
                updateText(".");
            }
        });
    }
    public void expBTN(View view) {
        updateText("^");
        Button clearBTN =findViewById(R.id.exponent);

        @SuppressLint("ServiceCast") Vibrator vibrator =(Vibrator) getSystemService(VIBRATOR_SERVICE);

        final long[] pattern={20,60};
        clearBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(pattern,-1);
                updateText("^");
            }
        });

    }
}