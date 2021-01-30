package com.ijikod.connectivitycheckapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer

class MainActivity : AppCompatActivity() {

    private val networkManager by lazy { Manager(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val connectionTxt = findViewById<TextView>(R.id.connectivity_status_txt)

        networkManager.result.observe(this, Observer<NetworkResult> { result ->
                with (result) {
                    connectionTxt.setText(messageResId)
                    connectionTxt.setTextColor(colorResId)
                }
        })
    }


    override fun onStart() {
        super.onStart()
        networkManager.registerCallback()
    }


    override fun onDestroy() {
        super.onDestroy()
        networkManager.unregisterCallback()
    }
}