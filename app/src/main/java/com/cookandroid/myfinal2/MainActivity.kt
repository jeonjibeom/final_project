package com.cookandroid.myfinal2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFirst.setOnClickListener {
            var intent = Intent(applicationContext, SecondActivitty::class.java)
            startActivity(intent)
        }
        btnSecond.setOnClickListener {
            var intent = Intent(applicationContext, ThirdActivity::class.java)
            startActivity(intent)
        }

    }

}
