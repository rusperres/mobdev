package com.example.activity_login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class example : AppCompatActivity() {
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
            var text = """
                First Name: ${fname.text}
                Last Name: ${lname.text}
                ID Number: ${id.text}
                Course: ${course.text}
                Year: ${year.text}
                """.trimIndent()
            var intent = Intent(this, Home::class.java)
            intent.putExtra("INFO", text)
            startActivity(intent)
        }


    }
}