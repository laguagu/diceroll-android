package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.diceroll.databinding.ActivityCalculatorBinding

class CalculatorActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityCalculatorBinding
    lateinit var btnAdd : Button
    lateinit var btnDec : Button
    lateinit var btnMultiply : Button
    lateinit var btnDivide : Button
    lateinit var etA : EditText
    lateinit var etB : EditText
    lateinit var resultTv : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_calculator)
        btnAdd = findViewById(R.id.btn_add)
        btnDec = findViewById(R.id.btn_dec)
        btnMultiply = findViewById(R.id.btn_multiply)
        btnDivide = findViewById(R.id.btn_divide)
        etA = findViewById(R.id.first_val)
        etB = findViewById(R.id.second_val)
        resultTv = findViewById(R.id.result_tv)

        btnAdd.setOnClickListener(this)
        btnDec.setOnClickListener(this)
        btnMultiply.setOnClickListener(this)
        btnDivide.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var a = etA.text.toString().toDouble()
        var b = etB.text.toString().toDouble()
        var result = 0.0
        when(v?.id){
            R.id.btn_add -> {
                result = a+b
            }
            R.id.btn_dec -> {
                result = a-b
            }
            R.id.btn_multiply -> {
                result = a*b
            }
            R.id.btn_divide -> {
                result = a/b
            }
        }
        resultTv.text = "Result is $result"
    }
}