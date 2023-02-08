package com.java.lambda;

interface Addable{
	int add( int a, int b);
}

class AddImpl implements Addable{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b);
	}

	
}
public class LambdaEx2 {

	public static void main(String[] args) {
//		Addable add=(a,b)->(a+b);
//		int res=add.add(10, 20);
//		System.out.println(res);
			
			Addable abc=(a,b)->{
			int c=a+b;
			return c;
			
		};

	}

}
