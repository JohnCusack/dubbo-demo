/**
 * 
 */
package org.dubbo.provider.model;

import java.io.Serializable;

/**
 * @author Peker
 * @time  2015年12月25日下午1:55:59
 */
public class User implements Serializable{
	private String name;
	private int age;
	private char sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
}
