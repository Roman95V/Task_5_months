package com.company;

public class Main {

    public static void main(String[] args)
    {
        /*Please, enter the month number*/
	   int num = 11;
       switch (num)
       {
         case 1:
         case 2:
         case 12: System.out.println("Season - Winter!");
             break;
         case 3:
         case 4:
         case 5: System.out.println("Season - Spring!");
             break;
         case 6:
         case 7:
         case 8: System.out.println("Season - Summer!");
             break;
         case 9:
         case 10:
         case 11: System.out.println("Season - Autumn!");
             break;
         default: System.out.println("Value was entered incorrectly");
             break;
       }
    }
}
