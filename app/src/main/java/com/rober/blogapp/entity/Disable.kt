package com.aayush.blogapp.entity

data class Disable(val dateDisabledMilliseconds: Long, var disabled: Boolean) {
    constructor() : this(0, false)
}