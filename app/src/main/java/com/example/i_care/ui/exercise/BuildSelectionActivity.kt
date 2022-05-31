package com.example.i_care.ui.exercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.i_care.R
import kotlinx.android.synthetic.main.activity_build_selection.*
import kotlinx.android.synthetic.main.activity_food_calorie.*
import kotlinx.android.synthetic.main.activity_food_calorie.toolbar_forgot_password_activity

@Suppress("Deprecation")
class BuildSelectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_build_selection)



        setupActionBar()
        btn_Buil1.setOnClickListener{
            val intent = Intent(this@BuildSelectionActivity, Build1Activity::class.java)
            startActivity(intent)
        }

        btn_build2.setOnClickListener{
            val intent = Intent(this@BuildSelectionActivity, Build2Activity::class.java)
            startActivity(intent)
        }
        btn_build3.setOnClickListener{
            val intent = Intent(this@BuildSelectionActivity, Build3Activity::class.java)
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