package com.demo.roomdemo

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.demo.roomdemo.db.RoomAppDb
import com.demo.roomdemo.db.BookEntity

class MainActivityViewModel(app: Application): AndroidViewModel(app) {
    lateinit var allUsers : MutableLiveData<List<BookEntity>>

    init{
        allUsers = MutableLiveData()
        getAllUsers()
    }

    fun getAllUsersObservers(): MutableLiveData<List<BookEntity>> {
        return allUsers
    }

    fun getAllUsers() {
        val userDao = RoomAppDb.getAppDatabase((getApplication()))?.userDao()
        val list = userDao?.getAllUserInfo()

        allUsers.postValue(list)
    }

    fun insertUserInfo(entity: BookEntity){
        val userDao = RoomAppDb.getAppDatabase(getApplication())?.userDao()
        userDao?.insertUser(entity)
        getAllUsers()
    }

    fun updateUserInfo(entity: BookEntity){
        val userDao = RoomAppDb.getAppDatabase(getApplication())?.userDao()
        userDao?.updateUser(entity)
        getAllUsers()
    }

    fun deleteUserInfo(entity: BookEntity){
        val userDao = RoomAppDb.getAppDatabase(getApplication())?.userDao()
        userDao?.deleteUser(entity)
        getAllUsers()
    }
}