package com.example.baithi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import Catergory_douong.Category_douong;
import douong.DoUong;

public class order extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPaperAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.order);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.order:

                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                ,MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.notification:
                        startActivity(new Intent(getApplicationContext()
                                ,notification.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.myaccount:
                        startActivity(new Intent(getApplicationContext()
                                ,myaccount.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        adapter = new ViewPaperAdapter(getSupportFragmentManager());
        //add fragent
        adapter.AddFragment(new Fragement_douong(),"Thức Uống");
        adapter.AddFragment(new Fragment_doan(),"Đồ Ăn ");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
    private List<Category_douong> getListCategory(){
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
}