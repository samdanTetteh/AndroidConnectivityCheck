package com.ijikod.connectivitycheckapp

import android.net.ConnectivityManager
import android.net.Network
import android.nfc.Tag
import android.util.Log

class ConnectivityManager : ConnectivityManager.NetworkCallback() {


    override fun onAvailable(network: Network) {
        Log.d(TAG, "Network $network is available")
    }

    override fun onLosing(network: Network, maxMsToLive: Int) {
        Log.d(TAG, "Losing network in the next $maxMsToLive MS ")
    }

    override fun onLost(network: Network) {
        Log.d(TAG, "Network lost")
    }

    companion object {
        private const val TAG = "NetworkCallback"
    }
}