package com.einstein.explodeguitar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.einstein.explodeguitar.utils.SharedpreferencesUtils;

public class LauncherActivity extends Activity {
    private static final int IMAGE_DURATION = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if(SharedpreferencesUtils.getFirstLogin(this)){
        if(true){
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    SharedpreferencesUtils.setFirstLogin(LauncherActivity.this, false);
                    skipToMainActivity();
                }
            },IMAGE_DURATION);
        }else{
            skipToMainActivity();
        }
        setContentView(R.layout.activity_launcher);
    }

    private void skipToMainActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
