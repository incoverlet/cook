package com.example.cooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_garlicbread_menu2.*
import kotlinx.android.synthetic.main.activity_miykk_menu2.*

class miykk_menu2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_miykk_menu2)
        var text3  = "1. 재료 손질(10분)\n\n2. 재료 볶기(5분)\n\n3. 물 붓기(2분)\n\n4. 카레가루 넣고 끓여(5분)\n" +
                "\n5. 플레이팅\n\n 완성"



        var txt3 = findViewById(R.id.menu_miykk_2_text1) as TextView
        txt3.setText(text3)

        menu_miykk_2_button1.setOnClickListener {
            val intent = Intent(this, miykk_menu3::class.java)
            startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }
    }

}