package com.gyc2799.TestKTV;

public class ThreadTest extends Thread{  ///继承Thread实现
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				ThreadTest.sleep(1000);
				System.out.println("线程Runing……");
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			
		}
		
	}
	public static void main(String[] args) {
		ThreadTest tt1 = new ThreadTest();
		ThreadTest tt2 = new ThreadTest();
		tt1.start();
		tt2.start();
	}
}
