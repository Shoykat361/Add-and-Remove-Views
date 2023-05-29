package com.shoykat.chellangeapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    private var parentLinearLayout: LinearLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "KotlinApp"
        parentLinearLayout = findViewById(R.id.parent_linear_layout)
    }
    fun onDelete(view: View) {
        parentLinearLayout!!.removeView(view.parent as View)
    }
    fun onAddField(view: View) {
        val inflater =
            getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rowView: View = inflater.inflate(R.layout.field, null)
        parentLinearLayout!!.addView(rowView, parentLinearLayout!!.childCount - 1)
    }


}