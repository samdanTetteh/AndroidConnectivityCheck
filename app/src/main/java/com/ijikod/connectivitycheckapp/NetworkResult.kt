package com.ijikod.connectivitycheckapp

enum class NetworkResult (val colorResId: Int, val messageResId: Int) {

    CONNECTED (R.color.teal_700, R.string.connected_msg_txt),
    DISCONNECTED (R.color.black, R.string.disconnected_msg_txt),
    DISCONNECTING (R.color.purple_500, R.string.connecting_msg_txt)

}