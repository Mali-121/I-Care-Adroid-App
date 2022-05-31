package com.example.i_care.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.i_care.R
import com.example.i_care.ui.diet.BmiActivity
import com.example.i_care.ui.diet.CaloriesCalculatorActivity
import com.example.i_care.ui.exercise.BuildSelectionActivity
import kotlinx.android.synthetic.main.activity_interface_user.*

@Suppress ("Deprecation")
class InterfaceUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interface_user)



        btn_bmi.setOnClickListener{
            val intent = Intent(this@InterfaceUserActivity, BmiActivity::class.java)
            startActivity(intent)
        }
        btn_calorie_convertor.setOnClickListener{
            val intent = Intent(this@InterfaceUserActivity, CaloriesCalculatorActivity::class.java)
            startActivity(intent)
        }
        btn_select_build.setOnClickListener{
            val intent = Intent(this@InterfaceUserActivity, BuildSelectionActivity::class.java)
            startActivity(intent)
        }

        btn_setting.setOnClickListener{
            val intent = Intent(this@InterfaceUserActivity, SettingActivity::class.java)
            startActivity(intent)
        }
    }
}