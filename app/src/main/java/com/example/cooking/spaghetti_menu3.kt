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
    private var cookingTime_min = 0; // 요리 시간 분
    private var cookingTime_sec = 3; // 요리 시간 초
    private var minmin = 0;
    private var secsec = 0;
    private var min1= 0;
    private var sec1= 0;
    var recyclerView: RecyclerView? = null
    private var ddd = 0;
    private var kkk = 0;
    private var flag = 0;
    private var bb1 = 0 ;

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spaghetti_menu3)

        //인텐트 받기
        if (intent.hasExtra("min1") && intent.hasExtra("sec1"))
        {
            min1 = intent.getIntExtra("min1", 0)
            sec1 = intent.getIntExtra("sec1", 0)
            Log.e(TAG, "메인에서 받아온 분 : $min1, 시간 : $sec1")
        }else{
            Log.e(TAG, "없음")
        }

        minmin = min1
        secsec = sec1

        //인텐트 넘기기
        spaghetti3_button2.setOnClickListener {
            if(flag == 1){
                val intent = Intent(this, spaghetti_menu4::class.java)
                intent.putExtra("min1", minmin)
                intent.putExtra("sec1", bb1)
                startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
            }
        }

        //recyclerView = findViewById();
        spaghetti3_textView3.text = "[2 단계]. 소스 끓이기"	// TextView 세팅 8글자 넘어가면 넘어가버림.
        spaghetti3_textView4.text = "2인기준 냄비에 소스를 반정도붓고 3~5분 중약불에서 끓여줍니다"




        timerTask = kotlin.concurrent.timer(period = 1000) {	// timer() 호출
            time++	// period=10, 0.01초마다 time를 1씩 증가
            val df1 = DecimalFormat("00") //변수 포맷팅
            var sec = time	// time/100, 나눗셈의 몫 (초 부분)

            if(cookingTime_sec > 0){
                cookingTime_sec = cookingTime_sec-1;
            }
            if(cookingTime_sec===0){
                cookingTime_sec = 60;
                cookingTime_min -=1
            }
            var min = ceil((sec / 60).toDouble())

            if(sec+secsec >= 60){
                time = 0;
                minmin +=1;
                secsec = 0;
            }

            sec = time

            var a = df1.format(minmin)
            var b = df1.format(sec)


            if(cookingTime_sec==60){
                ddd =cookingTime_min + 1
                kkk = 0
            }
            else{
                ddd = cookingTime_min
                kkk = cookingTime_sec
            }
            var c = df1.format(ddd)
            var d = df1.format(kkk)

            if(ddd == 0 && kkk == 0){
                flag = 1;
            }

            // UI조작을 위한 메서드
            runOnUiThread {
                var bb = df1.format(secsec + sec)
                bb1 = secsec + sec
                spaghetti3_textView5.text = "$a : $bb"	// TextView 세팅
                spaghetti3_textView6.text = "$c : $d"	// TextView 세팅
            }

            // 7분 조리시간
            if(flag == 1){
                timerTask?.cancel()
            }
        }

    }
}