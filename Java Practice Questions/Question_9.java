// Question_9: What is the correct output of the given code?
public class Question_9 {
public static double calculation(double a, double b) {
if (a == b) {
return 0;
} else {
return 2 / (a - b);
} }
public static void main(String[] args) {
double d1 = Double.MIN_VALUE;
double d2 = 2.0 * Double.MIN_VALUE;
System.out.println("Result: " + calculation(d1, d2));
}
}
/*
Output :-
A. 0.0
B. 0
C. Error
D. -Infinity

Answer:- D
*/
