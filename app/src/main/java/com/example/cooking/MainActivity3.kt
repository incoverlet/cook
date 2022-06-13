package com.example.cooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    var i = 1;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val adapter = FruitPagerAdapter(fruitList)
        mViewPager.adapter = adapter


        main3_button1.setOnClickListener() {
            if(mViewPager.currentItem == 0) {
                val intent = Intent(this, mixedrice_menu1::class.java)
                startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
            }else if(mViewPager.currentItem == 1){
                val intent = Intent(this, curry_menu1::class.java)
                startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
            }else{
                val intent = Intent(this, spaghetti_menu1::class.java)
                startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
            }
        }

        main3_button2.setOnClickListener() {
            val intent = Intent(this, menu_list::class.java)
            startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }

    }


    companion object {
        val fruitList = arrayListOf(
            Fruit("", "pajun7", "지금 바로 파전을 만들어보세요"),
            Fruit("", "curry", "지금 바로 카레을 만들어보세요."),
            Fruit("", "rose6", "지금 바로 로제 떡볶이를 만들어보세요"),
        )
    }


}