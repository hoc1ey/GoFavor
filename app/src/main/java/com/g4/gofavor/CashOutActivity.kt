package com.g4.gofavor

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CashOutActivity : AppCompatActivity() {

    private lateinit var buttonNotifications : ImageView
    private lateinit var buttonProfile : ImageView
    private lateinit var buttonAddAccount : LinearLayout
    private lateinit var buttonHome : LinearLayout
    private lateinit var buttonFavors : LinearLayout
    private lateinit var buttonChats : LinearLayout
    private lateinit var buttonEarnings : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cash_out)
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
        buttonAddAccount.setOnClickListener {
            // Create a Dialog
            val dialog = Dialog(this) // Use `requireContext()` if inside a Fragment
            dialog.setContentView(R.layout.popup_add_account)
            dialog.setCancelable(true) // Allow dismissing when touching outside the dialog

            // Customize dialog (e.g., window size, etc.)
            val window = dialog.window
            window?.setLayout(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )

            // Find the buttonReturn inside the dialog
            val buttonCancel = dialog.findViewById<ImageView>(R.id.buttonCancel)

            // Set the listener for the return button to dismiss the dialog
            buttonCancel.setOnClickListener {
                dialog.dismiss() // This will close the dialog
            }

            // Show the dialog
            dialog.show()
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
        buttonAddAccount = findViewById(R.id.buttonAddAccount)
        buttonHome = findViewById(R.id.buttonHome)
        buttonFavors = findViewById(R.id.buttonFavors)
        buttonChats = findViewById(R.id.buttonChats)
        buttonEarnings = findViewById(R.id.buttonEarnings)
    }

}