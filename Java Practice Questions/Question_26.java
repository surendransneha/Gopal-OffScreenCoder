// Question_26: Read the below code and pick correct option?

class Question_26 {
public static void main(String[] args) {
Float valuePie = new Float(3.14f);
try {
if (valuePie > 3)
System.out.print("Pie value is greater than 3"+", ");
else
System.out.print("Pie value is not greater than 3"+", ");
} catch (Exception e) {
e.printStackTrace();
} finally {
System.out.println ("Have a nice day.");
} } }
/*
Output :-
A. Pie value is not greater than 3, Have a nice day.
B. Pie value is greater than 3, Have a nice day.
C. Pie value is not greater than 3.
D. An exception is thrown at runtime.

Answer:- Error

Explanation:- warning: [removal] Float(float) in Float has been deprecated and marked for removal
                               Float valuePie = new Float(3.14f);
*/
