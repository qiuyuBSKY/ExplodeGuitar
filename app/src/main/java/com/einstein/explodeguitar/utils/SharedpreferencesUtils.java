package com.einstein.explodeguitar.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by einstein on 2017/7/5.
 */

public class SharedpreferencesUtils {
    private static final String IS_FIRST = "isFirst";

    public static void setFirstLogin(Context context, boolean isFirst){
        SharedPreferences sp = context.getSharedPreferences(IS_FIRST,0);
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean(IS_FIRST,isFirst);
        editor.commit();
    }

    public static boolean getFirstLogin(Context context){
        SharedPreferences sp = context.getSharedPreferences(IS_FIRST,0);
        return sp.getBoolean(IS_FIRST,true);
    }
}
