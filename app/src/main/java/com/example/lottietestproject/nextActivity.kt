package com.example.lottietestproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.airbnb.lottie.LottieAnimationView

class nextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        var button  = findViewById<Button>(R.id.btn)
        var button2 = findViewById<Button>(R.id.btn2)
        button.setOnClickListener {
                var animation = findViewById<LottieAnimationView>(R.id.lottie_view)
            animation.setAnimation(R.raw.fireworksicon)
            animation.playAnimation()
        }

        button2.setOnClickListener {
            var animation = findViewById<LottieAnimationView>(R.id.lottie_view)
            animation.setAnimation(R.raw.heart)
            animation.playAnimation()
        }
    }
}