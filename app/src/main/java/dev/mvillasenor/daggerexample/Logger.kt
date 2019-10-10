package dev.mvillasenor.daggerexample

import android.util.Log

class Logger() {
    fun d(message: () -> String){
        Log.d("logger", message())
    }
}
