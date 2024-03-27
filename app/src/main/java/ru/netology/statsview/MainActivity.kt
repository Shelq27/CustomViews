package ru.netology.statsview

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.BounceInterpolator
import android.view.animation.LinearInterpolator
import android.widget.TextView
import ru.netology.statsview.ui.StatsTextView
import ru.netology.statsview.ui.StatsView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view = findViewById<StatsView>(R.id.statsView)
        val viewText = findViewById<StatsTextView>(R.id.statsTextView)
        view.data = listOf(
            500F,
            500F,
            500F,
            500F
        )
        viewText.data = view.data

        view.animate()
            .rotation(360F)
            .setDuration(2000)
            .start()
    }
}