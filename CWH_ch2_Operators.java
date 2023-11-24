package com.Rohit;

public class CWH_ch2_Operators {
	public static void main(String[] args) {
		int a = 5;
		// int b = 6-a; // (Here - is operator) Arithmetic Operator
		// int b = 6 % a; // (Here % is a Modulo Operator)
		
		//ASSIGMENT OPERATOR
		
		int b = 3; // (= is a Assigment operator)
		b += 3; // (Here += is a Assigemnt operator, you also use *=,-=,...)
		System.out.println(b);
		
		//COMPARISON OPERATOR

		System.out.println(66 > 89); // (Here > is comparison Operator, this shows in T/F)
		
		// LOGICAL OPERATORS

		System.out.println(66 > 8 && 68 > 9); // (Here && is Logical Opereator T/F)
		System.out.println(66 > 8 || 68 > 9); // (Here || is a OR Logical operator TT=T,TF=T)
	}
}
