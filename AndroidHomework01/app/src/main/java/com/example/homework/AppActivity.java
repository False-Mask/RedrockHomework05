package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class AppActivity extends AppCompatActivity {
    List<Myin> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);
        Myinint();

        //使用自己定义的RecyclerView
        RecyclerView recyclerView=findViewById(R.id.Rec1);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        MyAdapter myAdapter=new MyAdapter(list);
        recyclerView.setAdapter(myAdapter);




        //监听点击事件
        Button abutton=findViewById(R.id.abutton1);
        abutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

    private void Myinint() {
        list.add(new Myin("我还没睡饱",R.drawable.maomao));
        list.add(new Myin("没想到吧是这个！！？？",R.drawable.uisdc_sticker));
        list.add(new Myin("玩点新花样",R.drawable.wanhuay));
        list.add(new Myin("上号",R.drawable.shanghao1));
        list.add(new Myin("上号",R.drawable.shanghao2));
        list.add(new Myin("上号",R.drawable.shanghao3));
    }
}