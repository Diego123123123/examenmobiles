package com.demo.roomdemo.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\'J\u0010\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\'J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\'J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\'\u00a8\u0006\n"}, d2 = {"Lcom/demo/roomdemo/db/UserDao;", "", "deleteUser", "", "book", "Lcom/demo/roomdemo/db/BookEntity;", "getAllUserInfo", "", "insertUser", "updateUser", "app_debug"})
public abstract interface UserDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM books")
    public abstract java.util.List<com.demo.roomdemo.db.BookEntity> getAllUserInfo();
    
    @androidx.room.Insert()
    public abstract void insertUser(@org.jetbrains.annotations.Nullable()
    com.demo.roomdemo.db.BookEntity book);
    
    @androidx.room.Delete()
    public abstract void deleteUser(@org.jetbrains.annotations.Nullable()
    com.demo.roomdemo.db.BookEntity book);
    
    @androidx.room.Update()
    public abstract void updateUser(@org.jetbrains.annotations.Nullable()
    com.demo.roomdemo.db.BookEntity book);
}