package com.example.baithi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

import Catergory_douong.CategoryDoUong_Adapter;
import Catergory_douong.Category_douong;
import douong.DoUong;

public class Fragement_douong extends Fragment {
    View v;
    private Category_douong category_douong;
    private RecyclerView myRecyclerView;
    private List<DoUong> lstDoUong;
    private ViewPager viewPager;
    private RecyclerView rcvCategory_douong;
    private CategoryDoUong_Adapter categoryAdapterDU;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rcvCategory_douong = rcvCategory_douong.findViewById(R.id.thucuong_recyclerView);
        categoryAdapterDU = new CategoryDoUong_Adapter(this, lstDoUong);
       // LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
      //  rcvCategory_douong.setLayoutManager(linearLayoutManager);

        rcvCategory_douong.setAdapter(categoryAdapterDU);
    }

    private List<Category_douong> getListCategoryDoUong(){
        List<Category_douong> listCategory_douong = new ArrayList<>();
        List<DoUong> listDoUong1 = new ArrayList<>();
        List<DoUong> listDoUong2 = new ArrayList<>();
        listDoUong1.add(new DoUong("Cà Phê Sữa Đá","32.000 đ",R.drawable.thucan1));
        listDoUong1.add(new DoUong("Bạc Xỉu","42.000 đ",R.drawable.thucan2));
        listDoUong1.add(new DoUong("Cà Phê Đá Xay Lạnh","22.000 đ",R.drawable.thucan3));
        listDoUong1.add(new DoUong("Lattle Đá","40.000 đ",R.drawable.thucan4));
        listDoUong1.add(new DoUong("Americano Đá","32.000 đ",R.drawable.thucan5));
        listCategory_douong.add(new Category_douong("Cà Phê", listDoUong1));

        return listCategory_douong;
    }

    public Fragement_douong() {
    }

    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.thucuong_fragment, container, false);
        myRecyclerView = (RecyclerView) v.findViewById(R.id.thucuong_recyclerView);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return v;
    }
}
