package com.example.candyshop

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val firstName = "keisha"
        val lastName = "Heart"
        val Address = "Cape Town"
        val isMale = true
        val dayOfBirth = "15"
        val monthOfBirth = "August"
        val yearOfBirth = "2007"
        val male = null
        val Log = null
        Log.d ("Howzit my name is", firstName + " " + lastName + " and I live in " + Address + " it is "
                + male + " that I am male. I was born on " + dayOfBirth + " " + monthOfBirth + " " + yearOfBirth)



        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun d(string: String, string2: String) {}
}