package com.example.belajarkotlinanimasi

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.menu_kedua.*

class MenuKedua : AppCompatActivity(){

    lateinit var animationDrawable: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_kedua)

        animationDrawable = relativeLay.background as AnimationDrawable
        animationDrawable.setEnterFadeDuration(3000)
        animationDrawable.setExitFadeDuration(3000)
        animationDrawable.start()

        next.setOnClickListener {
            startActivity(Intent(this, MenuKetiga::class.java))
        }

        back.setOnClickListener {
            startActivity(Intent(this, MainAnimasi::class.java))
        }

    }
}