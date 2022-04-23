package com.example.cooking

import android.icu.text.DecimalFormat
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_spaghetti_menu2.*
import java.util.*
import kotlin.math.ceil
import kotlin.math.roundToInt

class spaghetti_menu2 : AppCompatActivity() {
    private var timerTask: Timer? = null
    private var time = 0


    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spaghetti_menu2)

        spaghetti2_button2.setVisibility(View.INVISIBLE);

        timerTask = kotlin.concurrent.timer(period = 10) {	// timer() 호출
            time++	// period=10, 0.01초마다 time를 1씩 증가

            //요리시간 변수 설정
            val cookingTime = 7.0;
            //변수 포맷팅
            val df1 = DecimalFormat("00")
            var sec = time / 100	// time/100, 나눗셈의 몫 (초 부분)
            if(sec > 60){
                sec = 0;

            }
            val min = ceil((sec / 60).toDouble())
            //화면에 보이기 위한 변수형태 포맷에 따른 변수들 선언
            val min2 = min.roundToInt()
            val min3 = df1.format(min2)
            val min4 = df1.format(6-min2)
            val sec2 = df1.format(59-sec)

            // UI조작을 위한 메서드
            runOnUiThread {
                spaghetti2_textView5.text = "$min3 : $sec"	// TextView 세팅
                spaghetti2_textView6.text = "$min4 : $sec2"	// TextView 세팅
            }

            // 7분 조리시간
            if(min==cookingTime){
                spaghetti2_button2.setVisibility(View.VISIBLE);
            }
        }
    }
}