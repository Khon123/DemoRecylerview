package com.example.sokhon.myapplication.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sokhon.myapplication.R;
import com.example.sokhon.myapplication.model.GroupProduct;

import java.util.List;

/**
 * Created by Sokhon on 2/19/2017.
 */

public class GroupProductAdaper extends RecyclerView.Adapter<GroupProductAdaper.ViewHolder> {

    List<GroupProduct> mData;
    private LayoutInflater inflater;


    public GroupProductAdaper(Context context, List<GroupProduct> data) {
        inflater = LayoutInflater.from(context);
        this.mData = data;
    }



    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        TextView title;
        ImageView imageView;
        int position;
        GroupProduct product;
         public ViewHolder(View viewItem){
             super(viewItem);
             title=(TextView)viewItem.findViewById(R.id.title);
             imageView=(ImageView) viewItem.findViewById(R.id.image_type);
         }

        public void setData(GroupProduct product,int position){
            this.title.setText(product.getTitle());

            this.imageView.setImageResource(product.getImageId());

            this.product=product;
            this.position=position;
        }

    }

    @Override
    public GroupProductAdaper.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.activity_group_produck_list,parent,false);

        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(GroupProductAdaper.ViewHolder holder, int position) {
        GroupProduct product=mData.get(position);
        holder.setData(product,position);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
