package com.ijikod.connectivitycheckapp

enum class NetworkResult (val colorResId: Int, val messageResId: Int) {

    CONNECTED (android.R.color.holo_green_dark, R.string.connected_msg_txt),
    DISCONNECTED (android.R.color.holo_red_dark, R.string.disconnected_msg_txt),
    DISCONNECTING (android.R.color.holo_orange_dark, R.string.connecting_msg_txt)

}