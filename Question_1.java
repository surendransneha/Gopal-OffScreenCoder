//Question1 :- Take 10 integer inputs from user and store them in an array and print them on screen..?

//Program :-

package TrickyQuestion;

import java.util.*;

public class Question_1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\n"+"Question-1"+"\n");
		
		System.out.println("Enter The Size of An Array");
		
		int Size=sc.nextInt();
		
		int []Array=new int[Size];
		
		System.out.print("\n"+"Enter The Array Elements"+"\n");
		
		for(int i=0;i<Size;i++){
			
		Array[i]=sc.nextInt();
		
		}
		System.out.println("\n"+"The Array Elements Are "+"\n");
		
		for(int i=0;i<Array.length;i++){
			
			System.out.print( Array[i]+"\t");
		
		

	}

	}
}

