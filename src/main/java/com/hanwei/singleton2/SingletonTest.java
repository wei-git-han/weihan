package com.hanwei.singleton2;

public class SingletonTest {

	public static void main(String[] args) {
//		Singleton singleton = Singleton.getSingleton();
//		Singleton singleton2 = Singleton.getSingleton();
//		System.out.println(singleton == singleton2);
		for (int i = 0; i < 100; i++) {
			new Thread(new Runnable() {
				
				public void run() {
					Singleton singleton = Singleton.getSingleton();
					System.out.println(Thread.currentThread().getName()+","+singleton);
				}
			}).start();
		}

	}

}
