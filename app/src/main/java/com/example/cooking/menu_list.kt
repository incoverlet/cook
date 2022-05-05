package com.example.cooking

import android.graphics.Color
import android.os.Bundle
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_menu_list.*
import kotlinx.android.synthetic.main.activity_profile.*


class menu_list : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_list)


        val mageDrawableArray = getResources().obtainTypedArray(R.array.lv11)
        val mageDrawableArray2 = getResources().obtainTypedArray(R.array.lv22)
        //var drawable = mageDrawableArray.getDrawable(0)

        //배열의 길이만큼 선언해줘야함
        //level1
        for( i in 1..6) {
            // Initialize a new LayoutParams instance, CardView width and height
            val layoutParams = RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,// CardView width
                ViewGroup.LayoutParams.MATCH_PARENT // CardView height
            )
            layoutParams.setMargins(75,75,75,75)
            val menuCardView = CardView(this)
            // Set bottom margin for card view
            //layoutParams.bottomMargin = 50
            // Set the card view layout params
            menuCardView.layoutParams = layoutParams
            // Set the card view corner radius
            menuCardView.radius = 12F
            // Set the card view content padding
            menuCardView.setContentPadding(75,75,75,75)
            // Set the card view background color
            menuCardView.setCardBackgroundColor(Color.LTGRAY)
            //list에 해당하는 그림으로 변경
            var drawable = mageDrawableArray.getDrawable(i)
            menuCardView.setBackgroundDrawable(drawable)
            // Set card view elevation
            menuCardView.cardElevation = 8F
            // Set card view maximum elevation
            menuCardView.maxCardElevation = 12F
            // Set a click listener for card view
            menuCardView.setOnClickListener{
                Toast.makeText(
                   applicationContext,
                   "해당하는 음식 이동"+ drawable.toString(),
                    Toast.LENGTH_SHORT).show()
            }
            // Add LinearLayout to the CardView
            menuCardView.addView(generateCardView())
            // Finally, add the CardView in root layout
            li_1.addView(menuCardView)
        }

        //level2
        for( i in 1..6) {
            // Initialize a new LayoutParams instance, CardView width and height
            val layoutParams = RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,// CardView width
                ViewGroup.LayoutParams.MATCH_PARENT // CardView height
            )
            layoutParams.setMargins(75,75,75,75)
            val menuCardView = CardView(this)
            // Set bottom margin for card view
            //layoutParams.bottomMargin = 50
            // Set the card view layout params
            menuCardView.layoutParams = layoutParams
            // Set the card view corner radius
            menuCardView.radius = 12F
            // Set the card view content padding
            menuCardView.setContentPadding(75,75,75,75)
            // Set the card view background color
            menuCardView.setCardBackgroundColor(Color.LTGRAY)
            //list에 해당하는 그림으로 변경
            menuCardView.setBackgroundDrawable(mageDrawableArray2.getDrawable(i))
            // Set card view elevation
            menuCardView.cardElevation = 8F
            // Set card view maximum elevation
            menuCardView.maxCardElevation = 12F
            // Set a click listener for card view
            menuCardView.setOnClickListener{
                Toast.makeText(
                    applicationContext,
                    "해당하는 음식 이동",
                    Toast.LENGTH_SHORT).show()
            }
            // Add LinearLayout to the CardView
            menuCardView.addView(generateCardView())
            // Finally, add the CardView in root layout
            li_2.addView(menuCardView)
        }

        for( i in 1..6) {
            // Initialize a new LayoutParams instance, CardView width and height
            val layoutParams = RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,// CardView width
                ViewGroup.LayoutParams.MATCH_PARENT // CardView height
            )
            layoutParams.setMargins(75,75,75,75)
            val menuCardView = CardView(this)
            // Set bottom margin for card view
            //layoutParams.bottomMargin = 50
            // Set the card view layout params
            menuCardView.layoutParams = layoutParams
            // Set the card view corner radius
            menuCardView.radius = 12F
            // Set the card view content padding
            menuCardView.setContentPadding(75,75,75,75)
            // Set the card view background color
            menuCardView.setCardBackgroundColor(Color.LTGRAY)
            //list에 해당하는 그림으로 변경
            menuCardView.setBackgroundDrawable(mageDrawableArray2.getDrawable(i))
            // Set card view elevation
            menuCardView.cardElevation = 8F
            // Set card view maximum elevation
            menuCardView.maxCardElevation = 12F
            // Set a click listener for card view
            menuCardView.setOnClickListener{
                Toast.makeText(
                    applicationContext,
                    "해당하는 음식 이동",
                    Toast.LENGTH_SHORT).show()
            }
            // Add LinearLayout to the CardView
            menuCardView.addView(generateCardView())
            // Finally, add the CardView in root layout
            li_3.addView(menuCardView)
        }
    }

    // Custom method to generate an image view
    private fun generateCardView(): LinearLayout {
        val cardLinearLayout = LinearLayout(this)
        cardLinearLayout.orientation = LinearLayout.VERTICAL
        //val restaurantName = TextView(this)
        //restaurantName.text = "파스쿠찌 잠실역점"
        //restaurantName.textSize = 24f
        //restaurantName.setTextColor(Color.BLACK)
        //val restaurantNumber = TextView(this)
        //restaurantNumber.text = "02-000-0000"
        //restaurantNumber.textSize = 17f
        //restaurantNumber.setTextColor(Color.WHITE)
        val restaurantAddress = TextView(this)
        restaurantAddress.text = "스파게티"
        restaurantAddress.textSize = 17f
        //restaurantAddress.setTextColor(Color.WHITE)
        //cardLinearLayout.addView(restaurantName)
        //cardLinearLayout.addView(restaurantNumber)
        //cardLinearLayout.addView(restaurantAddress)
        return cardLinearLayout

    }
}

