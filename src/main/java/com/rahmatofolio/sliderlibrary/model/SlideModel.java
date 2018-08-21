package com.rahmatofolio.sliderlibrary.model;

import java.io.Serializable;

/**
 * Created by haziq on 21,August,2018
 * rahmatofolio@gmail.com
 * rahmatofolio.com
 */
public class SlideModel implements Serializable {
    private int id;
    private String imageUrl;
    private int imageCorner;

    public SlideModel(int id, String imageUrl, int imageCorner) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.imageCorner = imageCorner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getImageCorner() {
        return imageCorner;
    }

    public void setImageCorner(int imageCorner) {
        this.imageCorner = imageCorner;
    }
}
