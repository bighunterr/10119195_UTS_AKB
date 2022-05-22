package com.fajar.myselfapp;

// Nama :Fajar Nugraha
// Nim : 10119195,
// Kelas :IF5
// Tgl Pengerjaan : 20 Mei 2022,

public class MainModel {
    Integer img_friend;
    String keterangan;

    public MainModel(Integer img_friend,String keterangan){
        this.img_friend = img_friend;
        this.keterangan = keterangan;


    }
    public Integer getImg_friend(){
        return img_friend;
    }

    public String getKeterangan() {
        return keterangan;
    }
}
