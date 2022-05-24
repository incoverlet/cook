package com.example.cooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_garlicbread_menu8.*
import kotlinx.android.synthetic.main.activity_mixedrice_menu8.*

class mixedrice_menu8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mixedrice_menu8)
        mixedrice8_button.setOnClickListener {
            val intent = Intent(this, menu_list::class.java)
            startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }
    }
}