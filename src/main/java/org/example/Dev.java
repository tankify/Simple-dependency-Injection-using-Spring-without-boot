package org.example;

public class Dev {

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dev(int age) {
        this.age = age;
        System.out.println("Dev param Constructor");
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    private Laptop laptop;
    private int age;

    public Dev(){
        System.out.println("Dev Constructor");
    }

    public void build()
    {
        System.out.println("learning Spring");
        laptop.compile();
    }
}
