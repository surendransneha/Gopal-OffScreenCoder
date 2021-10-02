// Question_22: Read the below code and pick correct option?
public class Question_22 {
public static void main(String[] args) {
int x = 5;
boolean b1 = true;
boolean b2 = false;
if ((x == 4) && !b2)
System.out.print("1 ");
System.out.print("2 ");
if ((b2 = true) && b1)
System.out.print("3 ");
} }
/*
Output :-
A. 2, 3
B. 1, 2
C. 3, 2
D. An exception is thrown at runtime

Answer:- A
*/
