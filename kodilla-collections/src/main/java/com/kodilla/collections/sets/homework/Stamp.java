package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private int width;
    private int height;
    private boolean stamped;

    public Stamp(String name, int width, int height, boolean stamped) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.stamped = stamped;
    }

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return width == stamp.width &&
                height == stamp.height &&
                stamped == stamp.stamped &&
                Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, width, height, stamped);
    }

    public String getStamped() {
        if (this.stamped) {
            return "Stamped";
        } else {
            return "Not stamped";
        }
    }
}
