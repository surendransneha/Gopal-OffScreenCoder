//Question_8: How many Objects created in the below code?
class Question_8 {
Question_8() {
System.out.println(this.hashCode());
} }
class Y extends Question_8 {
Y() {
System.out.println(this.hashCode());
} }
public class TestClass {
public static void main(String[] args) {
Y y = new Y();
System.out.println(y.hashCode());
} }
/*
Output :-
A. 3.
B. 2.
C. 1.
D. None of the above.

Answer:- D

Explanation:- class TestClass is public, should be declared in a file named TestClass.java
                  public class TestClass 
*/
