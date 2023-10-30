package com.example.helloword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button=findViewById<Button>(R.id.button)
        var EditT=findViewById<EditText>(R.id.editTextText)

        button.setOnClickListener{
            Toast.makeText(this, "!Hola " + EditT.text.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}