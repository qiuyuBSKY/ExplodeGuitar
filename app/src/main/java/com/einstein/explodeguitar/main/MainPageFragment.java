package com.einstein.explodeguitar.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.einstein.explodeguitar.R;

/**
 * Created by einstein on 2017/7/5.
 */

public class MainPageFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_fragment, null);
        Log.v("qiuyu","111111111111");
        TextView txtView = (TextView) view.findViewById(R.id.FragmentName);
        txtView.setText("This is 主页");
        return view;
    }
}
