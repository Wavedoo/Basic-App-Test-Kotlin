package com.example.basicapptest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var calculateButton: Button = findViewById(R.id.calculateButton)
        var resultText: TextView = findViewById(R.id.result)
        var gradeText: EditText = findViewById(R.id.grade)
        var weightText: EditText = findViewById(R.id.weight)

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
            Log.d("BUTTONS", "User tapped the button. ${result}")
            resultText.text = getString(R.string.result, result)
        }
    }
}