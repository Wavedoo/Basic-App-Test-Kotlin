package com.example.basicapptest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculateButton: Button = findViewById(R.id.calculateButton)
        val resultText: TextView = findViewById(R.id.result)
        val gradeText: EditText = findViewById(R.id.grade)
        val weightText: EditText = findViewById(R.id.weight)

        resultText.text = getString(R.string.result, 0.0)
        calculateButton.setOnClickListener{
            var grade: Double
            grade = 0.0
            if(gradeText.text.toString() != ""){
                grade = gradeText.text.toString().toDouble()
            }
            var weight: Double
            weight = 0.0
            if(weightText.text.toString() != ""){
                weight = weightText.text.toString().toDouble()
            }
            var result = 0.0
            if(grade.toInt() != 0 && weight.toInt() != 0)
                result = grade * (weight / 100)
            resultText.text = getString(R.string.result, result)
        }
    }
}