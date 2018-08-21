package com.rahmatofolio.sliderlibrary.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestOptions;
import com.rahmatofolio.sliderlibrary.R;
import com.rahmatofolio.sliderlibrary.model.SlideModel;
import com.rahmatofolio.sliderlibrary.ui.Slider;
import com.rahmatofolio.sliderlibrary.ui.customize.RoundedCornersTransformations;

import java.util.List;

/**
 * Created by haziq on 21,August,2018
 * rahmatofolio@gmail.com
 */
public class SliderAdapter extends PagerAdapter {

    private LayoutInflater layoutInflater;
    private AdapterView.OnItemClickListener itemClickListener;
    private List<SlideModel> items;

    public SliderAdapter(@NonNull Context context, List<SlideModel> items, AdapterView.OnItemClickListener itemClickListener) {
        this.items = items;
        this.itemClickListener = itemClickListener;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        // The object returned by instantiateItem() is a key/identifier. This method checks whether
        // the View passed to it (representing the page) is associated with that key or not.
        // It is required by a PagerAdapter to function properly.
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        View view = layoutInflater.inflate(R.layout.row_slider, container, false);
        ImageView sliderImage = view.findViewById(R.id.sliderImage);
        loadImage(sliderImage, items.get(position).getImageUrl(), items.get(position).getImageCorner());
        View parent = view.findViewById(R.id.ripple);
        parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (itemClickListener != null)
                    itemClickListener.onItemClick(null, null, position, 0);
            }
        });
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        // Removes the page from the container for the given position. We simply removed object using removeView()
        // but could’ve also used removeViewAt() by passing it the position.
        try {
            // Remove the view from the container
            container.removeView((View) object);
            // Invalidate the object
        } catch (Exception e) {
            Log.w(Slider.TAG, "destroyItem: failed to destroy item and clear it's used resources", e);
        }
    }

    /**
     * Display the gallery image into the image view provided.
     */
    private void loadImage(ImageView imageView, String url,int corner) {
        if (!TextUtils.isEmpty(url)) {
            Glide.with(imageView.getContext()) // Bind it with the context of the actual view used
                    .load(url) // Load the image
                    .apply(RequestOptions.bitmapTransform(new MultiTransformation<>(new CenterCrop(),
                            new RoundedCornersTransformations(imageView.getContext(),corner,0,
                                    RoundedCornersTransformations.CornerType.ALL))))
                    .transition(DrawableTransitionOptions.withCrossFade())
                    .into(imageView);
        }
    }
}
