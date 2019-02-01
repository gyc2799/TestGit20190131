package com.gyc2799.TestKTV;

public class Threadimplements implements Runnable {
	private String name;
	Threadimplements(String Tname){
		this.name=Tname;
	}
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println(this.name+"Thread Running……");
		}catch(Exception ex){
				ex.printStackTrace();
		}finally {
			////
			//System.out.println("程序完成");
		}
	}
	
}
