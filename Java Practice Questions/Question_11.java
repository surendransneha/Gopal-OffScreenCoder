// Question_11: What is the output of below code?
public class Question_11
{
public static void main(String[] args) {
int[] array = { 1, 2, 3, 4, 5 };
int sum = 0;
for (int i : array)
sum += ++i;
System.out.println(--sum);
} }
/*
Output :-
A. 15
B. 16
C. 20
D. 19

Answer:-D
*/
