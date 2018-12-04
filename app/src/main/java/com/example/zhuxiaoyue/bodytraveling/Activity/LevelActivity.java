package com.example.zhuxiaoyue.bodytraveling.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import com.example.zhuxiaoyue.bodytraveling.R;



public class LevelActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);


        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);

        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);

    }

   @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_1:
                Intent it1 = new Intent(LevelActivity.this, InLevelActivity.class);
                startActivity(it1);
                Toast.makeText(LevelActivity.this, "这是第一个按钮", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_2:
                Intent it2 = new Intent(LevelActivity.this, InLevelActivity.class);
                startActivity(it2);
                Toast.makeText(LevelActivity.this, "这是第二个按钮", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_3:
                Toast.makeText(LevelActivity.this, "这是第三个按钮", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_4:
                Toast.makeText(LevelActivity.this, "这是第四个按钮", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_5:
                Toast.makeText(LevelActivity.this, "这是第五个按钮", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_6:
                Toast.makeText(LevelActivity.this, "这是第六个按钮", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_7:
                Toast.makeText(LevelActivity.this, "这是第七个按钮", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_8:
                Toast.makeText(LevelActivity.this, "这是第八个按钮", Toast.LENGTH_SHORT).show();
                break;

        }


    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}


