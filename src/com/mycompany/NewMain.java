
package com.mycompany;

import com.mycompany.OOP.*;
import com.mycompany.OOP2.*;
public class NewMain {


    public static void main(String[] args) {
        MyPolynomial mp=new MyPolynomial(0);
        MyPolynomial mp1=new MyPolynomial(6,0,3,4);
        MyPolynomial res=mp1.multiply(mp);
        System.out.println(res.toString());
    }
    }
