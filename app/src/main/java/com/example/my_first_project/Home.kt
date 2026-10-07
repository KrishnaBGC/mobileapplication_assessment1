package com.example.my_first_project

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.home)

        ViewCompat.setOnApplyWindowInsetsListener(
            findViewById(R.id.main)
        ) { v, insets ->

            val systemBars =
                insets.getInsets(WindowInsetsCompat.Type.systemBars())

            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )

            insets
        }

        // Bottom Navigation

        findViewById<View>(R.id.navLogin).setOnClickListener {
            startActivity(
                Intent(this, login::class.java)
            )
        }

        findViewById<View>(R.id.navHome).setOnClickListener {
            // Already on Home
        }

        findViewById<View>(R.id.navSetting).setOnClickListener {
            startActivity(
                Intent(this, setting::class.java)
            )
        }
    }
}