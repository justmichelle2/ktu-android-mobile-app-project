package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ChatFragment extends Fragment {

    RecyclerView chatRecycler;
    RecyclerView statusRecycler;

    ChatAdapter chatAdapter;
    StatusAdapter statusAdapter;

    ArrayList<Chat> chatList;
    ArrayList<Status> statusList;

    public ChatFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View view =
                inflater.inflate(
                        R.layout.fragment_chat,
                        container,
                        false);

        chatRecycler = view.findViewById(R.id.chatRecycler);
        statusRecycler = view.findViewById(R.id.statusRecycler);

        // CHAT LIST

        chatList = new ArrayList<>();

        chatList.add(new Chat("Sarah","Hello there","10:30",R.drawable.sarah));
        chatList.add(new Chat("John Doe","How are you","11:15",R.drawable.john));
        chatList.add(new Chat("Mike","Good morning","12:00",R.drawable.mike));
        chatList.add(new Chat("Michelle","See you soon","12:45",R.drawable.michelle));
        chatList.add(new Chat("David","I see","13:05",R.drawable.david));
        chatList.add(new Chat("Henry","I'm hungry","15:45",R.drawable.henry));
        chatList.add(new Chat("Jane","Where are you?","16:00",R.drawable.jane));
        chatList.add(new Chat("Jess","Hello","19:30",R.drawable.jess));
        chatList.add(new Chat("Mave","See you soon","18:02",R.drawable.mave));
        chatList.add(new Chat("Joss","Yes","19:20",R.drawable.joss));
        chatList.add(new Chat("Hanny","Oh ok","19:30",R.drawable.hanny));
        chatList.add(new Chat("Max","Tomorrow","19:30",R.drawable.max));

        chatAdapter = new ChatAdapter(chatList);

        chatRecycler.setLayoutManager(
                new LinearLayoutManager(getContext()));

        chatRecycler.setAdapter(chatAdapter);

        // STATUS LIST

        statusList = new ArrayList<>();

        statusList.add(new Status("John", R.drawable.user1));
        statusList.add(new Status("Ama", R.drawable.user2));
        statusList.add(new Status("Kofi", R.drawable.user3));
        statusList.add(new Status("Michelle", R.drawable.user4));
        statusList.add(new Status("Jess", R.drawable.user5));
        statusList.add(new Status("Linda", R.drawable.user6));
        statusList.add(new Status("Henry", R.drawable.user7));
        statusList.add(new Status("Mike", R.drawable.user8));

        statusAdapter = new StatusAdapter(statusList);

        LinearLayoutManager horizontalLayout =
                new LinearLayoutManager(
                        getContext(),
                        LinearLayoutManager.HORIZONTAL,
                        false);

        statusRecycler.setLayoutManager(horizontalLayout);
        statusRecycler.setAdapter(statusAdapter);

        return view;
    }
}