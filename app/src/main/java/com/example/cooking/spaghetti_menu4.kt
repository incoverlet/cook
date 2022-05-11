package com.example.cooking

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_spaghetti_menu3.*
import kotlinx.android.synthetic.main.activity_spaghetti_menu4.*

class spaghetti_menu4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spaghetti_menu4)

        if (intent.hasExtra("min1") && intent.hasExtra("sec1"))
        {
            val min1 = intent.getIntExtra("min1", 0)
            val sec1 = intent.getIntExtra("sec1", 0)
            Log.e(ContentValues.TAG, "메인에서 받아온 분 : $min1, 시간 : $sec1")
        }else{
            Log.e(ContentValues.TAG, "없음")
        }
        //recyclerView = findViewById();
        spaghetti4_textView3.text = "[2 단계]. 면 삶기"	// TextView 세팅
        spaghetti4_textView4.text = "2인기준 냄비에 소스를 반정도붓고 3~5분 중약불에서 끓여줍니다"

    }
}