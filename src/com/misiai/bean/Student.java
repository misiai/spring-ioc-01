package com.misiai.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Student {
    private String name;
    private String sno;
    /*为student类添加各种类型*/
    private Car car;
    private List<Book> books;
    private Double salary;





    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Student(Car car) {
        this.car = car;
        System.out.println("Student的car构造器");
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    private Map<String, Object> map;
    private Properties properties;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sno='" + sno + '\'' +
                ", car=" + car +
                ", books=" + books +
                '}';
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Student() {
        System.out.println("Student的无参构造！");
    }

    public Student(String name, String sno) {
        this.name = name;
        this.sno = sno;
        System.out.println("Student的有参构造！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }
}
