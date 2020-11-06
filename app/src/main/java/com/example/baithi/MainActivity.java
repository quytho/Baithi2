package com.example.baithi;

        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.MenuItem;

        import com.google.android.material.bottomnavigation.BottomNavigationView;

        import java.util.ArrayList;
        import java.util.List;

        import Category.Category;
        import Category.CategoryAdapter;
        import uudai.uudai;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvCategory;
    private CategoryAdapter categoryAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.order:
                    startActivity(new Intent(getApplicationContext()
                            ,order.class));
                    overridePendingTransition(0,0);
                    return true;
                    case R.id.home:

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
        rcvCategory = findViewById(R.id.rcv_category);
        categoryAdapter = new CategoryAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvCategory.setLayoutManager(linearLayoutManager);
        categoryAdapter.setData(getListCategory());
        rcvCategory.setAdapter(categoryAdapter);
    }
    private List<Category> getListCategory(){
        List<Category> listCategory = new ArrayList<>();
        List<uudai> listUuDai = new ArrayList<>();
        listUuDai.add(new uudai(R.drawable.ic_baseline_motorcycle, "Lương về rồi mình làm gì"));
        listUuDai.add(new uudai(R.drawable.ic_baseline_motorcycle, "Lương về rồi mình làm gì"));
        listUuDai.add(new uudai(R.drawable.ic_baseline_motorcycle, "Lương về rồi mình làm gì"));
        listUuDai.add(new uudai(R.drawable.ic_baseline_motorcycle, "Lương về rồi mình làm gì"));
        listCategory.add(new Category("Ưu đãi đặc biệt", listUuDai));
        listCategory.add(new Category("Ưu đãi đặc biệt", listUuDai));
        return listCategory;
    }
}