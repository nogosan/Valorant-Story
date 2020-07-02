package com.jincal.valorantstory.`object`

import android.app.Activity
import android.content.Context
import android.util.DisplayMetrics
import android.util.TypedValue
import androidx.fragment.app.Fragment

object ScreenSizeHolder {
    var screenWidth = 0
    var screenHeight = 0

    fun getPixelInfo(activity: Activity) {
        val displayMetrics = DisplayMetrics()
        activity.windowManager.defaultDisplay.getMetrics(displayMetrics)
        screenWidth = displayMetrics.widthPixels
        screenHeight = displayMetrics.heightPixels
    }

    fun dpToPx(fragment: Fragment, dp: Float): Float {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, fragment.resources.displayMetrics)
    }
}