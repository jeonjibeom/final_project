package com.cookandroid.myfinal2

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.third.*

class ThirdActivity : Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third)

        btnclose.setOnClickListener {
            finish()
        }

    }

}