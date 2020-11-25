package com.example.homework;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    List<Myin> list;

    //内部类
    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.a1);
            textView=itemView.findViewById(R.id.at1);
        }
    }

    //类本身的构造方法
    public MyAdapter(List<Myin> myins){
        list=myins;
    }



    //重写父类方法
    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.in,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        Myin myin=list.get(position);
        holder.textView.setText(myin.getTxt());
        holder.imageView.setImageResource(myin.getImagid());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
