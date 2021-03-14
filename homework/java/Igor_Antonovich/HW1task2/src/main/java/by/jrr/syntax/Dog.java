package by.jrr.syntax;

public class Dog {

    int age;
    double price;
    
    String name = "Bobik";

    Dog(int a, double b) {
        age = a;
        price = b;
        System.out.println(" dog has been created");
        System.out.println(age);
        System.out.println(price);
        bark();
    }

    public void bark() {
        System.out.println(" dag say");
        System.out.println(" bark bark");
    }
}
