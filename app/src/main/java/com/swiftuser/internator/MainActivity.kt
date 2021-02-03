package com.swiftuser.internator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById<TextView>(R.id.textView)

        findViewById<Button>(R.id.btnCheck).setOnClickListener { view ->
            if (InternetChecker.isOnline(this)) {
                textView.text = "Internet Access";
            } else {
                textView.text = "NO Interweb :/";
            }
        }
    }
}