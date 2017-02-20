package com.example.sokhon.myapplication.model;

import com.example.sokhon.myapplication.R;

import java.util.ArrayList;

/**
 * Created by Sokhon on 2/19/2017.
 */

public class GroupProduct {
    private String title;
    private String description;
    private int imageId;

    public static int[] getImage(){
        int imageId[]={R.drawable.lobster,R.drawable.crab,R.drawable.shrimp,R.drawable.squid};
        return imageId;
    }
    public static ArrayList<GroupProduct> getData(){
        ArrayList<GroupProduct> dataList=new ArrayList<>();
        int []imageId=getImage();
        for(int i=0;i<imageId.length;i++){

            GroupProduct product=new GroupProduct();
            product.setTitle("Type "+i);
            product.setImageId(imageId[i]);
            dataList.add(product);
        }
        return dataList;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
