package com.example.lottietestproject

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startLoading()
    }
    private fun startLoading() {
        val handler = Handler()
        handler.postDelayed({
            var intent = Intent(this,nextActivity::class.java)
        startActivity(intent)
        }, 2500)


    }
}