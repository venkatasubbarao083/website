package com.aaa;
import java.util.*;
public class MyData {
    Vector<Integer> v=new Vector<Integer>();
    Enumeration en = null;
    MyData(final int a){
        if(a==1111)
            System.exit(0);
        else
            checking(a);
    }
    void checking(int a){
        final int b = (int) a;
        if(b<=512&&b>-511){
            v.add(b);
            en = v.elements();
        }
        if(b==1111){
            System.out.println("-----------ENTERED VALUES ARE---------");
            while (en.hasMoreElements()){
                System.out.println(en.nextElement());
            }
        }
    }
    public static void main(String[] args){
        int val;
        boolean check=true;
        getvalue b = new getvalue();
        MyData a = new MyData(b.getValue());
        do {
            val=b.getValue();
            a.checking(val);
            if(val==1111){
                check=false;
            }
        }while(check);
    }
}