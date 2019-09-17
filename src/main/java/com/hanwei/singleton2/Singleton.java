package com.hanwei.singleton2;

public class Singleton {
	/**
	 * 懒汉式：当真正需要使用该对象的时候，才会被初始化。
	 */
	private static  Singleton singleton;
	
	private Singleton() {
		
	}
	
	/**
	 * 线程安全问题：当多线程情况下，可能会被实例化多次。
	 * @return
	 */
	public static  Singleton getSingleton() {
		//当singleton第一次等于null的时候才会被初始化。
		
		if (singleton == null) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			singleton = new Singleton();
		}
		return singleton;
	}
	
}
