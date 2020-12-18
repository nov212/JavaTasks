
package com.mycompany;

import com.mycompany.OOP.*;
import com.mycompany.OOP2.*;
public class NewMain {


    public static void main(String[] args) {
       Container container=new Container(0,0,100, 100);
       Ball ball=new Ball(50,10,2,30, 30);
        System.out.println("Ball in container:"+container.collides(ball));
        ball.move();
        ball.move();
        System.out.println("New x:"+ball.getX());
        System.out.println("New y:"+ball.getY());
        System.out.println("Ball in container:"+container.collides(ball));
        ball.reflectVertical();
        ball.reflectHorizontal();
        ball.move();
        ball.move();
        System.out.println("New x:"+ball.getX());
        System.out.println("New y:"+ball.getY());
    }
    }
