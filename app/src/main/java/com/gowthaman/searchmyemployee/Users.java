package com.gowthaman.searchmyemployee;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Users extends AppCompatActivity {

    Button btnEmployee;
    Button btnUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);
        btnEmployee = (Button) findViewById(R.id.btnEmp);
        btnEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoLogin = new Intent(Users.this,UserLogin.class);
                startActivity(gotoLogin);
            }
        });
        btnUser = (Button) findViewById(R.id.btnUser);
        btnUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoUsrMap = new Intent(Users.this,UserMap.class);
                startActivity(gotoUsrMap);
            }
        });
    }
}
