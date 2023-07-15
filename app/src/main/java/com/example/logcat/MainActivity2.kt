package com.example.logcat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val mobile = findViewById<TextView>(R.id.mobile)

        mobile.setOnClickListener{
            val pogo = Intent(this,MainActivity::class.java)
            startActivity(pogo)
        }
    }
}