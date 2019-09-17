package com.example.ajeet.roomdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DeleteUser extends AppCompatActivity {
EditText editText;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_user);
        editText=(EditText)findViewById(R.id.delete_id_user);
        button=(Button)findViewById(R.id.delete_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=Integer.parseInt(editText.getText().toString());
                dataBase database=new dataBase();
                database.setId(id);
                MainActivity.myAppDataBase.MyDao().deleteUser(database);

                Toast.makeText(getApplicationContext(),"User deleted",Toast.LENGTH_LONG).show();

                finish();
            }
        });
    }
}
