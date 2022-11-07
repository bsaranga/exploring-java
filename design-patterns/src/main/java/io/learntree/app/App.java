package io.learntree.app;

import io.learntree.app.classes.Person;

public class App 
{
    public static void main( String[] args )
    {
        Person saranga = new Person("Buwaneka", "Saranga");
        Person kaushik = new Person("Kaushik", "Iroshan");

        System.out.println(String.format("(%s)_(%s)", saranga.FirstName, saranga.LastName));
        System.out.println(String.format("(%s)_(%s)", kaushik.FirstName, kaushik.LastName));
    }
}
