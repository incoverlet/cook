package com.example.cooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kakao.sdk.user.UserApiClient
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_profile.*

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        Advanced_button.setOnClickListener {
            val intent = Intent(this, advance_level1::class.java)
            startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }

        Beginner_button3.setOnClickListener {
            val intent = Intent(this, beginner_level1::class.java)
            startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }

        Intermediate_button2.setOnClickListener {
            val intent = Intent(this, advance_level1::class.java)
            startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }
    }
}