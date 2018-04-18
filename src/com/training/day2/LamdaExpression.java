package com.training.day2;

public class LamdaExpression {

	interface PerformOperations()
	{
		int check(int a);
	}
	
	class Operation{
		
		public static int check(PerformOperations p ,int num){
			return p.check(num);
		}

	}
	
}
