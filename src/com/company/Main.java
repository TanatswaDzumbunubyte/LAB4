package com.company;


import java.util.Scanner;

class rectanglearea{
   int length ,width;
   public void getData(){
       Scanner tj = new Scanner(System.in);
       System.out.println("This program will calculate the area of a given rectangle for you");
       System.out.println("Please enter your length");
       length = tj.nextInt();
       System.out.println("Please enter your width");
       width = tj.nextInt();
   }
   int computeField(){
       return(width * length);

   }
   public void fieldDisplay(){
       System.out.println("your LENGTH was "+ length);
       System.out.println(" ");
       System.out.println("your WIDTH was "+ width);
       System.out.println(" ");
       System.out.println("Therefore your AREA is "+ computeField());

   }

   static void start(){
       rectanglearea a = new rectanglearea();
       a.getData();
       a.computeField();
       a.fieldDisplay();
   }

}

public class Main {

    public static void main(String[] args) {
	rectanglearea.start();
    }
}
