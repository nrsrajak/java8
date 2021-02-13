/**
 * 
 */
package com.naresh.lambda;

/**
 * @author nrajak
 *
 */
public interface LambdaPractice {
//	void abstractFun(int number);
	Double multiply(Double a, Double b);
	
	default void normalFun(){
		System.out.println("Hello Dude!");
	}

}
