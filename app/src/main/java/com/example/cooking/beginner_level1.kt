package com.example.cooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_beginner_level1.*
import kotlinx.android.synthetic.main.activity_profile.*

class beginner_level1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beginner_level1)

        var i = spaghetti_menu1::class.java;
        beginner_imageButton1.setOnClickListener {
            val intent = Intent(this, i)
            startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }


        beginner_imageButton2.setOnClickListener {
            val intent = Intent(this, beginner_level1::class.java)
            startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }

        beginner_imageButton3.setOnClickListener {
            val intent = Intent(this, beginner_level1::class.java)
            startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }

        beginner_imageButton4.setOnClickListener {
            val intent = Intent(this, beginner_level1::class.java)
            startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }

    }
}