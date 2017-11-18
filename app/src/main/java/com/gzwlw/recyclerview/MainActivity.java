package com.gzwlw.recyclerview;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    private ArrayList<Drawable> imageList;

    private RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
        initEvent();
    }

    private void initView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
    }

    private void initData() {
        imageList = new ArrayList<>();
        imageList.add(getResources().getDrawable(R.drawable.a_1));
        imageList.add(getResources().getDrawable(R.drawable.a_2));
        imageList.add(getResources().getDrawable(R.drawable.a_3));
        imageList.add(getResources().getDrawable(R.drawable.a_4));
        imageList.add(getResources().getDrawable(R.drawable.a_5));
        imageList.add(getResources().getDrawable(R.drawable.a_6));
        imageList.add(getResources().getDrawable(R.drawable.a_7));
        imageList.add(getResources().getDrawable(R.drawable.a_8));
        imageList.add(getResources().getDrawable(R.drawable.a_9));
        imageList.add(getResources().getDrawable(R.drawable.a_10));
        imageList.add(getResources().getDrawable(R.drawable.a_11));
    }

    private void initEvent() {
        LinearLayoutManager ms = new LinearLayoutManager(this);

        // 设置 RecyclerView 布局方式为横向布局
        ms.setOrientation(LinearLayoutManager.HORIZONTAL);

        // 给RecyclerView设置布局管理器（必须设置）
        mRecyclerView.setLayoutManager(ms);

        // 初始化Adapter
        adapter = new RecyclerViewAdapter(this, imageList);

        // 设置RecyclerView的Adapter
        mRecyclerView.setAdapter(adapter);
    }
}
