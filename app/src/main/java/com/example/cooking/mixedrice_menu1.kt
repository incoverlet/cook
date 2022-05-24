package com.example.cooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_curry_menu1.*
import kotlinx.android.synthetic.main.activity_mixedrice_menu1.*

class mixedrice_menu1 : AppCompatActivity() {

    public var text1_foodname = "마늘빵"
    public var text2  = "재료 \n "+" 남은 식빵 아무거나\n" +
            "마요네즈 3큰술\n" + "마늘2개\n 파슬리(생략 가능)"
    private var text3 = "권장소비 소유 시간 15"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mixedrice_menu1)


        var txt1 = findViewById(R.id.name_mixedrice_textView) as TextView
        txt1.setText(text1_foodname)

        var txt2 = findViewById(R.id.name_mixedrice_textView2) as TextView
        txt2.setText(text2)

        var txt3 = findViewById(R.id.name_mixedrice_textView3) as TextView
        txt3.setText(text3)


        menu_mixedrice_button1.setOnClickListener {
            val intent = Intent(this, garlicbread_menu2::class.java)
            startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }
    }
}