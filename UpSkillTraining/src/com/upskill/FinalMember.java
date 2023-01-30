package com.upskill;

public class FinalMember {
	final int FINAL_VALUE = 5;

	final void finalMethod() {
		// final value cannot be modified
		// Below line, uncommented, causes compilation Error
		// FINAL_VALUE = 6;//COMPILER ERROR
	}

	void testMethod(final int finalArgument) {
		// final argument cannot be modified
		// Below line, uncommented, causes compilation Error
		// finalArgument = 5;//COMPILER ERROR
	}
}

class SubClass extends FinalMember {
	// final method cannot be over-riddent
	// Below method, uncommented, causes compilation Error
	/*
	 * final void finalMethod(){
	 * 
	 * }
	 */
}
