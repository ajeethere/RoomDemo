package com.example.ajeet.roomdemo;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface MyDataAccess {
    @Insert
    public void addData(dataBase database);

    @Query("select * from users")
    public List<dataBase> getUsers();

    @Delete
    public void deleteUser(dataBase database);

    @Update
    public void updateUser(dataBase database);

}
