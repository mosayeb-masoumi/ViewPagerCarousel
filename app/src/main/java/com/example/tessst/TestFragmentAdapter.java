package com.example.tessst;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class TestFragmentAdapter extends FragmentStatePagerAdapter {

    private Context context;
    List<String> list1 = new ArrayList<>();
    List<String> list2 = new ArrayList<>();
    List<String> list3 = new ArrayList<>();

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        Object obj = super.instantiateItem(container, position);
        return obj;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        if (object != null) {
            return ((Fragment) object).getView() == view;
        } else {
            return false;
        }
    }

    public TestFragmentAdapter(FragmentManager fm, Context context,  List<String> list1, List<String> list2 , List<String> list3) {
        super(fm);
        this.context = context;
        this.list1 = list1;
        this.list2 = list2;
        this.list3 = list3;

    }

    @Override
    public int getItemPosition(Object object) {
        // Causes adapter to reload all Fragments when
        // notifyDataSetChanged is called
        return POSITION_NONE;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return TestFragment.newInstance(list2, context);
        }else if(position == 1){
            return TestFragment.newInstance(list3, context);
        }else if(position == 2){
            return TestFragment.newInstance(list2, context);
        }else{
            return TestFragment.newInstance(list3, context);
        }

    }

    @Override
    public int getCount() {
        return list1 == null ? 0 : list1.size();   // count of slides (fragments)
//        return 3 ;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return String.valueOf(position);
    }

}
