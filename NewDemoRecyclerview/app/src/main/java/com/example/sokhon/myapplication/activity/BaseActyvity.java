package com.example.sokhon.myapplication.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.sokhon.myapplication.R;

public abstract class BaseActyvity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);

        TextView icon=(TextView)findViewById(R.id.icon);
        TextView title=(TextView)findViewById(R.id.title);
        title.setText(toolbarTitle());
        icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAction();
            }
        });
    }
    public void setAction(){
        onBackPressed();
    }
    protected abstract String toolbarTitle();
}
