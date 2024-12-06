package com.example;

public class Method_Kel03 {
    public void greet(){
        System.out.println("Hello!!");
    }

    public String intro(String name, String city, String hobby){
        return "My name is " + name + " I'm from " + city + " and my hobby is " + hobby;
    }

    public void printAge(int age){
        System.out.println("I'm " + age + " years old");
    }

    public static void main(String[] args) {
        Method_Kel03 object = new Method_Kel03();
        object.greet();
        String printMe = object.intro("Taylor","Nashville","Singing");
        System.out.println(printMe);
        object.printAge(17);
    }
}
