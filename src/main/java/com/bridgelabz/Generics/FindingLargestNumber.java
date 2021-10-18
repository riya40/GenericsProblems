package com.bridgelabz.Generics;
import java.util.*;
public class FindingLargestNumber {
    int a,b,c;
    Scanner s=new Scanner(System.in);

    public void intlargest(){
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a>b && a>c){
            System.out.println("the largest is"+a);
        }
        else if(b>a && b>c){
            System.out.println("the largest is:"+b);
        }
        else{
            System.out.println("the largest is"+c);
        }
    }
    public void floatlargest(){
        float a,b,c;
        a=s.nextFloat();
        b=s.nextFloat();
        c=s.nextFloat();
        if(a>b && a>c){
            System.out.println("the largest is"+a);
        }
        else if(b>a && b>c){
            System.out.println("the largest is:"+b);
        }
        else{
            System.out.println("the largest is"+c);
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
