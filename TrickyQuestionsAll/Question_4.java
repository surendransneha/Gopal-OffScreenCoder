//Question4 :- Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array
//	       but in Reverse order..? 

//Program :-


package TrickyQuestion;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\n"+"Question-4"+"\n");
		
		System.out.println("Enter The Size of An Array");
           int Size=sc.nextInt();
           
		int []Array=new int[Size];
		
		System.out.print("\n"+"Enter The Array Elements"+"\n");
		
		for(int i=0;i<Size;i++){
			
		Array[i]=sc.nextInt();
		
		}
		
		System.out.print("Print The Elements"+"\n");
		
		for(int i=0;i<Size;i++) {
			
			System.out.println(Array[i]+"\n");
		}
		
		System.out.println(" ");
		
		System.out.println("Reverse Array is"+"\n");
		
		int arr2[]=new int[Size];
		
		for(int j=0;j<Size;j++) {
			
			arr2[j]=Array[Size-j-1];
			
			int b=arr2[j];
			
			System.out.print(b+"\t");
		}
		
	}

}
