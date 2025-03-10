package com.sudoagile.m4_clase6_1;

public class ListElement  {
        private String color;
        private String name;
        private String subtitle;
        private String status;

    public ListElement(String color, String name, String subtitle, String status) {
        this.color = color;
        this.name = name;
        this.subtitle = subtitle;
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}