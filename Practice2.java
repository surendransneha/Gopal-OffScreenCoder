import java.util.*;
class Practice2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("Question-1"+"\n");
	System.out.println("Enter The Size of an Array");
	int Size=sc.nextInt();
	int []Array=new int[Size];
	System.out.println("Enter The Array Elements"+"\t");
	for(int i=0;i<Size;i++){
	Array[i]=sc.nextInt();
	}
	System.out.println("Enter the Element");
	for(int i=0;i<Size;i++){
	Array[i]=sc.nextInt();
	}
	//if(Size==Array[i]){
	System.out.print("Printing The Elements in Array"+"\n");
	for(int i=0;i<Array.length;i++){
		System.out.println(Array[i]);
	}
	}
}