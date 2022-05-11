package com.example.cooking

import android.content.ContentValues.TAG
import android.content.Intent
import android.icu.text.DecimalFormat
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_spaghetti_menu2.*
import kotlinx.android.synthetic.main.activity_spaghetti_menu3.*
import java.util.*
import kotlin.math.ceil
import android.os.Build
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_spaghetti_menu12.*
import kotlinx.android.synthetic.main.activity_spaghetti_menu2.*
import java.util.*
import kotlin.math.ceil

class spaghetti_menu3 : AppCompatActivity() {
    private var timerTask: Timer? = null
    private var time = 0
    private var cookingTime_min = 7; // 요리 시간 분
    private var cookingTime_sec = 30; // 요리 시간 초
    private var minmin = 0;
    private var secsec = 0;
    var recyclerView: RecyclerView? = null
    private var ddd = 0;
    private var kkk = 0;
    private var flag = 0;


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
        //recyclerView = findViewById();
        spaghetti3_textView3.text = "[2 단계]. 면 삶기"	// TextView 세팅
        spaghetti3_textView4.text = "2인기준 냄비에 소스를 반정도붓고 3~5분 중약불에서 끓여줍니다"

    }
}