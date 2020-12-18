package com.mycompany.OOP2;

public class Ball {
    private double x;
    private double y;
    private int radius;
    private double xDelta;
    private double yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius=radius;
        xDelta=speed*Math.cos(Math.toRadians(direction));
        yDelta=-speed*Math.sin(Math.toRadians(direction));
    }

    public double getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public double getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        x+=xDelta;
        y+=yDelta;
    }

    public void reflectHorizontal(){
        xDelta=-xDelta;
    }

    public void reflectVertical(){
        yDelta=-yDelta;
    }

    @Override
    public String toString(){
        return String.format("Ball[(%.2f;%.2f),speed=(%.2f;%.2f)]",x,y,xDelta, yDelta);
    }

}
