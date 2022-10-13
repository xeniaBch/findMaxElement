package model;

public class Cartesian {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Cartesian(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceFromCenter(){
        return Math.sqrt(Math.pow(getX(),2)+Math.pow(getY(),2));
    }

    public double angleBetweenDistanceAndOX(){
        return Math.acos(getX()/distanceFromCenter());
    }
}
