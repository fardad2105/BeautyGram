package com.example.beautygram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.beautygram.adapters.CommentsAdapter;
import com.example.beautygram.common.RecyclerMain2Generator;
import com.example.beautygram.views.UI;

import io.github.inflationx.viewpump.ViewPumpContextWrapper;

public class Main2Activity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        new UI(getWindow()).setStatusBarColor(R.color.colorBlueDarkest);

        initViews();
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
    }

    private void initViews() {
        recyclerView = findViewById(R.id.main2_recycler);

        CommentsAdapter adapter = new CommentsAdapter(this, new RecyclerMain2Generator().getSample(6));
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(adapter);
    }
}
