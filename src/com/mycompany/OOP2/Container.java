package com.mycompany.OOP2;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x1, int y1, int width, int height) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2=x1+width;
        this.y2=y1+height;
    }

    public int getX(){
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth(){
        return x2-x1;
    }

    public int getHeight(){
        return y2-y1;
    }

    public boolean collides(Ball ball){
        if (ball==null)
            throw new NullPointerException();
        int radius= ball.getRadius();
        if ((ball.getX()-radius)>=x1 && (ball.getX()+radius)<=x2)
            return ((ball.getY()-radius)>=y1 && (ball.getY()+radius)<=y2);
        return false;
    }

    @Override
    public String toString(){
        return String.format("Container[(%d,%d),(%d,%d)]",x1,y1,x2,y2);
    }
}
