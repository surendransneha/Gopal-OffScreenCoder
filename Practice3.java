import java.util.*;
class Practice3 
{
	public static void main(String[] args) 
	{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Question-1"+"\n");
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
	System.out.println("Positive Numbers are: " +P);
	System.out.println("Negative Numbers are:"  +N);
	System.out.println("Zero's Numbers are: "+ Z);

		}
		}

		

		
