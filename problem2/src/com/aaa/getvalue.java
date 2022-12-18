package com.aaa;

import java.util.Scanner;

public class getvalue{
    public int getValue(){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("-------TO EXIT PRESS 1111 AND ENTER-------");
        System.out.println("----ENTER THE VALUE IN BETWEEN -512 TO 511----");
        System.out.println("Enter The Value : ");
        final int val=myObj.nextInt();
        return val;
    }
}
