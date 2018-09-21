public class AbstractChild extends AbstractParent {

	public static void main(String[] args){
	
		AbstractChild ac = new AbstractChild();
		//AbstractParent ap =  new AbstractChild()
	
		int a = ac.sum(10, 20);
		int b = ac.sum(40, 50, 60);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	
	@Override
	public int sum(int x, int y){
		System.out.println("child->sum(x,y)");
		return super.sum(x, y);
	}
	
	@Override
	public int sum(int x, int y, int z){
		System.out.println("sum(x,y,z)");
		return x + y + z;
	}

}