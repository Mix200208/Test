package com.example.test

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ListAdapter(val activity: Activity, val list: List<ProfileData>) :
        ArrayAdapter<ProfileData>(activity, R.layout.list_row) {

    override fun getCount(): Int {
        return list.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val contexs = activity.layoutInflater
        val rowView = contexs.inflate(R.layout.list_row, null)

        val images = rowView.findViewById<ImageView>(R.id.Image)
        val title = rowView.findViewById<TextView>(R.id.title)
        val txtSub = rowView.findViewById<TextView>(R.id.txtSub)

        title.text = list[position].title
        txtSub.text = list[position].desc
        images.setImageResource(list[position].image)

        return rowView
    }
}