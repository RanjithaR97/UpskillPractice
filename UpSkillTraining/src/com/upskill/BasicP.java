package com.upskill;

public class BasicP {
	
	String name;
	int odiRuns;
	int testRuns;
	int t20Runs;

	public int totalRuns() {
		int totalRuns = odiRuns + testRuns + t20Runs;
		return totalRuns;
	}

	public static void main(String[] args) {
		BasicP b=new BasicP();
		b.name="Ranji";
		b.odiRuns=10;
		b.t20Runs=20;
		b.t20Runs=30;
		System.out.println(b.totalRuns() );

	}

}
