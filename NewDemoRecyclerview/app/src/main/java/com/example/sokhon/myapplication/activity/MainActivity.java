package com.example.sokhon.myapplication.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.sokhon.myapplication.R;
import com.example.sokhon.myapplication.activity.BaseActyvity;
import com.example.sokhon.myapplication.adapter.GroupProductAdaper;
import com.example.sokhon.myapplication.model.GroupProduct;


public class MainActivity extends BaseActyvity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        setUpRecyclerview();
    }
    private void setUpRecyclerview(){
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recyclerview);

        GroupProductAdaper groupProductAdaper=new GroupProductAdaper(this, GroupProduct.getData());

        recyclerView.setAdapter(groupProductAdaper);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);

        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    @Override
    protected String toolbarTitle() {
        return "Home";
    }
}
