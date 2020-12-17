
package com.mycompany;

import com.mycompany.OOP.*;
public class NewMain {


    public static void main(String[] args) {
        MyPoint p1=new MyPoint(5,0);
        MyPoint p2=new MyPoint(6, 10);
        System.out.println(p1.distance());
        MyTriangle tr=new MyTriangle(new MyPoint(0,0), new MyPoint(2,0), new MyPoint(6,0));
        System.out.println(tr.getType());
        }
    }
