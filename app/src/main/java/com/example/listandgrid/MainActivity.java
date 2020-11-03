package com.example.listandgrid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    String ten[] ={
            "Giày Thể Thao XSPORT Ni.ke Air Force 1 Full Trắng SF",
            "Giày Thể Thao XSPORT Con.verse Cổ Cao",
            "Giày Thể Thao XSPORT Adi.das XPLR Rep",
            "Giày Thể Thao XSPORT MLB",
            "Giày Thể Thao XSPORT Ni.ke force 1 shadow",
            "Giày Thể Thao XSPORT Prophere Rep",
            "Giày Thể Thao XSPORT Adi.das Prophere Rep",
            "Giày Thể Thao XSPORT Ni.ke Zoom 879 Xám Trắng",
            "Giày Thể Thao XSPORT Ni.ke Zoom N213",
            "Giày Thể Thao XSPORT Adi.das Yeezy boost sesame REP"
    };
    int hinh[] ={R.drawable.h1,R.drawable.h2,R.drawable.h3,R.drawable.h4,R.drawable.h5,R.drawable.h6,
            R.drawable.h1, R.drawable.h1,R.drawable.h1,R.drawable.h1
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = (GridView)findViewById(R.id.gridView);

        GridviewAdapter gridviewAdapter = new GridviewAdapter(this,ten,hinh);
        gridView.setAdapter(gridviewAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,ten[i],Toast.LENGTH_LONG).show();
            }
        });
    }
}