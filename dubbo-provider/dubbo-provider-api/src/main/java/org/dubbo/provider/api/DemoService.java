/**
 * 
 */
package org.dubbo.provider.api;

import java.util.List;

import org.dubbo.provider.model.User;

/**
 * @author Peker
 * @time  2015年12月25日上午11:41:30
 */
public interface DemoService {
	String sayHello(String name);
	List<User> getUsers();
}
