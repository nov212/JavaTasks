package com.mycompany.OOP2;

public class MyPolynomial {
    private double[] coeffs;
    public MyPolynomial(double... coeffs){
        this.coeffs=coeffs;
    }

    public int getDegree(){
        return coeffs.length-1;
    }

    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder(100);
        for (int i=coeffs.length-1;i>0;i--)
            sb.append(coeffs[i]).append("x^").append(i).append("+");
        sb.append(coeffs[0]);
        return  sb.toString();
    }

    public double evaluate(double x){
        double res=0;
        for (int i=0;i<coeffs.length;i++)
            res+=coeffs[i]*Math.pow(x, i);
        return res;
    }

    public double[] getCoeff(){
        return coeffs;
    }

    public double getCoeff(int index){
        return coeffs[index];
    }

    public MyPolynomial add(MyPolynomial right){
        if (right==null)
            throw new NullPointerException();
        double[] newCoeffs;
        if (this.getDegree()> right.getDegree())
            newCoeffs=this.getCoeff();
        else
            newCoeffs= right.getCoeff();
        int i=-1;
        while(i<this.getDegree() && i<right.getDegree()){
            i++;
            newCoeffs[i]=this.getCoeff(i) + right.getCoeff(i);
        }
        return new MyPolynomial(newCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial right){
        if (right==null)
            throw new NullPointerException();
        double[] newCoeff=new double[this.getDegree()+ right.getDegree()+1];
            for(int j=0;j<coeffs.length;j++)
                for(int k=0; k<right.getDegree()+1;k++)
                    newCoeff[j+k]+=coeffs[j]*right.getCoeff(k);
        return new MyPolynomial(newCoeff);
    }

}
