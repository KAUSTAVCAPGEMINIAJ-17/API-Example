package com.capgemini.lambdaexpressions;

public class LambdaExpressionForUserDefinedFunctionalInterfaceaddsubmsg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition ad = ()->{
			System.out.println("Addition="+(55+65));
		};
		ad.add();
		//Lambda with return type
		Substraction sub = ()-> {
			System.out.println("Substraction="+(76-12));
		};
		sub.sub();
	//Lambda with return type and One parameter
	Message msg=(String m)->{
		return m+"Hello from Lambda";
	};
	String returnMsg=msg.printMessage("Hi..");
	System.out.println(returnMsg);
	}

}
