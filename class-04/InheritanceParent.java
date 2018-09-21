public  class InheritanceParent {

	public static void main(String[] args){
		InheritanceParent ip = new InheritanceParent();
		
		int pa = ip.sum(10, 20);
		int pb = ip.sum(10, 20, 30);
		
		System.out.println("pa = " + pa);
		System.out.println("pb = " + pb);
	}
	
	public int sum(int x, int y){
		return x + y;
	}
	
	public int sum(int x, int y, int z){
		System.out.println("parent.sum(x,y,z)");
		return x + y + z;
	}

}