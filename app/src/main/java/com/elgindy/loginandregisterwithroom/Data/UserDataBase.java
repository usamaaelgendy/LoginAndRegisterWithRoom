package com.elgindy.loginandregisterwithroom.Data;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.elgindy.loginandregisterwithroom.Model.User;


@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class UserDataBase extends RoomDatabase {

    public abstract UserDao getUserDao();

}

