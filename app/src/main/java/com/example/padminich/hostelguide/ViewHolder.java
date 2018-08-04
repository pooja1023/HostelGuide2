package com.example.padminich.hostelguide;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ViewHolder extends RecyclerView.ViewHolder {
    View mview;
    public ViewHolder(View itemView)
    {
        super(itemView);
        mview=itemView;
    }

    public void setDetails(Context ctx, String title, String desc,String image)
    {
        TextView mtitleview=mview.findViewById(R.id.rTitle);
        TextView mdetailview=mview.findViewById(R.id.rdesc);

        ImageView mimageview=mview.findViewById(R.id.rimage);
    mtitleview.setText(title);
    mdetailview.setText(desc);
    Picasso.get().load(image).into(mimageview);

    }
}
