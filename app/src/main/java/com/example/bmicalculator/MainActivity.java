package com.example.bmicalculator;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

  public double num1,num2,resultt,ssww;
  EditText cmi,kgi;
  Button convert;
  TextView ress,resR , sw,bmiword,twr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ssww = 0 ;  // varable take height befor divid it over 10
        num1 = 0;   //hight
        num2 = 0;    // wight
        resultt = 0;
        cmi = (EditText)findViewById(R.id.cm);
        kgi = (EditText)findViewById(R.id.kg);
        convert = (Button)findViewById(R.id.buttonCal);
        ress = (TextView)findViewById(R.id.res);
        resR = (TextView)findViewById(R.id.resR);
        sw = (TextView)findViewById(R.id.sw);

        bmiword = (TextView)findViewById(R.id.bmiword);
        twr = (TextView)findViewById(R.id.twr);


    }
////////////////////////////////////////////////////////////////////////

    public void mm (View v) {


        try {
        String hight = cmi.getText().toString();
        String wight = kgi.getText().toString();

        ssww = Double.parseDouble(hight);
        num1 = Double.parseDouble(hight) / 100;
        num2 = Double.parseDouble(wight);
        resultt = num2 / (num1 * num1);
        //ress.setText(resultt + " ");

        if (resultt < 16.5) {
            DecimalFormat df = new DecimalFormat("#.##");
            String result_format = df.format(resultt);
            ress.setText(result_format);
            resR.setText("Low Body Weight");

            bmiword.setText("BMI");
            twr.setText("Typical Weight Rang");
        }
        if (resultt >= 16.5 & resultt < 18.5) {
            DecimalFormat df = new DecimalFormat("#.##");
            String result_format = df.format(resultt);
            ress.setText(result_format);
            resR.setText("Underweight");

            bmiword.setText("BMI");
            twr.setText("Typical Weight Rang");
        }

        if (resultt >= 18.5 & resultt < 25) {
            DecimalFormat df = new DecimalFormat("#.##");
            String result_format = df.format(resultt);
            ress.setText(result_format);
            resR.setText("Normal");

            bmiword.setText("BMI");
            twr.setText("Typical Weight Rang");
        }
        if (resultt >= 25 & resultt < 30) {
            DecimalFormat df = new DecimalFormat("#.##");
            String result_format = df.format(resultt);
            ress.setText(result_format);
            resR.setText("Over Weight");

            bmiword.setText("BMI");
            twr.setText("Typical Weight Rang");
        }
        if (resultt >= 30 & resultt < 35) {
            DecimalFormat df = new DecimalFormat("#.##");
            String result_format = df.format(resultt);
            ress.setText(result_format);
            resR.setText("Obesity Level (1)");

            bmiword.setText("BMI");
            twr.setText("Typical Weight Rang");
        }
        if (resultt >= 35 & resultt < 40) {
            DecimalFormat df = new DecimalFormat("#.##");
            String result_format = df.format(resultt);
            ress.setText(result_format);
            resR.setText("Obesity Level (2)");

            bmiword.setText("BMI");
            twr.setText("Typical Weight Rang");
        }
        if (resultt > 40) {
            DecimalFormat df = new DecimalFormat("#.##");
            String result_format = df.format(resultt);
            ress.setText(result_format);
            resR.setText("Obesity Level (3)");

            bmiword.setText("BMI");
            twr.setText("Typical Weight Rang");
        }

        if (ssww >= 140 & ssww < 155) {
            sw.setText("34 - 50" + "Kg");
        }
        if (ssww >= 155 & ssww < 160) {
            sw.setText("53 - 61" + "Kg");
        }
        if (ssww >= 160 & ssww < 165) {
            sw.setText("56 - 65" + "Kg");
        }
        if (ssww >= 165 & ssww < 175) {
            sw.setText("62 - 72" + "Kg");
        }
        if (ssww >= 175 & ssww <= 185) {
            sw.setText("70 - 81 " + "Kg");
        }
        if (ssww > 185 & ssww <= 195) {
            sw.setText("78 - 88 " + "Kg");
        }
        if (ssww <= 139) {
            sw.setText(" ");
        }
        if (ssww >= 196) {
            sw.setText(" ");
        }

    } catch (NumberFormatException e) {
            Toast.makeText(getApplicationContext(), "Please Provide an Input", Toast.LENGTH_SHORT).show();
        }

    }//void end

    public void clk (View h)
    {
        kgi.setText("");
        cmi.setText("");
        ress.setText("");
        resR.setText("");
        sw.setText("");

        bmiword.setText("");
        twr.setText("");
    }
}
