//Question_1: What is the exact output of this code?

class Question_1{
}
public class B{
void m1(){
System.out.println("This is method of Class B");
} }
public class C{
public static void main(String[] args){
B objB = new B();
System.out.print("This is Class C");
objB.m1();
} 
}

/* 
Output :-
A. This is method of Class B
B. This is Class C.
C. This is Class C, This is method of Class B.
D. Compilation Error.
Answer: D
Explanation:  class B is public, should be declared in a file named B.java
public class B and  error: class C is public, should be declared in a file named C.java
public class C
*/