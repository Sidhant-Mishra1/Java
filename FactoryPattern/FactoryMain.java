package FactoryPattern;

public class FactoryMain {
    public static void main(String[] args) {
        OSFactory osf=new OSFactory();
        OS obj=osf.getInstance("open");
        obj.specs();
    }
}
