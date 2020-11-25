package com.example.homework;

public class Myin {
    private String txt;
    private int imagid;

    public void setImagid(int imagid) {
        this.imagid = imagid;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public int getImagid() {
        return imagid;
    }

    public String getTxt() {
        return txt;
    }
    public Myin(String name,int id){
        this.imagid=id;
        this.txt=name;
    }
}
