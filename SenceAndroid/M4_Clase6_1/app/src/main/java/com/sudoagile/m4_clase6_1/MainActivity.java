package com.sudoagile.m4_clase6_1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init() {
        element = new ArrayList<>();
        element.add(new ListElement(
                color: "#06141B",
                name: "Clase 5",
                subtitle: "RecyclerView",
                status: "Activo")
        );

        ListAdapter listAdapter = new ListAdapter(element, this);
        RecyclerView recyclerView = findViewById(R.id.rvList);
    }
}
