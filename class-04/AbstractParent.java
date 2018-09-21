public abstract class AbstractParent {

	public int sum(int x, int y){
		System.out.println("parent->sum(x,y)");
		return x + y;
	}
	
	public abstract int sum(int x, int y, int z);

}