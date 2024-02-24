package com.example.tapcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var counter: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counter = 0

        val tap = findViewById<Button>(R.id.tap)
        val count = findViewById<TextView>(R.id.counter)

        tap.setOnClickListener {
            counter++
            count.setText(counter.toString())
        }
    }
}