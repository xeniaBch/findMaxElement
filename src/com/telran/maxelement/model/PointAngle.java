package com.telran.maxelement.model;


public class PointAngle implements Comparable<PointAngle> {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public PointAngle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int distanceFromCenter() {
        return getX() * getX() + getY() * getY();
    }

    public float angleBetweenDistanceAndOX() {
        return (float) Math.acos(getX() / Math.sqrt(distanceFromCenter()));
    }


    @Override
    public int compareTo(PointAngle o) {
        return Float.compare(angleBetweenDistanceAndOX(), o.angleBetweenDistanceAndOX());
    }

}
