package com.ijikod.connectivitycheckapp

import android.content.Context
import android.net.ConnectivityManager
import androidx.lifecycle.LiveData


class Manager(context: Context) {

    private val factory: Factory = Factory()
    private val callback: Callback = Callback()

    private val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

    val result: LiveData<NetworkResult>
        get() = callback.result



    fun registerCallback(){
        val request = factory.wifiRequest()
        connectivityManager.registerNetworkCallback(request, callback)
    }

    fun unregisterCallback(){
        connectivityManager.unregisterNetworkCallback(callback)
    }

}