package com.einstein.explodeguitar.main;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.einstein.explodeguitar.R;
import com.einstein.explodeguitar.view.PicksLoadingDialog;

/**
 * Created by einstein on 2017/7/5.
 */

public class MainPageFragment extends Fragment{
    private PicksLoadingDialog mDialog;
    private Handler mHandler = new Handler();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_fragment, null);
        TextView txtView = view.findViewById(R.id.FragmentName);
        txtView.setText("This is 主页");
        mDialog = new PicksLoadingDialog(getActivity());
        txtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDialog.loadDialog();
                mHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mDialog.removeDialog();
                    }
                },3000);
            }
        });
        return view;
    }
}
