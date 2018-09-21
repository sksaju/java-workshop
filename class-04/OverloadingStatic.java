public  class OverloadingStatic {

	public static void main(String[] args){
	
		int a = sum(10, 20);
		int b = sum(10, 20, 30);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	
	public static int sum(int x, int y){
		return x + y;
	}
	
	public static int sum(int x, int y, int z){
		return x + y + z;
	}

}