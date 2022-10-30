package com.example;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        List<String> items = List.of("a", "b", "c", "d");
        items.forEach(item -> {
            System.out.println(item);
        });
    }
}
