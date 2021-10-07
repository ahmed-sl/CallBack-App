package com.example.callbacksapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    val act = "Activity 2"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Log.d(act, "onCreate: ")
    }
    override fun onStart() {
        super.onStart()
        showToast(this,"onStart Activity 2")
        Log.d(act, "onStart: ")

    }

    override fun onResume() {
        super.onResume()
        showToast(this,"onResume Activity 2")
        Log.d(act, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        showToast(this,"onPause Activity 2")
        Log.d(act, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        showToast(this,"onStop Activity 2")
        Log.d(act, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        showToast(this,"onDestroy Activity 2")
        Log.d(act, "onDestroy: ")
    }

    fun showToast(context: Context, state:String)
    {
        Toast.makeText(context,state, Toast.LENGTH_SHORT).show()
    }
}
