package edu.yaksha.rlyTicket;

import java.util.*;

public class Main 
{
	
	
    public static void main( String[] args )
    {
    	 Scanner scanner=new Scanner(System.in);
    	 System.out.println("Enter From Location:");
    	 String fromLocation=scanner.nextLine();
    	 System.out.println("Enter To Location:");
    	 String toLocation=scanner.nextLine();
    	 System.out.println("Enter Normal Train fare:");
    	 int normalFare=Integer.parseInt(scanner.nextLine());
         System.out.println("Enter number of passengers:");
         int no=Integer.parseInt(scanner.nextLine());
         if(no>6 || no<1)
         {
        	/*Your Code */
        	 
         }
         /*
          *  Your code
          */
         int totalFare=0;
         System.out.println("From:"+fromLocation+"   To:"+toLocation);
         /* 
          * Your Code
         }*/
         System.out.println("Total Amount payable:"+totalFare);
         
    }
}
