// Question_21: Read the below code and pick correct option?

class Question_21 {
static final long num = 343L;
static long testMethod(long num) {
System.out.print(++num + " ");
return ++num;
}
public static void main(String[] args) {
System.out.print(num + " ");
final long num = 340L;
new TestString1().testMethod(num);
System.out.println(num);
} }
/*
Output :-
A. 343 340 342
B. 343 341 342
C. 343 341 340
D. An exception is thrown at runtime

Answer: Error.

Expalanation:-  error: cannot find symbol
                      new TestString1().testMethod(num);
*/