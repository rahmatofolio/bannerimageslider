package com.rahmatofolio.sliderlibrary.ui.indicators;

import android.content.Context;
import android.support.v4.content.res.ResourcesCompat;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.rahmatofolio.sliderlibrary.R;

/**
 * Created by haziq on 21,August,2018
 * rahmatofolio@gmail.com
 */
public class DashIndicator extends IndicatorShape {

    @Override
    public void onCheckedChange(boolean isChecked) {
        super.onCheckedChange(isChecked);
        if (isChecked) {
            setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.indicator_dash_selected, null));
        } else {
            setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.indicator_dash_unselected, null));
        }
    }

    public DashIndicator(Context context, int indicatorSize, boolean mustAnimateChanges) {
        super(context, indicatorSize, mustAnimateChanges);
        setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.indicator_dash_unselected, null));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = getResources().getDimensionPixelSize(R.dimen.default_dash_indicator_width);
            setLayoutParams(layoutParams);
        }
    }

    public DashIndicator(Context context) {
        super(context);
    }

    public DashIndicator(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DashIndicator(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
