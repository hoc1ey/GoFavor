package com.g4.gofavor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProfileActivity : AppCompatActivity() {

    private lateinit var buttonReturn: ImageView
    private lateinit var buttonLogout: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initUI()
    }

    private fun initUI() {
        initUIComponents()
        initEventListeners()
    }

    private fun initUIComponents() {
        buttonReturn = findViewById(R.id.buttonReturn)
        buttonLogout = findViewById(R.id.buttonLogout)
    }

    private fun initEventListeners() {
        buttonReturn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        buttonLogout.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}