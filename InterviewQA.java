class InterviewQA 
{
	    public void Q1(){
		   //Decleration And Initialization
		int Height=2,Width=3,Area;
		   //Logic
		Area=Height*Width;
		   //Priting Output
		System.out.println("  "+"Question-1"+"\n");
		System.out.println("  "+"Area of Rectangle is: "+Area+"\n");
		System.out.println("---------------------------------------------"+"\n");
	}
	
	    public void Q2(){
			//Decleration And Initialization
		Double numberOne=8.2;
		Double numberTwo=6.0;
		    //Logic
		Double ProductOfTwoNumbers=numberOne*numberTwo;
		    //Priting Output
		System.out.println("  "+"Question-2"+"\n");
		System.out.println("  "+"The Product of Two Numbers is:"+ProductOfTwoNumbers+"\n");
		System.out.println("  "+"The Product of Two Numbers is:"+String.format("%.2f",ProductOfTwoNumbers)+"\n");
		System.out.println("---------------------------------------------"+"\n");
	}
		public void Q3(){
			//Decleration And Initialization
		int i ='H';
		    //Priting Output
		System.out.println("  "+"Question-3"+"\n");
		System.out.println("  "+"The ASCII Value of H is : "+i+"\n");
		System.out.println("---------------------------------------------"+"\n");
	}
		public void Q4(){
			//Decleration And Initialization
		double d=100.235;
		    //Logic
		int Value=(int)d;
		    //Priting Output
		System.out.println("  "+"Question-4"+"\n");
		System.out.println("  "+"Double Value is: "+d+"\n");
		System.out.println("  "+"Converting Double Value to Integer Value is: "+Value+"\n");
		System.out.println("---------------------------------------------"+"\n");
	}
		public void Q5(){
			//Decleration And Initialization
		int i='D'+3;
		    //Priting Output
		System.out.println("  "+"Question-5"+"\n");
		System.out.println("  "+"Add  Value 3 To Ascii Character Of D And Printing The Value is: "+i+"\n");
		    //Decleration And Initialization
		char ch=71;
		    //Priting Output
		System.out.println("  "+"The Equivalent Ascii Character of 71 is: "+ch+"\n");
		System.out.println("---------------------------------------------"+"\n");
		
	}
		public void Q6(){
			//Decleration And Initialization
		int i=5;
		double d=6.2;
		    //Logic
		double Result=i+d;
		    //Priting Output
		System.out.println("  "+"Question-6"+"\n");
		System.out.println("  "+"The Addition of Int And Double Value is: "+Result+"\n");
		System.out.println("  "+"The Addition of Int And Double Value Upto 3 Decimal Point is: "+String.format("%.3f",Result)+"\n");
		System.out.println("---------------------------------------------"+"\n");
	}
		public void Q7(){
			//Decleration And Initialization
		double d=3.9d;
		     //Logic
		double Square=d*d;
		     //Priting Output
		System.out.println("  "+"Question-7"+"\n");
		System.out.println("  "+"Square of the Number is: "+Square+"\n");
		System.out.println("  "+"Square of the Number is: "+String.format("%.3f",Square)+"\n");
		System.out.println("---------------------------------------------"+"\n");
	}

		public void Q8(){
			//Decleration And Initialization
		double d,Cube;
		d=3.2;
		    //Logic
		Cube=d*d*d;
		    //Priting Output
		System.out.println("  "+"Question-8"+"\n");
		System.out.println("  "+"Cube of the Number is :"+Cube+"\n");
		System.out.println(""  +"Cube of the number is : "+String.format("%.3f",Cube)+"\n");
		System.out.println("---------------------------------------------"+"\n");
	}

	public static void main(String[] args) 
	{
	InterviewQA IQ=new InterviewQA();
	IQ.Q1();
	IQ.Q2();
	IQ.Q3();
	IQ.Q4();
	IQ.Q5();
	IQ.Q6();
	IQ.Q7();
	IQ.Q8();
	}
}
