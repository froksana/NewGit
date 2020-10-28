import java.util.Scanner;

public class ifandelse {

	
	public static void main(String[] args) {
		
System.out.println("Enter comma seperated number");
Scanner Userinput=new Scanner(System.in);
String data=Userinput.next();
String[]userpart=data.split(",");
int arrayLen=userpart.length;
 if(arrayLen==1) {System.out.println("less money");}
else if(arrayLen==2) {System.out.println(userpart[0]+ "thousand");}		
else if(arrayLen==3) {System.out.println(userpart[0]+ "Million");}
else {System.out.println("not million");}



/*System.out.println("Enter a comma seperated number");
		Scanner Userinput= new Scanner(System.in);
		String data=Userinput.next();
		String[]Usersplit=data.split(",");
		int arrayLen=Usersplit.length;
		
		if(arrayLen==1) { System.out.println("less money"); }
		  
		 else if(arrayLen==2) { System.out.println(Usersplit[0]+ " thousands"); }
		  
		  else if(arrayLen==3) { System.out.println(Usersplit[0]+ " million"); }
		 
		  else { System.out.println(" not million"); }*/
		 
	}

}
