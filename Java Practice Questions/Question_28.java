// Question_28: Read the below code and pick correct option?
class Question_28 {
public static long round(double a) {
 if (a != 0x1.fffffffffffffp-2) {
 
 return (long)Math.floor(a + 0.5d);
 } else {
 return 0;
 } }
public static void main(String[] args) {
Question_28 Q = new Question_28();
Q.round(2.5);
} }
/*
Output :-
A. 3
B. 0.
C. -1.
D. None of the above.

Answer:- D
*/
