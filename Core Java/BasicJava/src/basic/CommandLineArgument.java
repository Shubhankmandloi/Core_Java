package basic;

public class CommandLineArgument {

	public static void main(String[] args) {
		
		if(args.length>1) {
			System.out.println(args[0]+" : "+args[1]);
		}
		else
			System.out.println("There is no argument");
		
		

	}

}
// Right click on the Program -> Run as -> Run configuration -> Arguments -> Program Argument (Pass some value accroding to your use ) -> Click on Run