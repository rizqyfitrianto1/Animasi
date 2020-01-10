package com.example.belajarkotlinanimasi

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.menu_ketiga.*

class MenuKetiga : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_ketiga)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

        val animDrawable = root_layout.background as AnimationDrawable
        animDrawable.setEnterFadeDuration(10)
        animDrawable.setExitFadeDuration(5000)
        animDrawable.start()

        fade_in.setOnClickListener {
            logo.visibility = View.VISIBLE
            val animation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            logo.startAnimation(animation)
        }
        fade_out.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.fade_out)
            logo.startAnimation(animation)
            Handler().postDelayed({
                logo.visibility = View.GONE
            }, 1000)
        }
        zoom_in.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
            logo.startAnimation(animation)
        }
        zoom_out.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.zoom_out)
            logo.startAnimation(animation)
        }
        slide_down.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.slide_down)
            logo.startAnimation(animation)
        }
        slide_up.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.slide_up)
            logo.startAnimation(animation)
        }
        bounce.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            logo.startAnimation(animation)
        }
        rotate.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.rotate)
            logo.startAnimation(animation)
        }
    }
}