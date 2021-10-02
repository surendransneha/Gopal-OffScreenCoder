// Question_23: Read the below code and pick correct option?

public class Question_23 {
public void main(String[] args) {
int x = 6;
Question_23 Q = new Question_23();
Q.doSomething(x);
System.out.print(" main x = " + x);
}
void doSomething(int x) {
System.out.print(" method x = " + x++);
} }
/*
Output :-
A. An exception is thrown at runtime
B. method x = 6, main x = 6
C. method x = 6 main x = 7
D. method x = 7 main x = 6

Answer:- Error.

Explanation:-error: Main method is not static in class Question_23, please define the main method as:
                      public static void main(String[] args)
*/

