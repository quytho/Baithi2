package com.example.baithi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import douong.DoUong;
import douong.doUongAdapter;

public class Fragement_douong extends Fragment{
    RecyclerView recyclerView;
    View view;
    public Fragement_douong(){

    }
    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.thucuong_fragment, container, false);
        recyclerView = view.findViewById(R.id.thucuong_recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);

        doUongAdapter doUongAdapter = new doUongAdapter();
        doUongAdapter.setData(getListDoUong());

        recyclerView.setAdapter(doUongAdapter);
        return view;
    }
    private List<DoUong> getListDoUong(){
        List<DoUong> list = new ArrayList<>();
        list.add(new DoUong(R.drawable.thucuong1, "cafe", "32.000VND"));
        list.add(new DoUong(R.drawable.thucuong2, "cafe", "32.000VND"));
        list.add(new DoUong(R.drawable.thucuong1, "cafe", "32.000VND"));
        list.add(new DoUong(R.drawable.thucuong2, "cafe", "32.000VND"));
        list.add(new DoUong(R.drawable.thucuong1, "cafe", "32.000VND"));
        list.add(new DoUong(R.drawable.thucuong2, "cafe", "32.000VND"));
        list.add(new DoUong(R.drawable.thucuong1, "cafe", "32.000VND"));
        list.add(new DoUong(R.drawable.thucuong2, "cafe", "32.000VND"));
        list.add(new DoUong(R.drawable.thucuong1, "cafe", "32.000VND"));
        list.add(new DoUong(R.drawable.thucuong2, "cafe", "32.000VND"));
        return  list;
    }

}
