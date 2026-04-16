package com.example.activity_login

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        var textView1 = findViewById<TextView>(R.id.txtName1)
        var textView2 = findViewById<TextView>(R.id.txtName3)
        var textView3 = findViewById<TextView>(R.id.txtName3)
        var textView4 = findViewById<TextView>(R.id.txtName4)
        var textView5 = findViewById<TextView>(R.id.txtName5)
        var fname = intent.getStringExtra("FIRST")
        var lname = intent.getStringExtra("LAST")
        var id = intent.getStringExtra("ID")
        var course = intent.getStringExtra("COURSE")
        var year = intent.getStringExtra("YEAR")

        textView1.text = fname.toString()
        textView2.text = fname.toString()
        textView3.text = fname.toString()
        textView4.text = fname.toString()
        textView5.text = fname.toString()
    }
}