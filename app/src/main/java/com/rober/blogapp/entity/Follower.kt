package com.aayush.blogapp.entity

import androidx.room.PrimaryKey

data class Follower(
    @PrimaryKey
    val followerId: String
) {
  constructor() : this("")
}