package com.mycompany.OOP;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        v1=new MyPoint(x1, y1);
        v2=new MyPoint(x2, y2);
        v3=new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString(){
        return  String.format("MyTriangle[v1=(%d,%d),v2=(%d,%d),v3=(%d,%d)]", v1.getX(), v1.getY(), v2.getX(), v2.getY(), v3.getX(), v3.getX());
    }

    public double getPerimeter(){
        return v1.distance(v2)+v1.distance(v3)+v2.distance(v3);
    }

    public String getType(){
        double dist1=v1.distance(v2);
        double dist2=v1.distance(v3);
        double dist3=v2.distance(v3);
        //triangle rule
        if ((dist1+dist2)<=dist3 || (dist1+dist3)<=dist2 || (dist2+dist3)<=dist1)
            return "not a triangle";
            if (dist1==dist2 && dist2==dist3)
                return "equilateral";
            if (dist1==dist2 || dist1==dist3|| dist2==dist3)
                return "isosceles";
        return "scalene";
    }
}
