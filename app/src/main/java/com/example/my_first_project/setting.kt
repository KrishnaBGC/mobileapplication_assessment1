package com.example.my_first_project

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class setting : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.setting)

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

        // Top back button
        findViewById<View>(R.id.btnBack).setOnClickListener {
            finish()
        }

        // Log out → Login
        findViewById<View>(R.id.btnLogout).setOnClickListener {
            startActivity(
                Intent(this, login::class.java)
            )
        }

        // Bottom Navigation

        findViewById<View>(R.id.navLogin).setOnClickListener {
            startActivity(
                Intent(this, login::class.java)
            )
        }

        findViewById<View>(R.id.navHome).setOnClickListener {
            startActivity(
                Intent(this, Home::class.java)
            )
        }

        findViewById<View>(R.id.navSetting).setOnClickListener {
            // Already on Setting
        }
    }
}