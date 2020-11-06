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
        categoryAdapter = new CategoryAdapter(this );
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvCategory.setLayoutManager(linearLayoutManager);
        categoryAdapter.setData(getListCategory());
        rcvCategory.setAdapter(categoryAdapter);
    }
    private List<Category> getListCategory(){
        List<Category> listCategory = new ArrayList<>();
        List<uudai> listUuDai = new ArrayList<>();
        List<uudai> listUuDai1 = new ArrayList<>();
        listUuDai.add(new uudai(R.drawable.anh3, "Ghé Nhà Càng Nhiều, Hoàn Tiền Càng Cao\n" +
                "    Giờ đây mỗi lần trải nghiệm tại Nhà của bạn đều có cơ hội được hoàn tiền ngay, lên đến..."));
        listUuDai.add(new uudai(R.drawable.anh5, "Lương về rồi mìLương về rồi,mình làm gì ta?Tay phải chiếc bánh, tay trái ly nước yêu thích."));
        listUuDai.add(new uudai(R.drawable.anh6, "Loạt Deal Xịn Sò Cập Bến Nhà, Đổi Ngay Thôi." +
                "Ngày Hội Đổi BEAN lớn nhất năm" +
                "Deal siêu xịn xò vẫy gọi, đổi..... "));
        listUuDai.add(new uudai(R.drawable.anh7, "Mua 3 Tặng 1 - Mời Nhóm Mình Chung Vui" +
                "Chỉ cần nhập mã CunguVui qua app, Nhà mời ngay ưu đãi mua 3 tặng 1....."));
        listUuDai1.add(new uudai(R.drawable.anh8, "Ghé Nhà Càng Nhiều, Hoàn Tiền Càng Cao\n" +
                "    Giờ đây mỗi lần trải nghiệm tại Nhà của bạn đều có cơ hội được hoàn tiền ngay, lên đến..."));
        listUuDai1.add(new uudai(R.drawable.anh9, "Lương về rồi mìLương về rồi,mình làm gì ta?Tay phải chiếc bánh, tay trái ly nước yêu thích."));
        listUuDai1.add(new uudai(R.drawable.anh10, "Loạt Deal Xịn Sò Cập Bến Nhà, Đổi Ngay Thôi." +
                "Ngày Hội Đổi BEAN lớn nhất năm" +
                "Deal siêu xịn xò vẫy gọi, đổi..... "));
        listUuDai1.add(new uudai(R.drawable.anh11, "Mua 3 Tặng 1 - Mời Nhóm Mình Chung Vui" +
                "Chỉ cần nhập mã CunguVui qua app, Nhà mời ngay ưu đãi mua 3 tặng 1....."));
        listCategory.add(new Category("Ưu Đãi Đặc Biệt", listUuDai));
        listCategory.add(new Category("Cập Nhập Từ Nhà", listUuDai1));
        listCategory.add(new Category("Ưu đãi đặc biệt", listUuDai));
        return listCategory;
    }
}