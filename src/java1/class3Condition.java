package java1;

import java.util.Scanner;

public class class3Condition {

	public static void main(String[] args) {
		
		
		System.out.println("Enter comma separated number");
		Scanner Input=new Scanner(System.in);
		String userInput=Input.nextLine();
		System.out.println("User data:" + userInput);
		
	
		String []userEntry=userInput.split(",");
		int arrayLen=userEntry.length;
		switch (arrayLen) {
		case 1:
			System.out.println("Less money");
			break;
			case 2:
				System.out.println("Thousand");
break;
			case 3:
				System.out.println(userEntry[0]+" million");
		break;
			case 4:
				System.out.println("Billion");
				break;
				default:
					
					System.out.println("Too much money");
				break;
		}
	}
}
		
		
		
		
		
		/*System.out.println("enter  comma separated number");
		Scanner Input = new Scanner(System.in);
		String usrNum = Input.next();
		
		System.out.println("User Data :"+ usrNum);
		
		
		String[] usrN= usrNum.split(",");
		
		int arrayLen = usrN.length;
		
		switch(arrayLen) {
		case 1:
			System.out.println("less money");
			break;
		case 2:
			System.out.println("thousand");
			break;
		case 3:
			System.out.println("million");
			break;
		default:
			System.out.println("too much money");
		break;
		*/


	

