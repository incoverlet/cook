package com.example.cooking

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.viewpager.widget.PagerAdapter
import kotlinx.android.synthetic.main.activity_curry_menu7.*
import kotlinx.android.synthetic.main.layout_fruit.view.*

class FruitPagerAdapter(private val list: ArrayList<Fruit>): PagerAdapter() {

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val inflater = LayoutInflater.from(container.context)
        val view = inflater.inflate(R.layout.layout_fruit, container, false)

        //view.tvItemTitle.text = list[position].name
        view.ivItem.setImageResource(list[position].getImageId(container.context))
        view.tvItemContent.text = list[position].content

        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, obj: Any) {
        container.removeView(obj as View?)
    }

    override fun isViewFromObject(view: View, obj: Any): Boolean {
        return view == obj
    }

    override fun getCount(): Int {
        return list.size
    }
}