package com.nguyenvantuan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText edName, edEmail, edPhone;
    Button btAdd, btSearch;
    AppCustomer db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = AppCustomer.getAppCustomer(this);
        edName = findViewById(R.id.edName);
        edEmail = findViewById(R.id.edEmail);
        edPhone = findViewById(R.id.edPhone);
        btAdd = findViewById(R.id.btAdd);
        btSearch = findViewById(R.id.btSearch);
        btAdd.setOnClickListener(this);
        btSearch.setOnClickListener(this);
    }

    private void addCustomer(){
        Customer customer = new Customer();
        customer.setName(edName.getText().toString());
        customer.setPhone(edPhone.getText().toString());
        customer.setEmail(edEmail.getText().toString());
        db.customDao().insertCustom(customer);
    }

    private void goSearch(){
        Intent intent = new Intent(this, SearchActivity.class);
    }


    @Override
    public void onClick(View v) {
        if(v == btAdd){
            addCustomer();
        }
        if (v == btSearch){
            goSearch();
        }
    }
}