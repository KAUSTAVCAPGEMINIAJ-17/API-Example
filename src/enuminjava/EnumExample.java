package enuminjava;

import java.util.Scanner;

public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student marks");
		float marks=sc.nextFloat();
		if(marks>75) {
			System.out.println(Results.DISTINCTION);
		}else if(marks<75 && marks>60) {
			System.out.println(Results.FIRSTCLASS);
		}else if(marks<60 && marks>35) {
			System.out.println(Results.PASS);
		}else {
			System.out.println(Results.FAIL);
		}
		
		System.out.println("Enter the choice");
		String ch = sc.next();
		Results choice = Results.DISTINCTION;
		switch(choice) {
		case DISTINCTION :
			
		case FIRSTCLASS :
			
		case PASS :
			
		case FAIL :
		}
	}

}