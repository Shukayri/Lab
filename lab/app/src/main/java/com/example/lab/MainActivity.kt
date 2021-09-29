package com.example.lab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btn: Button
    lateinit var edtext1: EditText
    lateinit var edtext2: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.button)
        edtext1 = findViewById(R.id.editTextTextPersonName)
        edtext2 = findViewById(R.id.editTextTextPersonName2)

        btn.setOnClickListener {
            val name = edtext1.text.toString()
            val name2 = edtext2.text.toString()

            Toast.makeText(applicationContext, "$name $name2", Toast.LENGTH_SHORT).show()
        }
    }
}