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

public class Fragement_douong extends Fragment{
    RecyclerView recyclerView;
    View view;
    private List<DoUong> lstDoUong;
    public Fragement_douong(){

    }
    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.thucuong_fragment, container, false);
        recyclerView = view.findViewById(R.id.thucuong_recyclerView);
        RecycleViewAdapter recycleViewAdapter = new RecycleViewAdapter(getContext(),lstDoUong);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recycleViewAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
//        recyclerView.setLayoutManager(linearLayoutManager);
//
//        doUongAdapter doUongAdapter = new doUongAdapter();
//        doUongAdapter.setData(getListDoUong());
//
//        recyclerView.setAdapter(doUongAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstDoUong = new ArrayList<>();
        lstDoUong.add(new DoUong(R.drawable.thucuong1, "cafe", "32.000VND"));
        lstDoUong.add(new DoUong(R.drawable.thucuong2, "cafe", "32.000VND"));
        lstDoUong.add(new DoUong(R.drawable.thucuong1, "cafe", "32.000VND"));
        lstDoUong.add(new DoUong(R.drawable.thucuong2, "cafe", "32.000VND"));
        lstDoUong.add(new DoUong(R.drawable.thucuong1, "cafe", "32.000VND"));
        lstDoUong.add(new DoUong(R.drawable.thucuong2, "cafe", "32.000VND"));


    }



}
