package basic;

public class AddWithCmdArgument {

	public static void main(String[] args) {


		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println("sum of "+args[0]+" and "+args[1]+" is : "+(a+b));

	}

}
