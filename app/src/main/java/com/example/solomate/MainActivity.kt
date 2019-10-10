package com.example.solomate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        val i =Intent(this, Registerhere::class.java)
        startActivity(i)
        val a=Intent(this, Main2Activity::class.java)
        startActivity(a)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView2.setOnClickListener(this)
        li.setOnClickListener(this)
    }
}
