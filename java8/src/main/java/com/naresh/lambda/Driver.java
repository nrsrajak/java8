/**
 * 
 */
package com.naresh.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nrajak
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LambdaPractice lambda = (Double a, Double b) -> a * b;
//				(int number) -> System.out.println("The answer is :"+2 * number);
		lambda.normalFun();
//		lambda.abstractFun(10);
		System.out.println(lambda.multiply(10.0, 5.0));;
		List<String> names = new ArrayList<>();
		names.add("Naresh");
		names.add("Manisha");
		names.add("Namish");
		
		names.forEach(n -> System.out.println("Name :"+n));
		
		names.forEach(n -> {if(n.equals("Naresh")) System.out.println(n); });
		

	}

}
