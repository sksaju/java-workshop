public class DataTypeChar {

	/**
	 * UpCasting Explicit
	 * DownCasting Explicit
	 *
	 */	 
	public static void main(String[] args){
		char a = 'A';
		int b = 66;
		char c = 'B';
		char z = (char)(a + c);
		
		System.out.println("A int: " + (int)a);
		System.out.println("66 char : " + (char)b);
		System.out.println("z char : " + z);
		System.out.println("z char : " + (char)((int)a + (int)c));
		System.out.println("z char : " + a + c);		
	}

}