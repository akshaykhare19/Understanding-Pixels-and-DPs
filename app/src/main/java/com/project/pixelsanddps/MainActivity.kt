package com.project.pixelsanddps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)

        val params = textView.layoutParams as ConstraintLayout.LayoutParams

        val metrics: DisplayMetrics = resources.displayMetrics

        val w = 300 / 160f * metrics.densityDpi

        params.width = w.toInt()

    }
}