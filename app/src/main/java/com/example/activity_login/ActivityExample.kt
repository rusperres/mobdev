package com.example.activity_login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ActivityExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_example)

        var fname = findViewById<EditText>(R.id.firstName)
        var lname = findViewById<EditText>(R.id.lastName)
        var id= findViewById<EditText>(R.id.idNumber)
        var course= findViewById<EditText>(R.id.course)
        var year= findViewById<EditText>(R.id.year)
        var sInfo = findViewById<TextView>(R.id.studentInfo)
        var button = findViewById<Button>(R.id.btnClick)

        button.setOnClickListener {
//            Toast.makeText(this,
//                "Welcome ${editText.text}",
//                Toast.LENGTH_LONG).show()
            var intent = Intent(this, Home::class.java)
            intent.putExtra("FIRST", "First Name: ${fname.text}")
            intent.putExtra("LAST", "Last Name: ${lname.text}")
            intent.putExtra("ID", "ID Number: ${id.text}")
            intent.putExtra("COURSE","Course: ${course.text}")
            intent.putExtra("YEAR", "Year: ${year.text}")
            startActivity(intent)
        }


    }
}