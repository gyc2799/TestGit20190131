package com.gyc2799.TestKTV;

public class ThreadimplementsMain {
	public static void main(String[] args) {
		Threadimplements t1 = new Threadimplements("线程1");
		Thread tt1 = new Thread(t1);
		tt1.start();
	}
}
