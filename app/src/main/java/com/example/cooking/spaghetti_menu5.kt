package com.example.cooking

import android.content.ContentValues
import android.content.Intent
import android.icu.text.DecimalFormat
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_spaghetti_menu1.*
import kotlinx.android.synthetic.main.activity_spaghetti_menu4.*
import kotlinx.android.synthetic.main.activity_spaghetti_menu5.*
import java.util.*
import kotlin.math.ceil

class spaghetti_menu5 : AppCompatActivity() {
    private var timerTask: Timer? = null
    private var time = 0
    private var cookingTime_min = 0; // 요리 시간 분
    private var cookingTime_sec = 3; // 요리 시간 초
    private var minmin = 0;
    private var secsec = 0;
    private var min1= 0;
    private var sec1= 0;
    private var ddd = 0;
    private var kkk = 0;
    private var flag = 0;
    private var bb1 = 0;

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spaghetti_menu5)

        spaghetti5_button2.setOnClickListener {
            val intent = Intent(this, spaghettti_menu6::class.java)
            startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }

        //인텐트 받기
        if (intent.hasExtra("min1") && intent.hasExtra("sec1"))
        {
            min1 = intent.getIntExtra("min1", 0)
            sec1 = intent.getIntExtra("sec1", 9)
            Log.e(ContentValues.TAG, "메인에서 받아온 분 : $min1, 시간 : $sec1")
        }else{
            Log.e(ContentValues.TAG, "없음")
        }



        //recyclerView = findViewById();
        spaghetti5_textView3.text = "[4 단계].  플레이팅"	// TextView 세팅
        spaghetti5_textView4.text = "납작한 그릇에 스파게티를 답고\n" + "집게로 모양을 잡아줍니다."


        minmin = min1
        secsec = sec1

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
                ddd = cookingTime_min + 1
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
                bb1 = secsec +sec
                spaghetti5_textView5.text = "$a : $bb"	// TextView 세팅
                spaghetti5_textView6.text = "$c : $d"	// TextView 세팅
            }

            // 7분 조리시간
            if(flag == 1){
                timerTask?.cancel()
            }
        }
    }
}