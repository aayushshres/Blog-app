package com.aayush.blogapp.util

import android.graphics.Bitmap

interface AsyncResponse {
    fun processFinish(processedBitmap: Bitmap?)
}