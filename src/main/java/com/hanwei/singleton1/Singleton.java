package com.hanwei.singleton1;

public class Singleton {
	
	/**
	 * 饿汉式优点：线程安全，当类初始化的时候，就被创建该对象
	 * 饿汉式缺点：如果想买过多使用饿汉式，则想买启动的时候非常慢，存放的方法区占用内存比较大。
	 * 如果用户不使用该对象的时候，也会被提前创建好。
	 */
	private static Singleton singleton = new Singleton();
	//单例模式不能被别的类实例化，所以弄成private
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
}
