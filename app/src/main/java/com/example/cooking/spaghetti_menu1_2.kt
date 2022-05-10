package com.example.cooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_spaghetti_menu1.*
import kotlinx.android.synthetic.main.activity_spaghetti_menu12.*

class spaghetti_menu1_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spaghetti_menu12)

        menu_spagetti1_2_button1.setOnClickListener {
            val intent = Intent(this, spaghetti_menu2::class.java)
            startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }
    }
}