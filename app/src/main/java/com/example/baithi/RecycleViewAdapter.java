package com.example.baithi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import douong.DoUong;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {
    Context mContext;
    List<DoUong> mData;

    public RecycleViewAdapter(Context mContext, List<DoUong>mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_thucuong, parent, false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textViewName.setText(mData.get(position).getName());
        holder.textViewGia.setText(mData.get(position).getGia());
        holder.imageViewDoUong.setImageResource(mData.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView textViewName;
        private TextView textViewGia;
        private ImageView imageViewDoUong;

        public MyViewHolder(View itemView){
            super(itemView);
            textViewName = (TextView) itemView.findViewById(R.id.tv_ten);
            textViewGia = (TextView) itemView.findViewById(R.id.tv_tien);
            imageViewDoUong = (ImageView) itemView.findViewById(R.id.img_thucuong);

        }
    }

}
