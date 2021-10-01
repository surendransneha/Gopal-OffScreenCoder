//Question2 :- Take 10 Integer inputs from user and store them in an Array. Again ask user to enter a number and now tell user
//             to check whether that number is present in an Array or not..?

//program :-


package TrickyQuestion;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		int a=0;
		
		System.out.println("Question-2"+"\n");
		
		System.out.println("Enter the array size");
		
		int n=s.nextInt();
		
		int arr[]=new int[10];
		
		System.out.println("Enter the array of element");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Print the array elements");
		
		for(int i=0;i<n;i++)
		{
			System.out.print(" "+arr[i]+"\t");
		}
		System.out.println("\n"+"Enter the element to check"+"\n");
		
		int j=s.nextInt();
		
		for(int i=0;i<n;i++) {
			
		if(arr[i]==j)
		{
		a=1;	
			System.out.println(" the element "+j +" is matching with array");
			
		}
		}
		if(a==0)
		{
			System.out.println(" the element "+j +" is not matching with array");
			
		}
		}
		}
	

			
	
	


