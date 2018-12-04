package com.example.zhuxiaoyue.bodytraveling.Utils;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.View;

import com.example.zhuxiaoyue.bodytraveling.Activity.LevelFragment;
import com.example.zhuxiaoyue.bodytraveling.Activity.MainActivity;

/**
 * Created by Zhu Xiaoyue on 2018/11/22.
 *
 * @描述：用于增删查改
 */

public class Dao {
    private SQLiteDatabase helper = null;

    public Dao(MainActivity context, SQLiteDatabase helper) {
        this.helper = helper;
    }

    public Dao(LevelFragment levelFragment, SQLiteDatabase db) {
        this.helper = helper;
    }

    public boolean insert() {



        return true;
    }

    public void delete() {

    }

    public void select() {

    }
    //  登录
    public boolean Accountquery(SQLiteDatabase db, int myId, String myPass) {

        if (db != null) {
            Log.d("提示************", "找到数据库la");
        }

        Cursor cursor = db.rawQuery("select * from user", null);
        cursor.moveToFirst();
        while (cursor.moveToNext()) {

            int id = cursor.getInt(cursor.getColumnIndex("id"));
            String pass = cursor.getString(cursor.getColumnIndex("pass"));
            Log.d("id************", String.valueOf(id) + String.valueOf(pass));

            if (myId == id && myPass.equals(pass)) {
                //cursor.close();
                //db.close();
                return true;
            } else return false;
        }
        return false;
    }

    //  查找题目
    public String[] Textquery(SQLiteDatabase db, int myId) {
        String text[] =new String[3];
        if (db != null) {
            Log.d("提示************", "找到数据库la");
        }

        Cursor cursor = db.rawQuery("select * from organ where id_organ=" + myId, null);
        cursor.moveToFirst();
        while (cursor.moveToNext()) {
            int id = cursor.getInt(cursor.getColumnIndex("organ_id"));
            text[0] = cursor.getString(cursor.getColumnIndex("name"));
            text[1] = cursor.getString(cursor.getColumnIndex("text1"));
            text[2] = cursor.getString(cursor.getColumnIndex("text2"));
            text[3] = cursor.getString(cursor.getColumnIndex("text3"));
            //Log.d("id************", String.valueOf(id)+text1+text2+text3);
        }
        return text;
    }
}
