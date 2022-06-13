package com.example.cooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_curry_menu1.*
import kotlinx.android.synthetic.main.activity_spaghetti_menu1.*
import java.util.*


class curry_menu1 : AppCompatActivity() {
    public var text1_foodname = "카레라이스"
    public var text2  = "재료 \n "+" 양파, 햄, 당근 반 개,\n" +
            "감자(증), 밥\n"
    private var text3 = "권장소비 소유 시간 1115"

    private var tts: TextToSpeech? = null
    private var btnSpeak: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_curry_menu1)

        var txt1 = findViewById(R.id.name_curry_textView) as TextView
        txt1.setText(text1_foodname)

        var txt2 = findViewById(R.id.name_curry_textView2) as TextView
        txt2.setText(text2)

        var txt3 = findViewById(R.id.name_curry_textView3) as TextView
        txt3.setText(text3)

        menu_curry_button1.setOnClickListener {
            val intent = Intent(this, curry_menu2::class.java)
            startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }

        TTS(this, "카레라이스 권장 소비 시간 15분 입니다.",true)
    }

}