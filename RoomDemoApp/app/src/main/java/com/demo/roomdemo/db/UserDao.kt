package com.demo.roomdemo.db

import androidx.room.*

@Dao
interface UserDao {
    @Query("SELECT * FROM books")
    fun getAllUserInfo(): List<BookEntity>?

    @Insert
    fun insertUser(book: BookEntity?)

    @Delete
    fun deleteUser(book: BookEntity?)

    @Update
    fun updateUser(book: BookEntity?)

}