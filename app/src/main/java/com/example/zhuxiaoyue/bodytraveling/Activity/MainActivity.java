package com.example.zhuxiaoyue.bodytraveling.Activity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.zhuxiaoyue.bodytraveling.Utils.Dao;
import com.example.zhuxiaoyue.bodytraveling.R;
import com.example.zhuxiaoyue.bodytraveling.Utils.dbHelper;

public class MainActivity extends AppCompatActivity {
    //登录界面


    private Button login_btn_login;
    private EditText login_edit_account;
    private EditText login_edit_pwd;
    private int myId;
    private String myPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //创建数据库
        dbHelper helper= new dbHelper(this);
        final SQLiteDatabase db=helper.getWritableDatabase();
        final Dao a=new Dao(this,db);
       // Toast.makeText(this, "创建数据库", Toast.LENGTH_SHORT).show();
        login_edit_account=findViewById(R.id.login_edit_account);
        login_edit_pwd=findViewById(R.id.login_edit_pwd);
        login_btn_login = findViewById(R.id.login_btn_login);
        login_btn_login.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                myId=Integer.parseInt(String.valueOf(login_edit_account.getText()));
                myPass=String.valueOf(login_edit_pwd.getText());
               // if(){
                    if(a.Accountquery(db,myId,myPass)){

                    Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                    Intent it = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(it);
                }
                else
                    Toast.makeText(MainActivity.this, "账号或密码错误", Toast.LENGTH_SHORT).show();




            }
        });



     }
    }