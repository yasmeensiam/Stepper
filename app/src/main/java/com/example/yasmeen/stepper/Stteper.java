package com.example.yasmeen.stepper;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import Adapter.PagerAdapter;
import Adapter.TapsAdapter;
import Model.Step;

public class Stteper extends FragmentActivity implements TapsAdapter.AdapterCallback {
    List<Step> steps;
    private TapsAdapter mMyAdapter;
    List<Fragment> fragments;
    PagerAdapter pagerAdapter;
    ViewPager viewPager;
    TapsAdapter tapsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stteper);
        steps = new ArrayList<>();
        steps.add(new Step("1", "step one"));
        steps.add(new Step("2", "step two"));
        steps.add(new Step("3", "step three"));
        steps.add(new Step("4", "step fore"));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        tapsAdapter = new TapsAdapter(this, steps);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(tapsAdapter);
        setPagerAdapter();
        viewPager.setPageTransformer(true, new ZoomOutPageTransform());
        viewPager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });
    }

    public void setPagerAdapter() {
        fragments = new Vector<>();
        fragments.add(new FragmentStep1());
        fragments.add(new FragmentStep2());
        fragments.add(new FragmentStep3());
        fragments.add(new FragmentStep4());
        pagerAdapter = new PagerAdapter(this.getSupportFragmentManager(), fragments);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(pagerAdapter);
    }


    @Override
    public void onMethodCallback(int index) {
        viewPager.setCurrentItem(index);
    }
}
