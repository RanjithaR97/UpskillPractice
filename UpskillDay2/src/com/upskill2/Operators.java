package com.upskill2;

class IncrementAndDecrementOperators {
	public static void main(String[] args) {
		// Except for a minor difference
		// ++i,i++ is similar to i = i+1
		// --i,i-- is similar to i = i-1
		// ++i is called pre-increment,i++ post increment
		// pre-increment statement returns value after increment
		// post-increment statement returns value before increment
		int i = 25;
		int j = ++i;// i is incremented to 26, assigned to j
		System.out.println(i + " " + j);// 26 26

		i = 25;
		j = i++;// i value(25) is assigned to j, then incremented to 26
		System.out.println(i + " " + j);// 26 25

		i = 25;
		j = --i;// i is decremented to 24, assigned to j
		System.out.println(i + " " + j);// 24 24

		i = 25;
		j = i--;// i value(25) is assigned to j, then decremented to 24
		System.out.println(i + " " + j);// 24 25

		final int k = 100;
		// j=k++;//COMPILER ERROR! Final value cannot be modified
		
		System.out.println(true && true);// true
		System.out.println(true && false);// false
		System.out.println(false && true);// false
		System.out.println(false && false);// false

		// Short Circuit Or Operator - ||
		// True when atleast one of operands are true
		System.out.println(true || true);// true
		System.out.println(true || false);// true
		System.out.println(false || true);// true
		System.out.println(false || false);// false

		// Logical Operators work only with boolean's not number's
		// System.out.println(5 || 6);//COMPILER ERROR

		// Short circuit operators are Lazy.
		// They stop execution the moment result is clear.
		// For &&, if first expression is false,result is false.
		// For ||, if first expression is true, the result is true.
		// In above 2 situations, second expressions are not executed.
		int i1 = 10;
		System.out.println(true || ++i == 11);// true
		System.out.println(false && ++i == 11);// false

		// i remains 10, as ++i expressions are not executed
		System.out.println(i);// 10

		// Logical Operators &, | are similar to &&, || except
		// that they don't short ciruit. They execute the second
		// expression even if the result is clear.

		int j1 = 10;
		System.out.println(true | ++j == 11);// true
		System.out.println(false & ++j == 12);// false

		// j becomes 12, as both ++j expressions are executed
		System.out.println(j);// 12

		// Operator exclusive-OR
		// Result is true only if one of the operands is true
		System.out.println(true ^ false);// true
		System.out.println(false ^ true);// true
		System.out.println(true ^ true);// false
		System.out.println(false ^ false);// false

		// Not Operator (!)
		// Result is the negation of the expression
		System.out.println(!false);// true
		System.out.println(!true);// false
		int number = 7;
		// Always return true or false
		// <, <=, >, >=, ==, and !=

		// greater than operator
		System.out.println(number > 5);// true
		System.out.println(number > 7);// false

		// greater than equal to operator
		System.out.println(number >= 7);// true

		// less than operator
		System.out.println(number < 9);// true
		System.out.println(number < 7);// false

		// less than equal to operator
		System.out.println(number <= 7);// true

		// is equal to operator
		System.out.println(number == 7);// true
		System.out.println(number == 9);// false

		// NOT equal to operator
		System.out.println(number != 9);// true
		System.out.println(number != 7);// false

		// NOTE : single = is assignment operator
		// == is comparison. Below statement uses =.
		System.out.println(number = 7);// 7

		// Equality for Primitives only compares values
		int a = 5;
		int b = 5;

		// compares if they have same value
		System.out.println(a == b);// true

		// Equality for Reference Variables.
		Integer aReference = new Integer(5);
		Integer bReference = new Integer(5);

		// compares if they are refering to the same object
		System.out.println(aReference == bReference);// false

		bReference = aReference;
		// Now both are referring to same object
		System.out.println(aReference == bReference);// true
		
		System.out.println(5 + "Test" + 5); // 5Test5
		System.out.println(5 + 5 + "Test"); // 10Test
		System.out.println("5" + 5 + "Test"); // 55Test
		System.out.println("5" + "5" + "25"); // 5525
		System.out.println(5 + 5 + "25"); // 1025
		System.out.println("" + 5 + 5 + "25"); // 5525
		System.out.println(5 + (5 + "25")); // 5525
		
		int age = 18;
		// syntax - booleanCondition?ResultIfTrue:ResultIfFalse;
		System.out.println(age >= 18 ? "Can Vote" : "Cannot Vote");// Can Vote

		age = 15;
		System.out.println(age >= 18 ? "Can Vote" : "Cannot Vote");// Cannot


	}
}
