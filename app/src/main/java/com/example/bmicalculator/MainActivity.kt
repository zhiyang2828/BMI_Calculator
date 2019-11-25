package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalculate.setOnClickListener(){

            val weight:Double = txtWeight.text.toString().toDouble()
            val height:Double = txtHeight.text.toString().toDouble()
            val BMI:Double = weight / Math.pow(height,2.0)

            if(BMI < 18.5){

                imageView.setImageResource(R.drawable.under);
                lblBMI.text = "BMI = %.2f (Under)".format(BMI).toString()
            }
            else if(BMI >= 15.5 && BMI <= 24.9){

                imageView.setImageResource(R.drawable.normal);
                lblBMI.text = "BMI = %.2f (Normal)".format(BMI).toString()
            }
            else{
                imageView.setImageResource((R.drawable.over));
                lblBMI.text = "BMI = %.2f (Over)".format(BMI).toString()
            }

        }

        btnRest.setOnClickListener(){

            txtHeight.text = null;
            txtWeight.text = null;
            lblBMI.text = null;

        }

    }
}
