package com.nguyenvantuan;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Customer.class}, version = 1)
public abstract class AppCustomer extends RoomDatabase {
    private static AppCustomer appCustomer;
    public abstract CustomDao customDao();
    public static AppCustomer getAppCustomer(Context context){
        if(appCustomer == null){
            appCustomer = Room.databaseBuilder(context, AppCustomer.class, "Customer.DB").allowMainThreadQueries().build();
        }
        return appCustomer;
    }
}
