package com.example.manakin;

public class Task {

    private String nama;
    private String day;
    private String label;

    public Task(String nama, String npm, String nohp) {
        this.nama = nama;
        this.day = npm;
        this.label = nohp;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}