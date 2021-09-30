import java.util.*;
class Practice1 
{  
	public static void main(String args[]){ 
	Scanner sc=new Scanner(System.in);
	System.out.println("Question-1"+"\n");
	System.out.println("Enter The Size of an Array");
	int Size=sc.nextInt();
	int []Array=new int[Size];
	System.out.println("Enter The Array Elements"+"\n");
	for(int i=0;i<Size;i++){
	Array[i]=sc.nextInt();
	}
	System.out.println("Printing The Elements in Array"+"\n");
	for(int i=0;i<Array.length;i++){
		System.out.println(Array[i]);
}
	}
}
