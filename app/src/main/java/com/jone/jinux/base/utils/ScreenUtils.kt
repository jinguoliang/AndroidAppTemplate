package com.jone.jinux.base.utils

import android.content.Context
import android.util.DisplayMetrics
import android.util.Size
import android.view.WindowManager

/**
 * Created by jingu on 2018/1/6.
 */

fun getScreenWidth(c: Context): Int {
    val mWm = c.getSystemService(Context.WINDOW_SERVICE) as WindowManager
    val metrics = DisplayMetrics()
    mWm.defaultDisplay.getMetrics(metrics)
    return metrics.widthPixels
}

fun getScreenHeight(c: Context): Int {
    val mWm = c.getSystemService(Context.WINDOW_SERVICE) as WindowManager
    val metrics = DisplayMetrics()
    mWm.defaultDisplay.getMetrics(metrics)
    return metrics.heightPixels
}

fun getScreenSize(c: Context): Size {
    val mWm = c.getSystemService(Context.WINDOW_SERVICE) as WindowManager
    val metrics = DisplayMetrics()
    mWm.defaultDisplay.getMetrics(metrics)
    return Size(metrics.widthPixels, metrics.heightPixels)
}