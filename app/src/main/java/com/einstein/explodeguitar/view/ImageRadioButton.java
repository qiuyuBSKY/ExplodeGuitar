package com.einstein.explodeguitar.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;

import com.einstein.explodeguitar.R;


/**
 * Created by einstein on 2017/7/5.
 */

public class ImageRadioButton extends RadioButton {
    public ImageRadioButton(Context context) {
        super(context);
        setImageSize();
    }

    public ImageRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setImageSize();
    }

    public ImageRadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setImageSize();
    }

    private void setImageSize(){
        Drawable[] drawables = getCompoundDrawables();
        int size = getResources().getDimensionPixelSize(R.dimen.button_image_size);
        drawables[1].setBounds(0,0,size,size);
        setCompoundDrawables(drawables[0],drawables[1],drawables[2],drawables[3]);
    }

}
