package basic;

public class ForEachExample {

	public static void main(String[] args) {
		
		int[] ar = {10,20,30,40,50};
		char[] ch = new char[5];
		ch[0] = 'a';
		ch[1] = 'b';
		ch[2] = 'c';
		ch[3] = 'd';
		ch[4] = 'e';
		
		for(int i:ar)
			System.out.println(i);
		
		for(char c : ch)
			System.out.println(c);

	}

}
