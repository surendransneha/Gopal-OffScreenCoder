//Question3 :- Take 20 integer inputs from user and Store them in an Array and print the following :
//             -Number of Even Numbers
//	        -Number of Odd Numbers	
//             -Number of Positive Numbers
//             -Number of Negative Numbers
//	        -Number of Zero's

//Program :-


package TrickyQuestion;

import java.util.*;

public class Question_3 {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Question-3"+"\n");
		
		System.out.println("Enter The Size of an Array");
		
		int Size=sc.nextInt();
		
		int [] a=new int[Size];
		
		System.out.println("Enter The Array Elements"+"\t");
		
		for(int i=0;i<Size;i++){
			
		a[i]=sc.nextInt();
		} 
		int P=0,N=0,Z=0;
		
		for(int i=0;i<a.length;i++){
			
			if(a[i]>0)
				
	         P++;
			
			 else if(a[i]<0)
				 
				   N++;
			 else 
				 
				 Z++;
				 
		}
		System.out.println("Positive Numbers are: " +P+"\n");
		
		System.out.println("Negative Numbers are:"  +N+"\n");
		
		System.out.println("Zero's Numbers are: "+ Z+"\n");
		
int evencount=0,oddcount=0;

	for(int i=0;i<a.length;i++) {
		
		if(a[i]%2==0)
			
			evencount++;
		
		else
			
		    oddcount++;	
	}
	
	System.out.println("Even Numbers are: "+evencount+"\n");
	
	System.out.println("Odd Numbers are: "+oddcount+"\n");
			}
	
			
	}
	


