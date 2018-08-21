package com.rahmatofolio.sliderlibrary.ui.indicators;

import android.content.Context;
import android.support.v4.content.res.ResourcesCompat;
import android.util.AttributeSet;

import com.rahmatofolio.sliderlibrary.R;

/**
 * Created by haziq on 21,August,2018
 * rahmatofolio@gmail.com
 */
public class CircleIndicator extends IndicatorShape {

    public CircleIndicator(Context context, int indicatorSize, boolean mustAnimateChanges) {
        super(context, indicatorSize, mustAnimateChanges);
        setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.indicator_circle_unselected, null));
    }

    public CircleIndicator(Context context) {
        super(context);
    }

    public CircleIndicator(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CircleIndicator(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void onCheckedChange(boolean isChecked) {
        super.onCheckedChange(isChecked);
        if (isChecked) {
            setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.indicator_circle_selected, null));
        } else {
            setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.indicator_circle_unselected, null));
        }
    }
}
