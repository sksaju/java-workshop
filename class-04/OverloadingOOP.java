public  class OverloadingOOP {

	public static void main(String[] args){
		
		OverloadingOOP oop = new OverloadingOOP();
	
		int a = oop.sum(10, 20);
		int b = oop.sum(10, 20, 30);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	
	public int sum(int x, int y){
		return x + y;
	}
	
	public int sum(int x, int y, int z){
		return x + y + z;
	}

}