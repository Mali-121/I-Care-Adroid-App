package com.example.i_care.ui.diet

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import com.example.i_care.R
import kotlinx.android.synthetic.main.activity_food_calorie.*
import kotlinx.android.synthetic.main.activity_sport_calorie.*
import kotlinx.android.synthetic.main.activity_sport_calorie.toolbar_forgot_password_activity

@Suppress("Deprecation")
class SportCalorieActivity : AppCompatActivity() {
    companion object {
        const val EXTRA1 = "cal2"
        const val EXTRA2 = "sport"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sport_calorie)
        confirm3.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View) {
                val cal2 = Calories2.text.toString()
                val sport = sport_and_cal.text.toString()
                val res2 = Intent()
                res2.putExtra(SportCalorieActivity.EXTRA1,cal2)
                res2.putExtra(SportCalorieActivity.EXTRA2,sport)
                setResult(Activity.RESULT_OK, res2)
                finish()
            }
        })

        setupActionBar()
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