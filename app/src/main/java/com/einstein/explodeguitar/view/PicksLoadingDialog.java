package com.einstein.explodeguitar.view;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import com.einstein.explodeguitar.R;

/**
 * Created by einstein on 2017/7/6.
 */

public class PicksLoadingDialog {
    private Context mContext;
    private Dialog  mDialog;

    public PicksLoadingDialog(Context context){
        mContext = context;
    }

    public Dialog loadDialog(){
        mDialog = new Dialog(mContext, R.style.dialog);
        LayoutInflater in = LayoutInflater.from(mContext);
        View viewDialog = in.inflate(R.layout.picks_loading_progress, null);
        // 这里可以设置dialog的大小，当然也可以设置dialog title等
        // LayoutParams layoutParams = new LayoutParams(width * 80 / 100, 50);
        // mDialog.setContentView(viewDialog, layoutParams);
        mDialog.setContentView(viewDialog);
        mDialog.setCanceledOnTouchOutside(true);
        mDialog.show();
        return mDialog;
    }

    public void removeDialog(){
        mDialog.dismiss();
    }
}
