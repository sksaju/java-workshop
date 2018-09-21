public  class InheritanceChild extends InheritanceParent {

	public static void main(String[] args){
	
		InheritanceChild ic = new InheritanceChild();
	
		int ca = ic.sum(10, 20);
		int cb = ic.sum(40, 50, 60);
		
		System.out.println("ca = " + ca);
		System.out.println("cb = " + cb);
	}
	
	public int sum(int x, int y, int z){
		System.out.println("child.sum2(x,y,z)");
		return super.sum(x, y , z);
	}

}