package com.project.pixelsanddps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.util.TypedValue
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)

        //to set parameters for textView which is present in constraint layout
        val params = textView.layoutParams as ConstraintLayout.LayoutParams

        //using metrics from resources
        val metrics: DisplayMetrics = resources.displayMetrics

        //this is one way to set dp parameters to the views
        //converting the entered dp value to px
        val w = 100 / 160f * metrics.densityDpi

        //assigning the above acquired value to width parameter
//        params.width = w.toInt()

        params.height = makePixels(400)
        params.width = makePixels(200)

        //assigning the parameters to our view
        textView.layoutParams = params

    }

    //another method of conveting dp into px
    private fun makePixels(dp: Int): Int{
        val pixels = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                                                dp.toFloat(),
                                                resources.displayMetrics)
        return pixels.toInt()
    }

}