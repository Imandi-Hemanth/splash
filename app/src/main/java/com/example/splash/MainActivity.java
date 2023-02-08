package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  Button btn;
  First first;
  View fr1,fr2;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        fr1=findViewById(R.id.fr1);
        fr2=findViewById(R.id.fr2);

        btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                first=new First();
                ft.add(R.layout.fragment_first,first);
                fr1.setVisibility(view.VISIBLE);
                fr2.setVisibility(View.GONE);

                ft.commit();

            }
        });

    }
}