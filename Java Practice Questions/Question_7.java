// Question_7?
class Question_7 {
int count = 0;
public static void main(String[] args) {
System.out.println(count);
}
}
/*
Output :-
A. null.
B. 0.
C. Error.
D. None of the above.

Answer:- C
Explanation: non-static variable count cannot be referenced from a static context
         System.out.println(count);
*/