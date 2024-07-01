package com.example.calculk1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity()
{

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enableEdgeToEdge()
        val greetingTextView = findViewById<TextView>(R.id.output)
        val Button0 = findViewById<Button>(R.id.button_0)
        val Button1 = findViewById<Button>(R.id.button_1)
        val Button2 = findViewById<Button>(R.id.button_2)
        val message = "g"
        greetingTextView.text = message


    }
}
