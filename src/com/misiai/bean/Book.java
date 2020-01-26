package com.misiai.bean;

public class Book {
    private String name;
    private String price;

    public Book() {
        System.out.println("Book 被创建了！");
    }


    public void myInit() {
        System.out.println("Book的初始化方法");
    }

    public void myDestroy() {
        System.out.println("Book的销毁方法");
    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
