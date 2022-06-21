package com.example.recursion;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {

        int number;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number to sum");
        number=scan.nextInt();
        int[]nums=new int[number+1];
        System.out.print("Sum of the values : " );
        for(int i=0;i<number+1;i++){
            nums[i]=i;
            System.out.print(nums[i]+ " + " );
        }
        System.out.print("   ");
        System.out.println("is  "+recursion(number));

    }
    public static int recursion(int n){

        int sum = 0;  //base criteria-function stops calling itself when n=0
        if(n<=0){
            return sum=0;
        }
        else{
            return sum=n+recursion(n-1);  //progressive property-each time the function calls itself, it comes close to the answer
        }
    }
}
