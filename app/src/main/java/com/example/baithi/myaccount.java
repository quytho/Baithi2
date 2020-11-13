package com.example.baithi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Login.LoginActivity;
import Login.RegisterActivity;

public class myaccount extends AppCompatActivity {
    private ListView lvContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myaccount);
        Button btn = (Button) findViewById(R.id.btn_logout);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(myaccount.this,LoginActivity.class);
                startActivity(intent);
            }
        });
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.myaccount);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.order:
                        startActivity(new Intent(getApplicationContext()
                                , order.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                , MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.notification:
                        startActivity(new Intent(getApplicationContext()
                                , notification.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.myaccount:

                        return true;
                }
                return false;
            }
        });
        lvContact = (ListView) findViewById(R.id.lv_profile);
        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(myaccount.this, "" + position, Toast.LENGTH_SHORT).show();
            }
        });
        ArrayList<Contact> arrayList = new ArrayList<Contact>();

        Contact contact1 = new Contact(R.drawable.ic_room, "Ví Voucher", R.drawable.ic_next);
        Contact contact2 = new Contact(R.drawable.ic_local_atm, "Payment", R.drawable.ic_next);
        Contact contact3 = new Contact(R.drawable.ic_room, "Lịch sự đơn hàng", R.drawable.ic_next);
        Contact contact4 = new Contact(R.drawable.ic_room, "Hóa Đơn", R.drawable.ic_next);
        Contact contact5 = new Contact(R.drawable.ic_room, "Reward Credits", R.drawable.ic_next);
        Contact contact6 = new Contact(R.drawable.ic_room, "Ứng dụng cho chủ quán", R.drawable.ic_next);
        Contact contact7 = new Contact(R.drawable.ic_person_add, "Mời bạn bè", R.drawable.ic_next);
        Contact contact8 = new Contact(R.drawable.ic_email, "Góp ý", R.drawable.ic_next);
        Contact contact9 = new Contact(R.drawable.ic_support, "Chính sách quy định", R.drawable.ic_next);
        Contact contact10 = new Contact(R.drawable.ic_settings, "Cài đặt", R.drawable.ic_next);


        arrayList.add(contact1);
        arrayList.add(contact2);
        arrayList.add(contact3);
        arrayList.add(contact4);
        arrayList.add(contact5);
        arrayList.add(contact6);
        arrayList.add(contact7);
        arrayList.add(contact8);
        arrayList.add(contact9);
        arrayList.add(contact10);
        Adapter customAdapter = new Adapter(this, R.layout.row_item, arrayList);
        lvContact.setAdapter(customAdapter);
    }


}




