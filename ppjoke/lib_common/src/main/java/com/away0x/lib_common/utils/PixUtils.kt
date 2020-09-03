package com.away0x.lib_common.utils

import com.away0x.lib_common.global.AppGlobals

object PixUtils {

    fun dp2px(dpValue: Int): Int {
        val metrics = AppGlobals.getApplication().resources.displayMetrics
        return (metrics.density * dpValue + 0.5f) as Int
    }

    fun getScreenWidth(): Int {
        val metrics = AppGlobals.getApplication().resources.displayMetrics
        return metrics.widthPixels
    }

    fun getScreenHeight(): Int {
        val metrics = AppGlobals.getApplication().resources.displayMetrics
        return metrics.heightPixels
    }

}