package com.g4.gofavor

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GeneralChatsActivity : AppCompatActivity() {

    private lateinit var buttonNotifications : ImageView
    private lateinit var buttonProfile : ImageView
    private lateinit var buttonHome : LinearLayout
    private lateinit var buttonFavors : LinearLayout
    private lateinit var buttonChats : LinearLayout
    private lateinit var buttonEarnings : LinearLayout
    private lateinit var buttonChat1 : LinearLayout
    private lateinit var buttonChat2 : LinearLayout
    private lateinit var buttonChat3 : LinearLayout
    private lateinit var buttonChat4 : LinearLayout
    private lateinit var buttonChat5 : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_general_chats)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    private fun initUI() {
        initUIComponents()
        initEventListeners()
    }

    private fun initEventListeners() {
        buttonChat1.setOnClickListener {
            val intent = Intent(this, SpecificChatActivity::class.java)
            startActivity(intent)
        }
        buttonChat2.setOnClickListener {
            val intent = Intent(this, SpecificChatActivity::class.java)
            startActivity(intent)
        }
        buttonChat3.setOnClickListener {
            val intent = Intent(this, SpecificChatActivity::class.java)
            startActivity(intent)
        }
        buttonChat4.setOnClickListener {
            val intent = Intent(this, SpecificChatActivity::class.java)
            startActivity(intent)
        }
        buttonChat5.setOnClickListener {
            val intent = Intent(this, SpecificChatActivity::class.java)
            startActivity(intent)
        }
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
        buttonChat1 = findViewById(R.id.buttonChat1)
        buttonChat2 = findViewById(R.id.buttonChat2)
        buttonChat3 = findViewById(R.id.buttonChat3)
        buttonChat4 = findViewById(R.id.buttonChat4)
        buttonChat5 = findViewById(R.id.buttonChat5)
        buttonNotifications = findViewById(R.id.buttonNotifications)
        buttonProfile = findViewById(R.id.buttonProfile)
        buttonHome = findViewById(R.id.buttonHome)
        buttonFavors = findViewById(R.id.buttonFavors)
        buttonChats = findViewById(R.id.buttonChats)
        buttonEarnings = findViewById(R.id.buttonEarnings)
    }
}