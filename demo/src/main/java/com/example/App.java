package com.example;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        MySuperClass mySuperClass = new MySuperClass();
        MyClass myClass = new MyClass();

        mySuperClass.Interact();
        myClass.Interact();

        myClass.Interact("YO YO YO!");

        List<String> items = List.of("a", "b", "c", "d");
        items.forEach(item -> {
            System.out.println(item);
        });
    }
}
