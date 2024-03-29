package ru.netology.statsview

import android.animation.LayoutTransition
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.animation.BaseInterpolator
import android.view.animation.BounceInterpolator
import android.view.animation.CycleInterpolator
import android.view.animation.LinearInterpolator
import android.view.animation.OvershootInterpolator
import androidx.appcompat.app.AppCompatActivity
import kotlin.time.Duration.Companion.days

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = findViewById<ViewGroup>(R.id.root)
        val goButton = findViewById<View>(R.id.goButton)

        root.layoutTransition = LayoutTransition().apply {
            setDuration(1_000)
            setInterpolator(LayoutTransition.CHANGE_APPEARING, OvershootInterpolator(4F))
        }
        goButton.setOnClickListener {
            val view = layoutInflater.inflate(R.layout.stats_view, root, false)
            root.addView(view, 0)
        }
    }
}