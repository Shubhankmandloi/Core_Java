package basic;

public class StringExample {

	public static void main(String[] args) {
		
		String name = "Shubhank";
		String name1 = new String("Yadav");
		
		System.out.println(name+" "+name1);
		
		System.out.println(name.length());
		System.out.println(name.charAt(7));
		System.out.println(name.indexOf("ank"));
		System.out.println(name.indexOf('h'));
		System.out.println(name.lastIndexOf('h'));
		System.out.println(name.replace('h', 'i'));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.startsWith("Shu"));
		System.out.println(name.endsWith("ank"));
		System.out.println(name.substring(3));

	}

}
