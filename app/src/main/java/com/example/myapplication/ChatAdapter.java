package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatViewHolder>{
    private List<Chat> chatList;
    public ChatAdapter(List<Chat> chatList){
        this.chatList = chatList;
    }
    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_item, parent, false);
        return new ChatViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder holder, int position){
        Chat chat = chatList.get(position);
        holder.contactName.setText(chat.getName());
        holder.lastMessage.setText(chat.getMessage());
        holder.messageTime.setText(chat.getTime());
        holder.profileImage.setImageResource(chat.getImage());
    }
    @Override
    public int getItemCount(){
        return chatList.size();
    }
    public static class ChatViewHolder extends RecyclerView.ViewHolder {
        ImageView profileImage;
        TextView contactName;
        TextView lastMessage;
        TextView messageTime;
        public ChatViewHolder (@NonNull View itemView){
            super(itemView);
            profileImage = itemView.findViewById(R.id.profileImage);
            contactName = itemView.findViewById(R.id.contactName);
            lastMessage = itemView.findViewById(R.id.lastMessage);
            messageTime = itemView.findViewById(R.id.messageTime);
        }
    }
}