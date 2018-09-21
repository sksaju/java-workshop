public  class InterfaceSumImpl implements InterfaceSum {

	public static void main(String[] args){
	
		//InterfaceSumImpl 	ic = new InterfaceSumImpl();
		InterfaceSum 		ic = new InterfaceSumImpl();
	
		int a = ic.sum(10, 20);
		int b = ic.sum(10, 20, 30);
		int c = ic.sum(10, 20, 30, 40);
		//int d = ic.sum(10, 20, 30, 40, 50);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		//System.out.println("d = " + d);
	}
	
	@Override
	public int sum(int x, int y){
		System.out.println("sum(x,y)");
		return  x + y;
	}
	
	@Override
	public int sum(int x, int y, int z){
		System.out.println("sum(x,y,z)");
		return  x + y + z;
	}
	
	@Override
	public int sum(int x, int y, int z, int p){
		System.out.println("sum(x,y,z,p)");
		return  x + y + z + p;
	}
	
	public int sum(int x, int y, int z, int p, int q){
		System.out.println("sum(x,y,z,p, q)");
		return  x + y + z + p + q;
	}
	

}