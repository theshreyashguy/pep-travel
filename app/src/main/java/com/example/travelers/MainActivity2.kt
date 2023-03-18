package com.example.travelers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val btn = findViewById<Button>(R.id.signup)
        btn.setOnClickListener {
                val inten1  = Intent(this,MainActivity3::class.java)
            startActivity(inten1)
        }
    }
}