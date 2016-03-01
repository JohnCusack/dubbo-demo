/**
 * 
 */
package org.dubbo.provider.impl;

import java.util.ArrayList;
import java.util.List;

import org.dubbo.provider.api.DemoService;
import org.dubbo.provider.model.User;

/**
 * @author Peker
 * @time  2015年12月25日下午12:25:27
 */

public class DemoServiceImpl implements DemoService{

	/* (non-Javadoc)
	 * @see org.dubbo.provider.api.DemoService#sayHello(java.lang.String)
	 */
	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}

	/* (non-Javadoc)
	 * @see org.dubbo.provider.api.DemoService#getUsers()
	 */
	@Override
	public List<User> getUsers() {
		List<User> list = new ArrayList<User>();
		User user1 = new User();
		user1.setName("jack");
		user1.setAge(20);
		user1.setSex('男');
		User user2 = new User();
		user1.setName("tom");
		user1.setAge(21);
		user1.setSex('女');	
		list.add(user1);
		list.add(user2);
		return list;
	}

}
