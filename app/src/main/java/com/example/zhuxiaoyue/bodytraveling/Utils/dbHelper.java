package com.example.zhuxiaoyue.bodytraveling.Utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import static android.content.ContentValues.TAG;

/**
 * Created by Zhu Xiaoyue on 2018/11/21.
 * 第一次创建数据库的时候调用
 */

public class dbHelper extends SQLiteOpenHelper{


    /**
     * @param context 上下文
     *
     */
    public dbHelper(Context context) {

        super(context, Constants.DATABASE_NAME, null, Constants.VERSION_CODE);
        Log.d("************","************************************创建数据库**********************************");
    }

  //  public dbHelper(LevelFragment levelFragment) {

     //   super(levelFragment,Constants.DATABASE_NAME, null, Constants.VERSION_CODE);
  //  }



    @Override
    public void onCreate(SQLiteDatabase db) {
        //  创建时的回调
        Log.d("************","************************************创建表**********************************");
        //create table table_name(_id integer,name varchar,age integer)
        String sql1="CREATE TABLE user ( \n" +
                "    id   INT     PRIMARY KEY\n" +
                "                 NOT NULL\n" +
                "                 UNIQUE,\n" +
                "    pass VARCHAR \n" +
                ")\n";
        String sql2="CREATE TABLE organ ( \n" +
                "    organId INT     PRIMARY KEY\n" +
                "                    NOT NULL\n" +
                "                    UNIQUE,\n" +
                "    name    VARCHAR,\n" +
                "    text1   VARCHAR,\n" +
                "    text2   VARCHAR,\n" +
                "    text3   VARCHAR \n" +
                ")";
//        String sql3="insert into user values(2,"22")";
    //    String sql4="insert into user values(3,"32")";
        //执行语句
        db.execSQL(sql1);
        db.execSQL(sql2);
       // db.execSQL(sql3);
      //  db.execSQL(sql4);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        //  升级数据库时的回调
        Log.d(TAG,"升级数据库");
    }
}
