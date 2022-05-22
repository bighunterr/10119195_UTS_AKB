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
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MusicFragment extends Fragment {
    ListView listView;
    String mnama_video[] = {"Photogpraph", "Old Twan Road", "100 Degree", "What Makes You Beautiful", "Yang Terdalam"};
    String mtahun_video[] = {"Ed Sheeran", "Lil Nash","Rich Brian", "One Direction", "NOAH"};
    int mimg_video[] = {R.drawable.photograph, R.drawable.oldtown, R.drawable.degree, R.drawable.makesyoubeau, R.drawable.ygterdalam};

    VideoView videoView;
    //deklarasi objek
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_music, container, false);
        videoView = rootView.findViewById(R.id.videoView);
        listView = rootView.findViewById(R.id.list_view_video);
        videoView = (VideoView) rootView.findViewById(R.id.videoView);
        //inisialisasi object videoView
        videoView.setVideoURI(Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.jujutsu));
        //digunakan untuk mengidentifikasi resource seperti lokasi video
        videoView.setMediaController(new MediaController(getActivity()));
        //menampilkan media controller video
        videoView.start();
        //memulai video

        Adapter_listview adapter_listview = new Adapter_listview(getActivity(),mnama_video, mtahun_video, mimg_video);

        listView.setAdapter(adapter_listview);

        return rootView;
    }

}