package com.bridgelabz.Generics;
import java.util.*;
public class FindingLargestNumber {
    static int a,b,c;
    Scanner s=new Scanner(System.in);

    public int intlargest(){
        int a=5;
        int b=4;
        int c=3;
        if(a>b && a>c){
            return a;
        }
        else if(b>a && b>c){
            return b;
        }
        else{
            return c;
        }

    }
    public float floatlargest(){
        float a,b,c;
        a=s.nextFloat();
        b=s.nextFloat();
        c=s.nextFloat();
        if(a>b && a>c){
            return a;
        }
        else if(b>a && b>c){
            return b;
        }
        else{
            return c;
        }

    }
    private void stringlargest() {
        String a, b, c;
        a = s.nextLine();
        b = s.nextLine();
        c = s.nextLine();
        int result=a.compareTo(b);
        System.out.println(result);
        int result2=a.compareTo(c);
        System.out.println(result2);
        int result3=b.compareTo(c);
        System.out.println(result3);

    }

    public static void main(String[] args) {
        FindingLargestNumber m=new FindingLargestNumber();
        System.out.println("FindingLargestNumber");
        System.out.println("enter the number:");
        m.intlargest();
        System.out.println("enter the number:");
        m.floatlargest();
        System.out.println("enter the string:");
        m.stringlargest();

    }
}
