package com.it.xzr.mothersonhealth.entity;

/**
 * Created by Administrator on 2017/6/27.
 */

public class GongNengMoKuaiItem {
    private String imgUrl;
    private String name;

    public GongNengMoKuaiItem(String imgUrl, String name) {
        this.imgUrl = imgUrl;
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GongNengMoKuaiItem{" +
                "imgUrl='" + imgUrl + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
