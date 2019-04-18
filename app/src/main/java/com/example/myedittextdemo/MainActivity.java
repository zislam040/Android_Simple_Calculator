package com.example.myedittextdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {


    private EditText editText1, editText2;
    private Button addButton, subButton,divButton,mulButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText1 = (EditText) findViewById(R.id.editText1Id);
        editText2 = (EditText) findViewById(R.id.editText2Id);

        addButton = (Button) findViewById(R.id.addTextId);
        subButton = (Button) findViewById(R.id.subTextId);
        mulButton = (Button) findViewById(R.id.mulTextId);
        divButton = (Button) findViewById(R.id.divTextId);

        resultTextView = (TextView) findViewById(R.id.resultViewId);


        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
        mulButton.setOnClickListener(this);
        divButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        try {

            String number1= editText1.getText().toString();
            String number2= editText2.getText().toString();


            //Convert the inputed value into double

            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);

            // conditional statement for the clicking object

            if(v.getId()==R.id.addTextId){

                double sum = num1 + num2;
                resultTextView.setText("The result is: "+sum);
            }

            else if(v.getId()==R.id.subTextId){

                double sub = num1 - num2;
                resultTextView.setText("The result is: "+sub);
            }

            else if(v.getId()==R.id.mulTextId){

                double mul = num1 * num2;
                resultTextView.setText("The result is: "+mul);
            }

            else if(v.getId()==R.id.divTextId){

                double div = num1 / num2;
                resultTextView.setText("The result is: "+div);
            }

        }

        catch (Exception e) {
            Toast.makeText(MainActivity.this,"Please Input the Text field first",Toast.LENGTH_SHORT).show();
        }



    }
}
