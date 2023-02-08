package com.java.lambda;


class ThreadDemo implements Runnable{

	@Override
	public void run() {
		System.out.println("THread is called frm methos()...");		
	}
	
}
public class RunnableInterface {

	public static void main(String[] args) {
		Thread thread=new Thread(new ThreadDemo());
		thread.start();
		
		Thread threadLambda=new Thread(()-> System.out.println("Thraed is called fromLambad()"));
		threadLambda.start();
		

	}

}
