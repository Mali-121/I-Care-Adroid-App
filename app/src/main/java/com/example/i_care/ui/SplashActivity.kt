package com.example.i_care.ui

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import com.example.i_care.R
import com.example.i_care.ui.diet.BmiActivity
import com.example.i_care.ui.diet.CaloriesCalculatorActivity
import com.example.i_care.ui.exercise.BuildSelectionActivity

@Suppress("Deprecation")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this@SplashActivity, LoginActivity::class.java))
            finish()
        },2500)

        /*
        val typeface: Typeface =
            Typeface.createFromAsset(assets, "Montserrat-Bold.ttf")
        app_name.typeface = typeface
        */

    }
}