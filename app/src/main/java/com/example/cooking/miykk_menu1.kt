package com.example.cooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_mixedrice_menu1.*
import kotlinx.android.synthetic.main.activity_miykk_menu1.*


public var text1_foodname = "소고기미역국"
public var text2  = "마른 미역 한 컵 \n 국거리용 소고기 150g\n 쌀뜨물\n 참기름 2숟갈\n 다진 마늘 1숟갈\n 국간장 2숟갈"
private var text3 = "권장소비 소유 시간 15"

class miykk_menu1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_miykk_menu1)


        var txt1 = findViewById(R.id.name_miykk_textView) as TextView
        txt1.setText(text1_foodname)

        var txt2 = findViewById(R.id.name_miykk_textView2) as TextView
        txt2.setText(text2)

        var txt3 = findViewById(R.id.name_miykk_textView3) as TextView
        txt3.setText(text3)


        menu_miykk_button1.setOnClickListener {
            val intent = Intent(this, miykk_menu2::class.java)
            startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }
    }
}