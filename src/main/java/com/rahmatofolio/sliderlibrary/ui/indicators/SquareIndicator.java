package com.rahmatofolio.sliderlibrary.ui.indicators;

import android.content.Context;
import android.support.v4.content.res.ResourcesCompat;
import android.util.AttributeSet;

import com.rahmatofolio.sliderlibrary.R;

/**
 * Created by haziq on 21,August,2018
 * rahmatofolio@gmail.com
 */
public class SquareIndicator extends IndicatorShape {

    public SquareIndicator(Context context, int indicatorSize, boolean mustAnimateChanges) {
        super(context, indicatorSize, mustAnimateChanges);
        setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.indicator_square_unselected, null));
    }

    public SquareIndicator(Context context) {
        super(context);
    }

    public SquareIndicator(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareIndicator(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void onCheckedChange(boolean isChecked) {
        super.onCheckedChange(isChecked);
        if (isChecked) {
            setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.indicator_square_selected, null));
        } else {
            setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.indicator_square_unselected, null));
        }
    }
}
