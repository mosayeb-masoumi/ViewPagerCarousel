package com.example.tessst;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class TestFragment extends Fragment {

    private TextView txt1,txt2,txt3,txt4,txt5;
    private LinearLayout card;

    private List<String> list = new ArrayList<>();

    int col[] = {Color.BLUE, Color.GREEN, Color.RED, Color.YELLOW, Color.CYAN};

    public static TestFragment newInstance(List<String> list, Context c) {

        TestFragment fragment = new TestFragment();
        fragment.list = list;
        return fragment;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_test, container, false);
        int bg = Color.rgb((int) Math.floor(Math.random() * 128) + 64,
                (int) Math.floor(Math.random() * 128) + 64,
                (int) Math.floor(Math.random() * 128) + 64);


        card = view.findViewById(R.id.card);
        card.setBackgroundColor(bg);

        txt1 = view.findViewById(R.id.txt1);
        txt2 = view.findViewById(R.id.txt2);
        txt3 = view.findViewById(R.id.txt3);
        txt4 = view.findViewById(R.id.txt4);
        txt5 = view.findViewById(R.id.txt5);


        txt1.setText(list.get(0));
        txt2.setText(list.get(1));
        txt3.setText(list.get(2));
        txt4.setText(list.get(3));
        txt5.setText(list.get(4));



        return view;
    }
}