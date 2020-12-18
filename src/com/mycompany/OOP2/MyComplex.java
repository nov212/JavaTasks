package com.mycompany.OOP2;

public class MyComplex {
    private double real=0;
    private double imag=0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag){
        this.real=real;
        this.imag=imag;
    }

    @Override
    public String toString(){
        if (imag<0)
            return String.format("(%f-%fi)", real, Math.abs(imag));
        return String.format("(%f+%fi)", real, Math.abs(imag));
    }

    public boolean isReal(){
        return real!=0;
    }


    public boolean isImaginary(){
        return  imag!=0;
    }

    public boolean equals(double real, double imag){
        return this.real==real && this.imag==imag;
    }

    public boolean equals(MyComplex another){
        if (this==another)
            return true;
        if (another==null)
            return false;
        return equals(another.getReal(), another.getImag());
    }

    public double magnitude(){
        return Math.sqrt(Math.pow(real,2)+Math.pow(imag,2));
    }

    public double argument(){
        if (real==0 && imag==0)
            throw new ArithmeticException("undefined value");
        if (real!=0) {
            double atan = Math.atan(imag / real);
            if (real>0)
                return atan;
            else
                if (imag>=0)
                    return Math.PI+atan;
            else
                return  -Math.PI+atan;
        }
        else
            if (imag>0)
                return Math.PI/2;
            else
                return -Math.PI/2;
    }

    public MyComplex add(MyComplex right){
        if (right==null)
            throw new NullPointerException();
        this.real+=right.getReal();
        this.imag+=right.getImag();
        return this;
    }


    public MyComplex subtract(MyComplex right){
        if (right==null)
            throw new NullPointerException();
        this.real-=right.getReal();
        this.imag-=right.getImag();
        return this;
    }


    public MyComplex multiply(MyComplex right){
        if (right==null)
            throw new NullPointerException();
        this.real=this.real*right.getReal()-this.imag* right.getImag();
        this.imag=this.real* right.getImag()+this.imag*right.getReal();
        return this;
    }

    public MyComplex divide(MyComplex right){
        if (right==null)
            throw new NullPointerException();
        if (right.magnitude()==0)
            throw new ArithmeticException("Divided by zero");
        double denominator=Math.pow(this.real,2)+Math.pow(this.imag, 2);
        double newReal=(this.real* right.getReal()+this.imag* right.getImag())/denominator;
        double newImag=(right.getReal()*this.imag-this.getReal()*right.getImag())/denominator;
        this.real=newReal;
        this.imag=newImag;
        return this;
    }


    public MyComplex addNew(MyComplex right){
        if (right==null)
            throw new NullPointerException();
        MyComplex newComplex=new MyComplex();
        newComplex.real=this.real+right.getReal();
        newComplex.imag=this.imag+right.getImag();
        return newComplex;
    }


    public MyComplex substractNew(MyComplex right){
        if (right==null)
            throw new NullPointerException();
        MyComplex newComplex=new MyComplex();
        newComplex.real=this.real-right.getReal();
        newComplex.imag=this.imag-right.getImag();
        return newComplex;
    }

    public MyComplex conjugate(){
        MyComplex conj=new MyComplex();
        conj.setReal(this.real);
        conj.setImag(-this.imag);
        return conj;
    }

}
