package com.example.ropa;

public class PlayeraPersonalizada extends Ropa{

    private String twitter;
    public PlayeraPersonalizada(int id, double precio, String talla, String color, String twitter) {
        super(id, precio, talla, color);
        this.twitter = twitter;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }
}
