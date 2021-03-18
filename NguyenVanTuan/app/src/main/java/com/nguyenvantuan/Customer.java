package com.nguyenvantuan;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Customer")
public class Customer {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "Name")
    private String Name;

    @ColumnInfo(name = "Email")
    private  String Email;

    @ColumnInfo(name = "Phone")
    private String Phone;

    @ColumnInfo(name = "Gender")
    private String Gender;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}
