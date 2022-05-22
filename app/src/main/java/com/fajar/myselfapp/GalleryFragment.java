package com.fajar.myselfapp;

// Nama :Fajar Nugraha
// Nim : 10119195,
// Kelas :IF5
// Tgl Pengerjaan : 20 Mei 2022,

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class GalleryFragment extends Fragment {
    String title[] = {"Jakur foto", "albee foto", "Kiki foto", "Rama foto", "Fikri foto","Janug foto"};
    int arr[] = {R.drawable.jakur, R.drawable.albe, R.drawable.kiki, R.drawable.ramaprof, R.drawable.fikri, R.drawable.janug};
    private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_gallery, container, false);
        recyclerView = rootView.findViewById(R.id.list_gallery);
        layoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        Adapter_gallery adapter_gallery = new Adapter_gallery(getActivity(),title,arr);
        recyclerView.setAdapter(adapter_gallery);
        return rootView;
    }
}
