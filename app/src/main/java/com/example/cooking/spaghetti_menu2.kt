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
import android.widget.ImageView;

class spaghetti_menu2 : AppCompatActivity() {
    private var timerTask: Timer? = null
    private var time = 0
    private var cookingTime_min = 7; // 요리 시간 분
    private var cookingTime_sec = 0; // 요리 시간 초
    private var minmin = 0;
    private var secsec = 59;
    //종료 flag
    private var flag = 0;

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_spaghetti_menu2)
            spaghetti2_button2.setVisibility(View.INVISIBLE);

            timerTask = kotlin.concurrent.timer(period = 10) {	// timer() 호출
                time++	// period=10, 0.01초마다 time를 1씩 증가
                val df1 = DecimalFormat("00") //변수 포맷팅

                var sec = time / 100	// time/100, 나눗셈의 몫 (초 부분)

                var min = ceil((sec / 60).toDouble())
                var min2 = min.roundToInt()

                if(sec >= 60){
                    time = 0;
                    minmin +=1;
                    cookingTime_min -= 1;
                }
                if(cookingTime_min < 0 && secsec < 0) {
                    flag = 1;
                    cookingTime_min = 0;
                    secsec = 0;
                    sec = 0;
                }

            //val min_under = df1.format(cookingTime)
            //val sec_under = df1.format(cookingTime_min_view-sec)
                var a = df1.format(minmin)
                var b = df1.format(sec)
                var c = df1.format(cookingTime_min - minmin)
                var d = df1.format(cookingTime_sec - sec)
            // UI조작을 위한 메서드
                runOnUiThread {
                    spaghetti2_textView5.text = "$a : $b"	// TextView 세팅
                    spaghetti2_textView6.text = "$c : $d"	// TextView 세팅
                }

            // 7분 조리시간
                if(flag == 1){
                    spaghetti2_button2.setVisibility(View.VISIBLE);
                    timerTask?.cancel()
                }
        }
    }
}