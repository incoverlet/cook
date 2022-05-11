package com.example.cooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_beginner_level1.*
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_spaghetti_menu1.*

class spaghetti_menu1 : AppCompatActivity() {

    public var text1_foodname = "스파게티"
    public var text2  = "재료 \n "+" 스파게티 면\n" +
            "스파게티 소스\n" +
            "냄비\n"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spaghetti_menu1)


        var txt1 = findViewById(R.id.name_spagetti_textView) as TextView
        txt1.setText(text1_foodname)

        var txt2 = findViewById(R.id.name_spagetti_textView2) as TextView
        txt2.setText(text2)


        menu_spagetti_button1.setOnClickListener {
            val intent = Intent(this, spaghetti_menu1_2::class.java)
            startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }
    }
}