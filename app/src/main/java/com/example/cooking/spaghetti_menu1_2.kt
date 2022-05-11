package com.example.cooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_spaghetti_menu1.*
import kotlinx.android.synthetic.main.activity_spaghetti_menu12.*

class spaghetti_menu1_2 : AppCompatActivity() {

    var text3  = "1. 면 삶기(7분)\n\n2. 소스 끓이기(5분)\n\n3. 볶기(2분)\n\n4. 플레이팅\n\n 완성"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spaghetti_menu12)


        var txt3 = findViewById(R.id.menu_spagetti1_2_text1) as TextView
        txt3.setText(text3)

        menu_spagetti1_2_button1.setOnClickListener {
            val intent = Intent(this, spaghetti_menu2::class.java)
            startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }
    }
}