public  class InheritanceGrandChild extends InheritanceChild {

	public static void main(String[] args){
	
		InheritanceGrandChild igc = new InheritanceGrandChild();
	
		int a = igc.sum(10, 20);
		int b = igc.sum(40, 50, 60);
		int c = igc.sum(10, 20, 30, 40);
		
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
	
	public int sum(int x, int y, int z, int p){
		System.out.println("grandChild.sum(x,y,z,p)");
		return super.sum(x, y , z) + p;
	}

}