@file:Suppress("unused")

package com.jone.jinux.base.utils

import android.util.Log
import android.widget.Toast
import com.jone.music.audiocut.musiccut.App

/**
 * Created by jingu on 2018/1/6.
 *
 * debug utils
 */

fun log(s: String) {
    Log.d("JOne", s)
}

fun toast(s: String) {
    Toast.makeText(App.getInstance(), s, Toast.LENGTH_LONG).show()
}