package com.example.ajeet.roomdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateUser extends AppCompatActivity {
    EditText userId,userName,userEmail;
    Button saveBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_user);

        userName=(EditText)findViewById(R.id.user_name_update);
        userEmail=(EditText)findViewById(R.id.user_email_update);
        userId=(EditText)findViewById(R.id.user_id_update);
        saveBtn=(Button)findViewById(R.id.save_btn_update);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=Integer.parseInt(userId.getText().toString());
                String name=userName.getText().toString();
                String email=userEmail.getText().toString();

                dataBase database=new dataBase();
                database.setId(id);
                database.setEmail(email);
                database.setName(name);

                MainActivity.myAppDataBase.MyDao().updateUser(database);
                Toast.makeText(getApplicationContext(),"user updated",Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}
