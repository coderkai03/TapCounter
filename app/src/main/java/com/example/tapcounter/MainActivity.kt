package com.example.tapcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var counter: Int = 0
    private var multiplier: Int = 1

    private lateinit var tap: Button
    private lateinit var count: TextView
    private lateinit var upgrades: Button
    private lateinit var flash: ImageView
    private lateinit var quote: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counter = 0

        tap = findViewById(R.id.tap)
        count = findViewById(R.id.counter)
        flash = findViewById(R.id.flash)
        quote = findViewById(R.id.quote)

        tap.setOnClickListener {
            counter+=multiplier
            count.setText(counter.toString())

            if (counter == 20) {
                setUpgrades()
            }
        }
    }

    private fun setUpgrades() {
        upgrades = findViewById(R.id.upgrade)
        upgrades.visibility = View.VISIBLE

        upgrades.setOnClickListener {
            upgrades.isEnabled = false
            multiplier = 3

            quote.visibility = View.VISIBLE

            flash.setImageResource(R.drawable.flash_run)
        }
    }
}