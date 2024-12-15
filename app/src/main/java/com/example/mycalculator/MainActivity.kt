package com.example.mycalculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


//Agar koi library import krni h then press "Alt+Enter"


class MainActivity : AppCompatActivity() {


    private var total =0.0 //stores the cumulative total
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //ye btadega ki kotlin file kis xml file me id dundhegi

        var a =""
        var input1=""
        var input2=""
        var inf1=""
        var inf2=""
        val inputField1 =findViewById<TextView>(R.id.num1) //this is linking the kotlin to xml by using findViewById
        val inputField2 =findViewById<TextView>(R.id.num2)
        val addButton =findViewById<ImageButton>(R.id.ADD)
        val subtractButton =findViewById<ImageButton>(R.id.minus)
        val multiplyButton=findViewById<ImageButton>(R.id.multiply)
        val divideButton=findViewById<ImageButton>(R.id.divide)
        val modButton=findViewById<ImageButton>(R.id.modulous)
        val equalButton=findViewById<ImageButton>(R.id.equal)
        val resultView : TextView=findViewById(R.id.result) //variable name and id ko same rakha h to enhance readability of kotlin to xml
        val clearButton : ImageButton =findViewById(R.id.clear)
        val one : ImageButton=findViewById(R.id.one)
        val two :ImageButton=findViewById(R.id.two)
        val three:ImageButton=findViewById(R.id.three)
        val four:ImageButton =findViewById(R.id.four)
        val five:ImageButton =findViewById(R.id.five)
        val six:ImageButton =findViewById(R.id.six)
        val seven:ImageButton =findViewById(R.id.seven)
        val eight:ImageButton =findViewById(R.id.eight)
        val nine:ImageButton =findViewById(R.id.nine)
        val zero:ImageButton =findViewById(R.id.zero)
        val dot :ImageButton =findViewById(R.id.zero)


        addButton.setOnClickListener{ //setOnClickListener ye enable kr dega to click on that button to perform the below function
            if(input1.isNotEmpty() && input2.isNotEmpty()) {
                val number1 =inf1.toDouble() //isNotEmpty string pr kaam krta h esliye upar hmne string me convert kia h
                val number2=inf2.toDouble()
                total = number1+number2
                Toast.makeText(this,"both numbers entered",Toast.LENGTH_SHORT).show()
                 //$ total ki live value de dega
            } else {
                Toast.makeText(this,"Enter both numbers",Toast.LENGTH_SHORT).show()
            }

        }

        subtractButton.setOnClickListener{
            if(input1.isNotEmpty() && input2.isNotEmpty()){
                val number1= input1.toDouble()
                val number2 =input2.toDouble()
                total=number1-number2

            }
            else{
                Toast.makeText(this, "Enter both numebrs", Toast.LENGTH_SHORT).show()
            }
        }

        multiplyButton.setOnClickListener{ //setOnClickListener ye enable kr dega to click on that button to perform the below function
            if(input1.isNotEmpty() && input2.isNotEmpty()) {
                val number1 =input1.toDouble() //isNotEmpty string pr kaam krta h esliye upar hmne string me convert kia h
                val number2=input2.toDouble()
                total = number1*number2
                 //$ total ki live value de dega
            } else {
                Toast.makeText(this,"Enter both numbers",Toast.LENGTH_SHORT).show()
            }

        }

        divideButton.setOnClickListener{ //setOnClickListener ye enable kr dega to click on that button to perform the below function
            if(input1.isNotEmpty() && input2.isNotEmpty()) {

                if(input2!="0"){
                    val number1 =input1.toDouble() //isNotEmpty string pr kaam krta h esliye upar hmne string me convert kia h
                    val number2=input2.toDouble()
                    total = number1/number2}
                else{
                    Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show()
                }
                 //$ total ki live value de dega
            } else {
                Toast.makeText(this,"Enter both numbers",Toast.LENGTH_SHORT).show()
            }

        }

        modButton.setOnClickListener{
            if(input1.isNotEmpty() && input2.isNotEmpty()){
                if(input2!="0"){
                    val number1=input1.toDouble()
                    val number2=input2.toDouble()
                    total=number1 % number2
                }
                else{
                    Toast.makeText(this, "Cannot find modulous divide by 0", Toast.LENGTH_SHORT).show()
                }
            }
            else{
                Toast.makeText(this, "Enter both numbers", Toast.LENGTH_SHORT).show()
            }
        }

        equalButton.setOnClickListener{
            resultView.text="Result: $total"
        }

        inputField1.setOnClickListener{
            a="1"
        }

        inputField2.setOnClickListener{
            a="2"
        }

         one.setOnClickListener {
             if (a == "1") {
                 input1 = inputField1.text.toString()
                 if (input1.isNotEmpty()) {
                     inputField1.text = "$input1"+"1"
                     inf1=inputField1.text.toString()

                 } else {
                     inputField1.text = "1"
                     inf1=inputField1.text.toString()
                 }
             }
             if(a=="2"){
                 input2 = inputField2.text.toString()
                 if (input2.isNotEmpty()) {
                     inputField2.text = "$input2"+"1"
                     inf1=inputField2.text.toString()
                 } else {
                     inputField2.text = "1"
                     inf1=inputField2.text.toString()
                 }
             }
         }


        clearButton.setOnClickListener{

            total=0.0
            inputField1.text=""
            inputField2.text=""
            resultView.text= "Result: $total"
            Toast.makeText(this, "Cleared", Toast.LENGTH_SHORT).show()

        }






    }
}