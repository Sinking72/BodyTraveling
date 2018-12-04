package com.example.zhuxiaoyue.bodytraveling.Activity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.zhuxiaoyue.bodytraveling.R;
import com.example.zhuxiaoyue.bodytraveling.Utils.Dao;
import com.example.zhuxiaoyue.bodytraveling.Utils.dbHelper;


public class LevelFragment extends Fragment {

    private View rootView;
    private TextView organ;
    private TextView text1;
    private TextView text2;
    private TextView text3;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (null == rootView) {
            rootView = inflater.inflate(R.layout.fragment_level, container,
                    false);
            initView(rootView);
        }
        return rootView;
    }
    /**
     * 用于初始化，具体操作视自己情况而定
     * @param rootView
     */
    private void initView(View rootView) {
        dbHelper helper= new dbHelper(getActivity());
        SQLiteDatabase db=helper.getWritableDatabase();
        final Dao a=new Dao(this,db);
        organ=rootView.findViewById(R.id.organ);
        text1=rootView.findViewById(R.id.text1);
        text2=rootView.findViewById(R.id.text2);
        text3=rootView.findViewById(R.id.text3);
        String text[]=a.Textquery(db,2);
        organ.setText(text[0]);
        text1.setText(text[1]);
        text2.setText(text[2]);
        text3.setText(text[3]);
    }

}
