package com.example.ets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionButton fab = findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mahasiswaArrayList.add(new Mahasiswa("kahfi maulana", "1414370309", "123456789"));
                recyclerView.getAdapter().notifyItemInserted(mahasiswaArrayList.size());
                recyclerView.smoothScrollToPosition(mahasiswaArrayList.size());
            }
        });

        addData();

        recyclerView = findViewById(R.id.recycler_view);
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Dimas Maulana", "1414370309", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Fadly Yonk", "1214234560", "987654321"));
        mahasiswaArrayList.add(new Mahasiswa("Ariyandi Nugraha", "1214230345", "987648765"));
        mahasiswaArrayList.add(new Mahasiswa("Aham Siswana", "1214378098", "098758124"));
        mahasiswaArrayList.add(new Mahasiswa("Aham Siswana", "1214378098", "098758124"));
        mahasiswaArrayList.add(new Mahasiswa("Aham Siswana", "1214378098", "098758124"));
        mahasiswaArrayList.add(new Mahasiswa("Aham Siswana", "1214378098", "098758124"));
        mahasiswaArrayList.add(new Mahasiswa("Aham Siswana", "1214378098", "098758124"));
        mahasiswaArrayList.add(new Mahasiswa("Aham Siswana", "1214378098", "098758124"));
    }
}