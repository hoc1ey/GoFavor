package com.g4.gofavor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var buttonNotifications : ImageView
    private lateinit var buttonProfile : ImageView
    private lateinit var buttonHome : LinearLayout
    private lateinit var buttonFavors : LinearLayout
    private lateinit var buttonChats : LinearLayout
    private lateinit var buttonEarnings : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
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

    private fun initEventListeners() {
        buttonNotifications.setOnClickListener {
            val intent = Intent(this, NotificationsActivity::class.java)
            startActivity(intent)
        }
        buttonProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
        if (this.localClassName != "MainActivity") {
            buttonHome.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
        if (this.localClassName != "FavorsActivity") {
            buttonFavors.setOnClickListener {
                val intent = Intent(this, FavorsActivity::class.java)
                startActivity(intent)
            }
        }
        if (this.localClassName != "GeneralChatsActivity") {
            buttonChats.setOnClickListener {
                val intent = Intent(this, GeneralChatsActivity::class.java)
                startActivity(intent)
            }
        }
        if (this.localClassName != "EarningsActivity") {
            buttonEarnings.setOnClickListener {
                val intent = Intent(this, EarningsActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun initUIComponents() {
        buttonNotifications = findViewById(R.id.buttonNotifications)
        buttonProfile = findViewById(R.id.buttonProfile)
        buttonHome = findViewById(R.id.buttonHome)
        buttonFavors = findViewById(R.id.buttonFavors)
        buttonChats = findViewById(R.id.buttonChats)
        buttonEarnings = findViewById(R.id.buttonEarnings)
    }

}