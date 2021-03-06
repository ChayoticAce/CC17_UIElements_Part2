package com.chayoticace.cc17_uielements_part2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import android.widget.BaseAdapter
import android.widget.ImageView

class ImageAdapter(val c:Context) : BaseAdapter() {
    private val mContext: Context
    init {
        mContext = c
    }
    //References to the image
    var thumbImages = arrayOf<Int>(
        R.drawable.gorillaz,
        R.drawable.kendrick,
        R.drawable.prototype_2
    )
    override fun getCount(): Int {
        return thumbImages.size
    }
    override fun getItem(position: Int): Any? {
        return null
    }
    override fun getItemId(position: Int): Long {
        return 0
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val imageView = ImageView(mContext)
        imageView.setLayoutParams(GridView@ AbsListView.LayoutParams(300, 300))
//        imageView.layoutParams = AbsListView.LayoutParams(200, 200) //just the same as above but different syntax
        imageView.scaleType = ImageView.ScaleType.CENTER_CROP
        imageView.setPadding(8, 8, 8, 8)
        imageView.setImageResource(thumbImages[position])
        return imageView
    }
}