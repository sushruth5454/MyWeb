package com.example;

public class Alien {
    private int aid;
    private String aname;
    private String language;

    public Alien(int aid, String aname, String language) {
        this.aid = aid;
        this.aname = aname;
        this.language = language;
    }

    public Alien() {
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
