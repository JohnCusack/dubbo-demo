/**
 * 
 */
package com.lagou;

import java.io.IOException;
import java.util.List;

import org.dubbo.provider.api.DemoService;
import org.dubbo.provider.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Peker
 * @time  2015年12月26日下午5:16:35
 */
public class Consumer {

	/**  
	 * @author  Peker
	 * @title   main   
	 * @param   
	 * @return  void   
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring-dubbo.xml" });	
		context.start();
		DemoService demoService = (DemoService) context.getBean("demoService");
		String hello = demoService.sayHello("tom");
		System.out.println(hello);
		
		List<User> list = demoService.getUsers();
		if(list != null && list.size() > 0) {
			for(User user :list) {
				System.out.println(user);
			}
		}
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
