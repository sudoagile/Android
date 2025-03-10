package com.sudoagile.m4_clase6_1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private List<ListElement> mData;
    private LayoutInflater mInflater;
    private Context context;

    public ListAdapter(List<ListElement> itemList, Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemList;
    }

    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        @SuppressLint("InflateParams")
        View view = mInflater.inflate(R.layout.list_element, null);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        holder.binData(mData.get(position));


    }

    @Override
    public int getItemCount() { return mData.size(); }

    public void setItems(List<ListElement> items) { mData = items; }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iconImage;
        TextView name, subtitle, status;

        ViewHolder(View itemView) {
            super(itemView);
            iconImage = itemView.findViewById(R.id.ivCard);
            name = itemView.findViewById(R.id.tvNameCard);
            subtitle = itemView.findViewById(R.id.tvSubtitleCard);
            status = itemView.findViewById(R.id.tvStatus);
        }
        void bindData(final ListElement item) {
            iconImage.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            name.setText(item.getName());
            subtitle.setText(item.getSubtitle());
            status.setText(item.getStatus());
        }


    }}
