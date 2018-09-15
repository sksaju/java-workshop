public class DataTypeArithmaticsInt {

	/**
	 * UpCasting Explicit
	 * DownCasting Explicit
	 *
	 */	 
	public static void main(String[] args){
		float x = 21474836.47f;
		int y = 100;
		//float y = 3.0f;
		
		System.out.println("z = (x + y) : " + (x + y));
		System.out.println("z = (y + x) : " + (y + x));
		
		System.out.println("z = (x / y) : " + (x / y));
		System.out.println("z = (y / x) : " + (y / x));
		
		System.out.println("z = (x * y) : " + (x * y));
		System.out.println("z = (y * x) : " + (y * x));
	}

}