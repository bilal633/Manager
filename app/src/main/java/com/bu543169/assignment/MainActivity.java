package com.bu543169.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.GridView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private GridView gridCategories;
    private CategoryAdapter categoryAdapter;
    private List<Category> categoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridCategories = findViewById(R.id.gridCategories);


        toolbar = findViewById(R.id.myToolBar);


        setSupportActionBar(toolbar);
        loadCategories();
    }

    private void loadCategories() {
        categoryList = new ArrayList<>();

        categoryList.add(new Category(R.drawable.ic_files, "Logos", ""));
        categoryList.add(new Category(R.drawable.ic_files, "Project", "Proposal"));
        categoryAdapter = new CategoryAdapter(MainActivity.this, categoryList);
        gridCategories.setAdapter(categoryAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
}



