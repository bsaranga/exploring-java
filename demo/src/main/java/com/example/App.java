package com.example;

public class App 
{
    public static void main( String[] args )
    {
        MySuperClass mySuperClass = new MySuperClass();
        MyClass myClass = new MyClass();

        mySuperClass.Interact();
        myClass.Interact();

        myClass.Interact("YO YO YO!");
    }
}
