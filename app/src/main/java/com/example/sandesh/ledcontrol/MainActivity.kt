package com.example.sandesh.ledcontrol

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        turnOffButton.setOnClickListener{
            Toast.makeText(this@MainActivity, "turn leds off.", Toast.LENGTH_SHORT).show()
            turnLedsOff()
        }
        turnOnButton.setOnClickListener{
            Toast.makeText(this@MainActivity, "turn leds on.", Toast.LENGTH_SHORT).show()
            turnLedsOn()
        }

        configButton.setOnClickListener{
            val intent = Intent(this@MainActivity, ConfigurationActivity::class.java)
            intent.putExtra("key", 5)
            startActivity(intent)
        }
    }

    fun turnLedsOff() {

    }

    fun turnLedsOn() {

    }
}
