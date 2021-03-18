package com.nguyenvantuan;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface CustomDao {
    @Insert
    void insertCustom(Customer customer);

    @Query("SELECT * FROM Customer")
    List<Customer> getAllUser();

    @Query("SELECT * FROM Customer WHERE id = :id")
    Customer getCustom(int id);
}
