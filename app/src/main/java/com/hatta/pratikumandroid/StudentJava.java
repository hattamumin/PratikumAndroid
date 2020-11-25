package com.hatta.pratikumandroid;

import android.os.Parcel;
import android.os.Parcelable;

public class StudentJava implements Parcelable {
     private String id;
     private String nama;
     private String phoneNumber;

    protected StudentJava(Parcel in) {
        id = in.readString();
        nama = in.readString();
        phoneNumber = in.readString();
    }

    public static final Creator<StudentJava> CREATOR = new Creator<StudentJava>() {
        @Override
        public StudentJava createFromParcel(Parcel in) {
            return new StudentJava(in);
        }

        @Override
        public StudentJava[] newArray(int size) {
            return new StudentJava[size];
        }
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id);
        parcel.writeString(nama);
        parcel.writeString(phoneNumber);
    }
}

