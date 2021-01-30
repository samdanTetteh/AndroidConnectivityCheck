package com.ijikod.connectivitycheckapp

import android.net.ConnectivityManager
import android.net.Network
import android.nfc.Tag
import android.util.Log
import androidx.lifecycle.MutableLiveData

class Callback : ConnectivityManager.NetworkCallback() {

    val result = MutableLiveData<NetworkResult>()


    override fun onAvailable(network: Network) {
        Log.d(TAG, "Network $network is available")
        result.postValue(NetworkResult.CONNECTED)
    }

    override fun onLosing(network: Network, maxMsToLive: Int) {
        Log.d(TAG, "Losing network in the next $maxMsToLive MS ")
        result.postValue(NetworkResult.DISCONNECTING)
    }

    override fun onLost(network: Network) {
        Log.d(TAG, "Network lost")
        result.postValue(NetworkResult.DISCONNECTED)
    }

    companion object {
        private const val TAG = "NetworkCallback"
    }
}