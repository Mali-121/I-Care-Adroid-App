package com.example.i_care.ui.diet

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import com.example.i_care.R
import kotlinx.android.synthetic.main.activity_food_calorie.*
import kotlinx.android.synthetic.main.activity_food_calorie.toolbar_forgot_password_activity
import kotlinx.android.synthetic.main.activity_forgot_password.*

@Suppress("Deprecation")
class FoodCalorieActivity : AppCompatActivity() {
    companion object {
        const val EXTRA1 = "cal"
        const val EXTRA2 = "food"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_calorie)
        // when click confirm, read and store the user's entered value
        confirm2.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View) {
                val cal = Calories.text.toString()
                val food = food_and_cal.text.toString()
                val res = Intent()
                res.putExtra(FoodCalorieActivity.EXTRA1,cal)
                res.putExtra(FoodCalorieActivity.EXTRA2,food)
                setResult(Activity.RESULT_OK, res)
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