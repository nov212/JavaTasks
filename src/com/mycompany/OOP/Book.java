package com.mycompany.OOP;

public class Book {
private String name;
private  Author[] authors;
private double price;
private int qty=0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString(){
        StringBuilder authorsInfo=new StringBuilder(150);
        for (int i=0; i<authors.length;i++) {
            authorsInfo.append("Author[name="+authors[i].getName()+",email="+authors[i].getEmail()+",gender="+authors[i].getGender()+"]");
            if (i<authors.length-1){
                authorsInfo.append(',');
            }
        }
        String s="Book=[name="+name+",authors={"+authorsInfo.toString()+"},price="+price+",qty="+qty;
        return s;
    }

}
