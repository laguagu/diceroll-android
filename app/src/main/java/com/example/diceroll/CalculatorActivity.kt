package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.diceroll.databinding.ActivityCalculatorBinding

class CalculatorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCalculatorBinding
    lateinit var btnAdd : Button
    lateinit var btnDec : Button
    lateinit var btnMultiply : Button
    lateinit var btnDivide : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_calculator)
        btnAdd = findViewById(R.id.btn_add)
        btnDec = findViewById(R.id.btn_dec)
        btnMultiply = findViewById(R.id.btn_multiply)
        btnDivide = findViewById(R.id.btn_divide)
    }
}