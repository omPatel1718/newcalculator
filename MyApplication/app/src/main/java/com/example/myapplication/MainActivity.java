package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findSum(View v){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        int num1 =Integer.parseInt(number1ET.getText().toString());
        int num2 =Integer.parseInt(number2ET.getText().toString());
        int sum = num1 + num2;

        numberSumTV.setText("" + sum);
    }

    public void findDifference(View v){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberDifferenceTV = findViewById(R.id.resultTV);

        int num1 =Integer.parseInt(number1ET.getText().toString());
        int num2 =Integer.parseInt(number2ET.getText().toString());
        int difference = num1 - num2;

        numberDifferenceTV.setText("" + difference);
    }

    public void findMulti(View v){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberTotalTV = findViewById(R.id.resultTV);

        int num1 =Integer.parseInt(number1ET.getText().toString());
        int num2 =Integer.parseInt(number2ET.getText().toString());
        int total = num1 * num2;

        numberTotalTV.setText("" + total);
    }

    public void findDivide(View v){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberTotalTV = findViewById(R.id.resultTV);

        int num1 =Integer.parseInt(number1ET.getText().toString());
        int num2 =Integer.parseInt(number2ET.getText().toString());
        int total = num1 / num2;

        numberTotalTV.setText("" + total);
    }

    public void findMod(View v){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberTotalTV = findViewById(R.id.resultTV);

        int num1 =Integer.parseInt(number1ET.getText().toString());
        int num2 =Integer.parseInt(number2ET.getText().toString());
        int total = num1 % num2;

        numberTotalTV.setText("" + total);
    }

    public void findPower(View v){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberTotalTV = findViewById(R.id.resultTV);

        int num1 =Integer.parseInt(number1ET.getText().toString());
        int num2 =Integer.parseInt(number2ET.getText().toString());
        int total = num1 ^ num2;

        numberTotalTV.setText("" + total);
    }

    public void findRoot(View v){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberTotalTV = findViewById(R.id.resultTV);

        int num1 =Integer.parseInt(number1ET.getText().toString());
        int num2 =Integer.parseInt(number2ET.getText().toString());
        double total = Math.pow(num1, 1/num2);

        numberTotalTV.setText("" + total);
    }
    public void findLog(View v){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberTotalTV = findViewById(R.id.resultTV);

        int num1 =Integer.parseInt(number1ET.getText().toString());
        int num2 =Integer.parseInt(number2ET.getText().toString());
        double total = Math.log(num1)/Math.log(num2);

        numberTotalTV.setText("" + total);
    }

    public void findFactorial(View v){
        EditText number1ET = findViewById(R.id.num1ET);
        TextView numberTotalTV = findViewById(R.id.resultTV);

        int num = Integer.parseInt(number1ET.getText().toString());
        int total = 1;
        for(int i=1; i<=num; i++){
            total*=i;
        }

        numberTotalTV.setText("" + total);
    }

    public void findSine(View v){
        EditText number1ET = findViewById(R.id.num1ET);
        TextView numberTotalTV = findViewById(R.id.resultTV);

        int num = Integer.parseInt(number1ET.getText().toString());
        double total = Math.sin(num);

        numberTotalTV.setText("" + total);
    }

    public void findCosine(View v){
        EditText number1ET = findViewById(R.id.num1ET);
        TextView numberTotalTV = findViewById(R.id.resultTV);

        int num = Integer.parseInt(number1ET.getText().toString());
        double total = Math.cos(num);

        numberTotalTV.setText("" + total);
    }

    public void findTangent(View v){
        EditText number1ET = findViewById(R.id.num1ET);
        TextView numberTotalTV = findViewById(R.id.resultTV);

        int num = Integer.parseInt(number1ET.getText().toString());
        double total = Math.tan(num);

        numberTotalTV.setText("" + total);
    }
}