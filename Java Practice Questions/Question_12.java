// Question_12: Find Out the correct output of the given code?

public class Question_12
{
public  void main(String[] args) {
int x = 10 * 10 - 10;
System.out.println(++x);
} }
/*
Output :-
A. 0
B. 90
C. 91
D. Runtime Erro

Answer:- D

Explanation:- Main method is not static in class Question_12, please define the main method as:
   public static void main(String[] args)
*/
