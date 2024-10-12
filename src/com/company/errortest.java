package com.company;
import java.util.*;

public class errortest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=100;
        int b =sc.nextInt();
        try{
            int c=a/b;
            System.out.println("reustl"+ c);
        }
        catch(ArithmeticException e){
            System.out.println("haha"+ e);
        }
        catch (IllegalArgumentException e){
            System.out.println("hehe"+ e);
        }
    }
}
