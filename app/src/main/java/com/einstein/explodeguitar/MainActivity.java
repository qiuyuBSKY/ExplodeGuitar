package com.einstein.explodeguitar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.einstein.explodeguitar.main.MainPageFragment;
import com.einstein.explodeguitar.me.MePageFragment;
import com.einstein.explodeguitar.study.StudyPageFragment;
import com.einstein.explodeguitar.update.UpdatePageFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by einstein on 2017/7/5.
 */

public class MainActivity extends FragmentActivity{
    private ViewPager mViewPager;
    private List<RadioButton> buttonList;
    private List<Fragment> data;
    private MainPageFragmentAdapter adapter;
    private RadioGroup buttonGroup;
    private MainPageFragment mainFragment;
    private StudyPageFragment studyFragment;
    private UpdatePageFragment updateFragment;
    private MePageFragment meFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView(){
        mViewPager = findViewById(R.id.fragmentPager);
        buttonList = new ArrayList<>();
        RadioButton mainPageBtn = findViewById(R.id.button_main);
        RadioButton studyPageBtn = findViewById(R.id.button_study);
        RadioButton updatePageBtn = findViewById(R.id.button_update);
        RadioButton mePageBtn = findViewById(R.id.button_me);
        buttonList.add(mainPageBtn);
        buttonList.add(studyPageBtn);
        buttonList.add(updatePageBtn);
        buttonList.add(mePageBtn);
        buttonGroup = findViewById(R.id.BottomGroup);
    }

    private void initData(){
        data = new ArrayList<>();
        mainFragment = new MainPageFragment();
        studyFragment = new StudyPageFragment();
        updateFragment = new UpdatePageFragment();
        meFragment = new MePageFragment();
        data.add(mainFragment);
        data.add(studyFragment);
        data.add(updateFragment);
        data.add(meFragment);
        adapter = new MainPageFragmentAdapter(getSupportFragmentManager(), data);
        mViewPager.setAdapter(adapter);
        setListener();
        buttonList.get(0).setChecked(true);
    }

    private void setListener(){
        buttonGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup arg0, int arg1) {
                switch (arg1) {
                    case R.id.button_main:
                        mViewPager.setCurrentItem(0);
                        break;
                    case R.id.button_study:
                        mViewPager.setCurrentItem(1);
                        break;
                    case R.id.button_update:
                        mViewPager.setCurrentItem(2);
                        break;
                    case R.id.button_me:
                        mViewPager.setCurrentItem(3);
                        break;

                    default:
                        break;
                }
            }
        });
        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageSelected(int arg0) {
                buttonList.get(arg0).setChecked(true);
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int arg0) {

            }
        });
    }
}
