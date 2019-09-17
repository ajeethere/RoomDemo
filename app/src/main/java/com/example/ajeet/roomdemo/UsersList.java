package com.example.ajeet.roomdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class UsersList extends AppCompatActivity {
TextView userList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_list);
        userList=(TextView)findViewById(R.id.users_list);


        String info="";
        List<dataBase> users=MainActivity.myAppDataBase.MyDao().getUsers();

        for (dataBase use:users){
            int id=use.getId();
            String name=use.getName();
            String email=use.getEmail();

            info=info+"\n\n"+"Id : "+id+"\n"+"Name : "+name+"\n"+"Email : "+email+"\n\n";
        }
        userList.setText(info);

    }
}
