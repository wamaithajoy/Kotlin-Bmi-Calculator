package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btmBmi:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btmBmi=findViewById(R.id.btnBmi)
        btmBmi.setOnClickListener{
            val intent= Intent(this,bmiCalculatorActivity::class.java)
            startActivity(intent)
        }
    }
}