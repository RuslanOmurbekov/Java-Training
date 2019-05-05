package practice;

import java.util.Scanner;

public class Pyramid2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of rows for your Pyramid");
		int numOfRows=sc.nextInt();
		
		System.out.println("This is number of rows of your Pyramid");
		
		int rowCount=1;
		
		for(int i=numOfRows; i>=1; i--) {
			
			for (int j = 1; j <= 2*i; j++)
            {
                System.out.print(" ");
            }
            //Printing j value where j value will be from 1 to rowCount
            for (int j = i; j <= numOfRows; j++)             
            {
                System.out.print(j+" ");
            }
            //Printing j value where j value will be from rowCount-1 to 1
            
            for (int j = numOfRows-1; j >= i; j--)
            {                 
                System.out.print(j+" ");             
            }                          
            
            System.out.println();
            //Incrementing the rowCount
            rowCount++;
        }
    

		}

	}


