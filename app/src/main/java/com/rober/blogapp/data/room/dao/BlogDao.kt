package com.aayush.blogapp.data.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.aayush.blogapp.entity.Post

//@Dao
//interface BlogDao {
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    suspend fun insertBlog(post: Post): Long
//}