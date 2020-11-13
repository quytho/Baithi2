package com.example.baithi;

public class Contact {
    private int mImage1, mImage2;
    private String mName;

    public Contact(int mImage1,String mName,int mImage2) {
        this.mImage1 = mImage1;
        this.mName = mName;
        this.mImage2 = mImage2;
    }

    public int getmImage1() {
        return mImage1;
    }

    public void setmImage1(int mImage1) {
        this.mImage1 = mImage1;
    }

    public int getmImage2() {
        return mImage2;
    }

    public void setmImage2(int mImage2) {
        this.mImage2 = mImage2;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
}