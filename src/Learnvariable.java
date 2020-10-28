
public class Learnvariable {
int a=30;
	public static void main(String[] args) {
		 Learnvariable myObj= new Learnvariable();
			System.out.println(myObj.a);
			
			//a=70;
			int a = 30;
			myObj.a=50;
			
			System.out.println(a);
			System.out.println(myObj.a);
			printme();

	}
	private static void printme() {
		Learnvariable myObj= new Learnvariable();
		myObj.a =20;
		int a =40;
		System.out.println(myObj.a);
		
		System.out.println(a);
	}	
		
	}


