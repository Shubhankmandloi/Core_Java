package basic;

public class SwitchCaseExample {

	public static void main(String[] args) {
		
		int ch = 6;
		
		switch(ch) {
		case 1:
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("Apr");
			break;
		default:
			System.out.println("Please enter valid choice ..");
		}
		
		char ch1 = 'e';
		switch (ch1) {
		case 'a': 
			System.out.println("Working");
			break;
		case 'b': 
			System.out.println("Working");
			break;
		case 'c': 
			System.out.println("Working");
			break;
		case 'd': 
			System.out.println("Working");
			break;
			
		default:
			System.out.println("Enter valid choice ...");
		}

	}

}
