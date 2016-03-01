/**
 * 
 */
package org.dubbo.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Peker
 * @time 2015年12月26日上午11:43:47
 */
public class Provider {

	/**
	 * @author Peker
	 * @title main
	 * @param
	 * @return void
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring-dubbo.xml" });
		context.start();
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		context.close();
		// test(new String[] {"s1","s2","s3"});
	}

	public static void test(String... args) {
		for (String arg : args) {
			System.out.println(arg + ",");
		}
		System.out.println("hello!");
	}

}
