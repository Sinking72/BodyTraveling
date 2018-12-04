package com.example.zhuxiaoyue.bodytraveling.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.zhuxiaoyue.bodytraveling.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton btn_level=(ImageButton)findViewById(R.id.btn_level);
        ImageButton btn_systems=(ImageButton)findViewById(R.id.btn_systems);
        ImageButton btn_knowledge=(ImageButton)findViewById(R.id.btn_knowledge);
        //加载知识点界面
        btn_knowledge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(HomeActivity.this, KnowledgeActivity.class);
                startActivity(it);
            }
        });
        //加载关卡界面
        btn_level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(HomeActivity.this, LevelActivity.class);
                startActivity(it);
            }
        });
        //加载系统图界面
        btn_systems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(HomeActivity.this, SystemsActivity.class);
                startActivity(it);
            }
        });




    }
}
