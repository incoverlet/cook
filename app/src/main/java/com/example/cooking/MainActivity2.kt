package com.example.cooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_spaghetti_menu1.*

class MainActivity2 : AppCompatActivity() {

    public var username = "김태담"
    public var rec_menu = "마카롱"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var txt1 = findViewById(R.id.name_spagetti_textView) as TextView
        txt1.setText(username+"님 \n오늘은 이런 요리는 \n어때요?")

        var txt2 = findViewById(R.id.main2_button2213123) as TextView
        txt2.setText("지금 바로 "+rec_menu+"을 만들어보세요")

        //main2_button2.setOnClickListener {
        //    val intent = Intent(this, rec_menu_ac::class.java)
        //    startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        //}

        menu_button1.setOnClickListener {
            val intent = Intent(this, menu_list::class.java)
            startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }
    }
}