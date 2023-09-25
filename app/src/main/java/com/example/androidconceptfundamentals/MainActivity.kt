package com.example.androidconceptfundamentals

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn:Button = findViewById(R.id.btn_nxt)
        btn.setOnClickListener {
            intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}