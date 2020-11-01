package com.example.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlinlog.R
// ここを追加

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("nana", 20, "piano")
        human.say()
        human.think()
//
//
    }
}
