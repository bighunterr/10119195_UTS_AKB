package com.fajar.myselfapp;

// Nama :Fajar Nugraha
// Nim : 10119195,
// Kelas :IF5
// Tgl Pengerjaan : 20 Mei 2022,

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DailyFragment extends Fragment {
    ListView listView;
    RecyclerView recyclerView;
    ArrayList<MainModel> mainModels;
    Adapter_horizontal adapter_horizontal;

    String mTitle[] = {"Hiking", "Riding Motor", "Bermain Game", "Ngopi", "Belajar"};
    String mDescription[] = {"Hikingg salah satu hobby juga","Suka sunmori tiap weekend", "Buat slingan aja kalo abis belajar", "Mencari inspirasi", "Belajar biar pinter"};
    int mimages[] = {R.drawable.hiking, R.drawable.riding, R.drawable.bermaingame, R.drawable.ngopi, R.drawable.belajar};
    int[] img_friend = {R.drawable.albe, R.drawable.jakur, R.drawable.kiki, R.drawable.fikri, R.drawable.ramaprof};
    String[] keterangan = {"Ableb", "Jakur", "Otong", "Pakboy", "Rama"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mainModels = new ArrayList<>();
        for (int i=0;i<img_friend.length;i++){
            MainModel model = new MainModel(img_friend[i],keterangan[i]);
            mainModels.add(model);
        }


        View rootView = inflater.inflate(R.layout.fragment_daily, container, false);
        listView = rootView.findViewById(R.id.list_view);
        recyclerView = rootView.findViewById(R.id.recyclerView_friend);
        LinearLayoutManager horizontalLayoutManager
                = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(horizontalLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        Adapter_horizontal adapter_horizontal = new Adapter_horizontal(getContext(),mainModels);
        Adapter_listview adapter_listview = new Adapter_listview(getActivity(),mTitle, mDescription, mimages);

        listView.setAdapter(adapter_listview);
        recyclerView.setAdapter(adapter_horizontal);
        return rootView;
    }
}
