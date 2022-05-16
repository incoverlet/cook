package com.example.cooking

import android.content.Intent
import android.icu.text.DecimalFormat
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_spaghetti_menu12.*
import kotlinx.android.synthetic.main.activity_spaghetti_menu2.*
import java.util.*
import kotlin.math.ceil


class spaghetti_menu2 : AppCompatActivity() {
    private var timerTask: Timer? = null
    private var time = 0
    private var cookingTime_min = 0; // 요리 시간 분
    private var cookingTime_sec = 3; // 요리 시간 초
    private var minmin = 0;
    private var secsec = 0;
    var recyclerView: RecyclerView? = null
    private var ddd = 0;
    private var kkk = 0;


    //종료 flag
    private var flag = 0;

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_spaghetti_menu2)
            //spaghetti2_button2.setVisibility(View.INVISIBLE);

            //recyclerView = findViewById();
            spaghetti2_textView3.text = "[1 단계]. 면 삶기"	// TextView 세팅
            spaghetti2_textView4.text = "물이 끓으면 면을 넣습니다. \n 처음에는 건드리지 말고, \n 면이 풀어지면 살살 저어줍니다."	// TextView 세팅


            //인텐트 넘기기
            spaghetti2_button2.setOnClickListener {
                if(flag == 1){
                    val intent = Intent(this, spaghetti_menu3::class.java)
                    intent.putExtra("min1", minmin)
                    intent.putExtra("sec1", secsec)
                    startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
                }
            }
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

                if(sec >= 60){
                    time = 0;
                    minmin +=1;
                }

                var a = df1.format(minmin)
                var b = df1.format(sec)
                secsec = sec
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
                    spaghetti2_textView5.text = "$a : $b"	// TextView 세팅
                    spaghetti2_textView6.text = "$c : $d"	// TextView 세팅
                }

            // 7분 조리시간
                if(flag == 1){
                    timerTask?.cancel()
                }
        }
    }
}