package com.example.ajeet.roomdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddUser extends AppCompatActivity {
EditText userId,userName,userEmail;
Button saveBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
        userName=(EditText)findViewById(R.id.user_name);
        userEmail=(EditText)findViewById(R.id.user_email);
        userId=(EditText)findViewById(R.id.user_id);
        saveBtn=(Button)findViewById(R.id.save_btn);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int user_Id=Integer.parseInt(userId.getText().toString());
                String user_Name=userName.getText().toString();
                String user_Email=userEmail.getText().toString();

                dataBase mdatabase=new dataBase();
                mdatabase.setId(user_Id);
                mdatabase.setName(user_Name);
                mdatabase.setEmail(user_Email);

                MainActivity.myAppDataBase.MyDao().addData(mdatabase);
                Toast.makeText(getApplicationContext(),"user added successfully",Toast.LENGTH_LONG).show();

                userId.setText("");
                userName.setText("");
                userEmail.setText("");

            }
        });
    }
}
