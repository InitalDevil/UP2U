package com.surya.david.up2you;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class CommentViewHolder extends RecyclerView.ViewHolder {
    TextView name, isi;
    CircleImageView profileimg;
    public CommentViewHolder(View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.nm_user);
        isi = itemView.findViewById(R.id.isikomen);
        profileimg = itemView.findViewById(R.id.img_profile);
    }
}
