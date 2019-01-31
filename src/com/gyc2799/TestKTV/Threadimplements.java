package com.gyc2799.TestKTV;

public class Threadimplements implements Runnable {
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("Thread Running……");
		}catch(Exception ex){
				ex.printStackTrace();
		}finally {
			//System.out.println("程序完成");
		}
	}
	public static void main(String[] args) {
		Thread t1 = new Thread();
		t1.start();
	}
}
