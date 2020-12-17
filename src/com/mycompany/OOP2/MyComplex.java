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
            return String.format("(\\f-\\fi)", real, Math.abs(imag));
        return String.format("(\\f+\\fi)", real, Math.abs(imag));
    }

    /**
     * checks is the complex number contain real part
     * @return true if yes, false if not
     */

    public boolean isReal(){
        return real!=0;
    }

    /**
     * checks is the complex number contain imaginary part
     * @return true if yes, false if not
     */

    public boolean isImaginary(){
        return  imag!=0;
    }

    public boolean equals(double real, double imag){
        return this.real==real && this.imag==imag;
    }

    public boolean equals(MyComplex another){
        if (another==null)
            return false;
        return equals(another.getReal(), another.getImag());
    }

    /**
     * @return magnitude of the complex number
     */
    public double magnitude(){
        return Math.sqrt(Math.pow(real,2)+Math.pow(imag,2));
    }

    /**
     *
     * @return argument of this complex number in radians
     */

    public double argument(){
        return  0;
    }

    /**
     * add the given instance right into this instance
     * @param right right argument
     * @return this instance
     */

    public MyComplex add(MyComplex right){
        if (right==null)
            throw new NullPointerException();
        this.real+=right.getReal();
        this.imag+=right.getImag();
        return this;
    }

    /**
     * subtract the given instance right into this instance
     * @param right right argument
     * @return this instance
     */

    public MyComplex subtract(MyComplex right){
        if (right==null)
            throw new NullPointerException();
        this.real-=right.getReal();
        this.imag-=right.getImag();
        return this;
    }

    /**
     * multiply the given instance right into this instance
     * @param right right argument
     * @return this instance
     */
    public MyComplex multiply(MyComplex right){
        if (right==null)
            throw new NullPointerException();
        this.real=this.real*right.real-this.imag* right.imag;
        this.imag=this.real* right.imag+this.imag*right.real;
        return this;
    }

    /**
     * divide the given instance right into this instance
     * @param right right argument
     * @return this instance
     */
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

    /**
     * add this and right and return a new instance, this instance is not changed
     * @param right right argument
     * @return new instance
     */
    public MyComplex addNew(MyComplex right){
        if (right==null)
            throw new NullPointerException();
        MyComplex newComplex=new MyComplex();
        newComplex.real=this.real+right.real;
        newComplex.imag=this.imag+right.imag;
        return newComplex;
    }

    /**
     * substract this and right and return a new instance, this instance is not changed
     * @param right right argument
     * @return new instance
     */
    public MyComplex substractNew(MyComplex right){
        if (right==null)
            throw new NullPointerException();
        MyComplex newComplex=new MyComplex();
        newComplex.real=this.real-right.real;
        newComplex.imag=this.imag-right.imag;
        return newComplex;
    }

    /**
     * create a new complex number that conjugate on this instance
     * @return new instance
     */
    public MyComplex conjugate(){
        MyComplex conj=new MyComplex();
        conj.real=this.real;
        conj.imag=-1*this.imag;
        return conj;
    }

}
