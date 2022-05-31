package com.example.i_care.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.i_care.R
import kotlinx.android.synthetic.main.activity_food_calorie.*
import kotlinx.android.synthetic.main.activity_food_calorie.toolbar_forgot_password_activity
import kotlinx.android.synthetic.main.activity_setting.*

@Suppress("Deprecation")
class SettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)


        setupActionBar()

        btn_logout.setOnClickListener{
            val intent = Intent(this@SettingActivity,LoginActivity::class.java)
            startActivity(intent)
        }

        btn_about.setOnClickListener{
            val intent = Intent(this@SettingActivity,AboutActivity::class.java)
            startActivity(intent)

        }

    }
    private fun setupActionBar() {

        setSupportActionBar(toolbar_forgot_password_activity)

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_drawble_color_black_24dp)
        }

        toolbar_forgot_password_activity.setNavigationOnClickListener { onBackPressed() }
    }
    }