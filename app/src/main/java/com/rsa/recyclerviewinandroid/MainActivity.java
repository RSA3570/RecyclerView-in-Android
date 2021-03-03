package com.rsa.recyclerviewinandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.rsa.recyclerviewinandroid.adapters.ItemAdapter;
import com.rsa.recyclerviewinandroid.models.Items;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ItemAdapter itemAdapter;
    List<Items> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_main);
        itemList = new ArrayList<>();
        itemList.add(new Items("Engineering Mathematics", "20"));
        itemList.add(new Items("C Programming", "36"));
        itemList.add(new Items("Introduction to Python", "42"));
        itemList.add(new Items("Web Development", "32"));
        itemList.add(new Items("Mobile App Development", "22"));
        itemList.add(new Items("Software Testing", "24"));
        itemList.add(new Items("Operating Systems", "31"));
        itemList.add(new Items("Computer Architecture", "24"));
        itemList.add(new Items("Computer Organizations", "43"));
        itemList.add(new Items("Data Structure", "37"));
        itemList.add(new Items("Introduction to Programming", "26"));
        itemList.add(new Items("Git and Github", "37"));
        itemList.add(new Items("Mysql Database", "22"));
        itemList.add(new Items("Java Programming", "34"));
        itemList.add(new Items("Bootstrap", "23"));
        itemList.add(new Items("HTML and Css", "19"));
        itemList.add(new Items("JavaScript", "18"));


       itemAdapter = new ItemAdapter(itemList, MainActivity.this);
        recyclerView.setAdapter(itemAdapter);
    }
}