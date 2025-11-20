package org.example;

public class Dev {

    private Laptop laptop;
    private Computer comp;
    private int age;

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

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

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }



    public Dev(){
        System.out.println("Dev Constructor");
    }

    public void build()
    {
        System.out.println("learning Spring");
        comp.compile();
    }
}
