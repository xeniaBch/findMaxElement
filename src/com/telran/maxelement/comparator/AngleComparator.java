package com.telran.maxelement.comparator;

import com.telran.maxelement.model.Point;

import java.util.Comparator;

public class AngleComparator implements Comparator<Point> {
    @Override
    public int compare(Point p1, Point p2) {
        if(findAngle(p1) > findAngle(p2)) return 1;
        else if (findAngle(p1) < findAngle(p2)) return -1;
        else return 0;
    }

    public int findAngle(Point point) {
        double angle;
        if(point.getY() > 0) {
            angle = Math.acos(point.getX() / Math.sqrt(point.getX() * point.getX() + point.getY() * point.getY()));
        } else {
            angle = (Math.PI +  Math.acos(point.getX() / Math.sqrt(point.getX() * point.getX() + point.getY() * point.getY())));
        }
       return (int) Math.toDegrees(angle);
    }
}
