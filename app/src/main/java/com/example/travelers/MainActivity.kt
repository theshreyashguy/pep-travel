package com.example.travelers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       Handler().postDelayed({

          val inten = Intent(this,MainActivity2::class.java)
           startActivity(inten)
           finish()
       },1500)
    }
}