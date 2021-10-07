package com.example.callbacksapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val act = "Activity 1"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(act, "onCreate:")
        val go = findViewById<Button>(R.id.btnactivity2)
        go.setOnClickListener(object :  View.OnClickListener {
            override fun onClick(v: View?) {

                val intent = Intent(this@MainActivity,MainActivity2::class.java)
                startActivity(intent)

            }

        })

    }
    override fun onStart() {
        super.onStart()
        showToast(this,"onStart Activity 1")
        Log.d(act, "onStart: ")

    }

    override fun onResume() {
        super.onResume()
        showToast(this,"onResume Activity 1")
        Log.d(act, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        showToast(this,"onPause Activity 1")
        Log.d(act, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        showToast(this,"onStop Activity 1")
        Log.d(act, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        showToast(this,"onDestroy Activity 1")
        Log.d(act, "onDestroy: ")
    }

    fun showToast(context: Context, state:String)
    {
        Toast.makeText(context,state,Toast.LENGTH_SHORT).show()
    }
}