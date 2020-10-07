package com.demo.roomdemo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u000eJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bR&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lcom/demo/roomdemo/MainActivityViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allUsers", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/demo/roomdemo/db/BookEntity;", "getAllUsers", "()Landroidx/lifecycle/MutableLiveData;", "setAllUsers", "(Landroidx/lifecycle/MutableLiveData;)V", "deleteUserInfo", "", "entity", "getAllUsersObservers", "insertUserInfo", "updateUserInfo", "app_debug"})
public final class MainActivityViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.MutableLiveData<java.util.List<com.demo.roomdemo.db.BookEntity>> allUsers;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.demo.roomdemo.db.BookEntity>> getAllUsers() {
        return null;
    }
    
    public final void setAllUsers(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.demo.roomdemo.db.BookEntity>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.demo.roomdemo.db.BookEntity>> getAllUsersObservers() {
        return null;
    }
    
    public final void getAllUsers() {
    }
    
    public final void insertUserInfo(@org.jetbrains.annotations.NotNull()
    com.demo.roomdemo.db.BookEntity entity) {
    }
    
    public final void updateUserInfo(@org.jetbrains.annotations.NotNull()
    com.demo.roomdemo.db.BookEntity entity) {
    }
    
    public final void deleteUserInfo(@org.jetbrains.annotations.NotNull()
    com.demo.roomdemo.db.BookEntity entity) {
    }
    
    public MainActivityViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
}