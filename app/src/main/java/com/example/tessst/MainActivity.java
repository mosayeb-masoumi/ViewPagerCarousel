package com.example.tessst;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private KKViewPager mPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initKKViewPager();
    }


    private void initKKViewPager() {

        List<String> list1 = new ArrayList<>();
        list1.add("hassan");
        list1.add("reza");
        list1.add("ali");

        List<String> list2 = new ArrayList<>();
        list2.add("hassan");
        list2.add("reza");
        list2.add("ali");
        list2.add("nabi");
        list2.add("saaid");

        List<String> list3 = new ArrayList<>();
        list3.add("ali");
        list3.add("nabi");
        list3.add("saaid");
        list3.add("hassan");
        list3.add("reza");


        mPager = findViewById(R.id.kk_pager);
        mPager.setAdapter(new TestFragmentAdapter(getSupportFragmentManager(), MainActivity.this, list1 , list2 ,list3));
        mPager.setAnimationEnabled(false);
        mPager.setFadeEnabled(true);
        mPager.setFadeFactor(0.6f);

        mPager.setPadding(100, 0, 0, 0);
        mPager.setCurrentItem(list1.size());

    }

}