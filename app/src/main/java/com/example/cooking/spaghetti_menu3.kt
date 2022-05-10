package com.example.cooking

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class spaghetti_menu3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spaghetti_menu3)

        if (intent.hasExtra("min1") && intent.hasExtra("sec1"))
        {
            val min1 = intent.getIntExtra("min1", 0)
            val sec1 = intent.getIntExtra("sec1", 0)
            Log.e(TAG, "메인에서 받아온 분 : $min1, 시간 : $sec1")
        }else{
            Log.e(TAG, "없음")
        }
    }
}