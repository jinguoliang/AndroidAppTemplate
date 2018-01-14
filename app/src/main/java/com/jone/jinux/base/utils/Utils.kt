@file:Suppress("unused")

package com.jone.jinux.base.utils

import android.content.Context
import android.os.IBinder
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.jone.music.audiocut.musiccut.App

/**
 * Created by Jinux on 16/12/14.
 *
 * utils
 */

fun showSoftInput(view: View) {
    val imm = App.getInstance().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm?.showSoftInput(view, 0)
}

fun hideSoftInput(windowToken: IBinder) {
    val imm = App.getInstance().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm?.hideSoftInputFromWindow(windowToken, 0)
}

