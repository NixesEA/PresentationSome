package com.puter.presentationsome

import android.view.View

class Presenter(var view: presenterCallback) {


    fun firstEvent() {
        view.toastOne()
    }

    fun secondEvent(msg: String) {
        if (msg == "") {
            view.toastTwo("Empty message")
        } else {
            view.toastTwo(msg)
        }
    }

    interface presenterCallback {
        fun toastOne()

        fun toastTwo(msg: String)
    }

}