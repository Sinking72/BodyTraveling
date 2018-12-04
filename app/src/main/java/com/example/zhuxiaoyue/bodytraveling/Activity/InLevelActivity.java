package com.example.zhuxiaoyue.bodytraveling.Activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

import com.example.zhuxiaoyue.bodytraveling.R;

public class InLevelActivity extends AppCompatActivity {
    // private Fragment fra_level;
     private ImageButton btn_text;
     private ImageButton btn_video;
     private ImageButton btn_question;
    // private ImageButton btn_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_level);

        btn_text=(ImageButton)findViewById(R.id.btn_text);
        btn_video=(ImageButton)findViewById(R.id.btn_video);
        btn_question=(ImageButton)findViewById(R.id.btn_question);
       // btn_test=(ImageButton)findViewById(R.id.btn_test);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.content,new LevelFragment())   // 此处的R.id.fragment_container是要盛放fragment的父容器
                .commit();



    }
}
