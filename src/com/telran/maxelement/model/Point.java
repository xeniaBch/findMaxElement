package com.telran.maxelement.model;


public class Point implements Comparable<Point>{
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

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        int thisPoint = getX()*getX()+getY()*getY();
        int otherPoint = o.getX()*o.getX()+o.getY()*o.getY();
        return thisPoint - otherPoint;
    }

}
