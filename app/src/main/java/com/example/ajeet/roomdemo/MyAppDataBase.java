package com.example.ajeet.roomdemo;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {dataBase.class},version = 1)
public abstract class MyAppDataBase extends RoomDatabase {

    public abstract MyDataAccess MyDao();

}
