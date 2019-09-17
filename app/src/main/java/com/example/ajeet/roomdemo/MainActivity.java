package com.example.ajeet.roomdemo;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button addUserBtn,viewUsersBtn,deleteBtn,updateBtn;
public static MyAppDataBase myAppDataBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addUserBtn=(Button)findViewById(R.id.adduser_btn);

        updateBtn=(Button)findViewById(R.id.updateuser_btn);
        updateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,UpdateUser.class);
                startActivity(i);
            }
        });
        deleteBtn=(Button)findViewById(R.id.deleteuser_btn);
        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,DeleteUser.class);
                startActivity(i);
            }
        });
        viewUsersBtn=(Button)findViewById(R.id.viewuser_btn);
        viewUsersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,UsersList.class);
                startActivity(i);
            }
        });

        myAppDataBase=Room.databaseBuilder(getApplicationContext(),MyAppDataBase.class,"user").allowMainThreadQueries().build();

        addUserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,AddUser.class);
                startActivity(i);
            }
        });
    }
}
