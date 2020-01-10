package com.example.belajarkotlinanimasi

import android.content.Intent
import android.os.Bundle
import android.view.animation.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.menu_pertama.*

class MainAnimasi : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_pertama)

        val fadeIn = AlphaAnimation(0f, 1f)
        fadeIn.interpolator = DecelerateInterpolator() as Interpolator?
        fadeIn.duration = 1000
        fadeIn.startOffset = 1000

        val fadeOut = AlphaAnimation(1f, 0f)
        fadeOut.interpolator = AccelerateInterpolator()
        fadeOut.duration = 1000
        fadeOut.startOffset = 1000

        val animasi = AnimationSet(false)
        animasi.addAnimation(fadeIn)
        animasi.addAnimation(fadeOut)
        imgmenu.animation = animasi

        val myanim = AnimationUtils.loadAnimation(this, R.anim.mytransition)
        text_logo.startAnimation(myanim)
        val i = Intent(this, MenuKedua::class.java)
        val timer = object : Thread() {
            override fun run() {
                try {
                    sleep(5000)
                } catch (e: InterruptedException) {
                    e.printStackTrace() }
                finally {
                    startActivity(i)
                    finish()
                }
            }
        }
        timer.start()

        val myanim2 = AnimationUtils.loadAnimation(this, R.anim.mytransition)
        text_logo2.startAnimation(myanim2)
        val timer2 = object : Thread() {
            override fun run() {
                try {
                    sleep(5000)
                } catch (e: InterruptedException) {
                    e.printStackTrace() }
            }
        }
        timer2.start()

    }
}