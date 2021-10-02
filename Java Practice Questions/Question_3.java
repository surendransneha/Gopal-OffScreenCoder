//Question_3: What is the output of this code?
public class Question_3
{
public static void main(String[] args) {
int arrOne[] = { 1, 2, 3, 4, 5 };
int arrTwo[] = { 0, 0, 0, 0, 0 };
for (int i = 0; i < arrOne.length; i++) {
arrTwo[i] = arrOne[arrOne.length - i - 1];
}
System.out.println(Arrays.toString(arrTwo));
}
}
/*
Output :-
A. [0, 0, 0, 0, 0].
B. [5, 4, 3, 2, 1].
C. [1, 2, 3, 4, 5].
D. Compiletime Error.
 Answer:- D
 Explaination:-
              cannot find symbol System.out.println(Arrays.toString(arrTwo));
*/
