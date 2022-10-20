package model;


public class PointDistance implements Comparable<PointDistance>{
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

    public PointDistance(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int distanceFromCenter(){
        return getX()*getX()+getY()*getY();
    }

  //  public float angleBetweenDistanceAndOX(){        return (float) Math.acos(getX()/distanceFromCenter());    }


    @Override
    public int compareTo(PointDistance o) {
        int thisPoint = distanceFromCenter();
        int otherPoint = o.distanceFromCenter();
        return thisPoint - otherPoint;
    }

}
