package com.senac.validatorleapyear

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btnCheck : Button
    lateinit var etYear : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Binding the views
        btnCheck = findViewById(R.id.btnCheck)
        etYear = findViewById(R.id.etYear)

        btnCheck.setOnClickListener {
            val year = etYear.text.toString().toInt()
            if (year % 400 == 0)
                Toast.makeText(this," Leap Year ", Toast.LENGTH_LONG).show()

            // Else If a year is multiple of 100,
            // then it is not a leap year
            else if (year % 100 == 0)
                Toast.makeText(this,"Not A Leap Year ", Toast.LENGTH_LONG).show()

            // Else If a year is multiple of 4,
            // then it is a leap year
            else if (year % 4 == 0)
                Toast.makeText(this," Leap Year ", Toast.LENGTH_LONG).show()
            // else it is a leap year
            else
                Toast.makeText(this,"Not A Leap Year ", Toast.LENGTH_LONG).show()
        }
    }
}