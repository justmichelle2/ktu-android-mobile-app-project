package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StatusAdapter extends RecyclerView.Adapter<StatusAdapter.StatusViewHolder> {

    ArrayList<Status> statusList;

    public StatusAdapter(ArrayList<Status> statusList) {
        this.statusList = statusList;
    }

    @NonNull
    @Override
    public StatusViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.status_item, parent, false);
        return new StatusViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StatusViewHolder holder, int position) {

        Status status = statusList.get(position);

        holder.statusImage.setImageResource(status.getImage());
        holder.statusName.setText(status.getName());
    }

    @Override
    public int getItemCount() {
        return statusList.size();
    }

    // ViewHolder
    public static class StatusViewHolder extends RecyclerView.ViewHolder {

        ImageView statusImage;
        TextView statusName;

        public StatusViewHolder(@NonNull View itemView) {
            super(itemView);

            statusImage = itemView.findViewById(R.id.statusImage);
            statusName = itemView.findViewById(R.id.statusName);
        }
    }
}