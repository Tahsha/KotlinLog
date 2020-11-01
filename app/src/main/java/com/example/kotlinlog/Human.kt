package com.example.kotlinlog

import android.util.Log

open class Human: Animal {
    var hobby:String


    // 引数付きコンストラクタ

    constructor(name: String, age: Int,hobby: String) : super(name, age) {
        this.hobby = hobby
    }


    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }


    public fun think() {
        Log.d("kotlintest", "私は" + this.hobby + "ついて考える。")
    }
}