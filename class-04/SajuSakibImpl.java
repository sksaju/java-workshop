public  class SajuSakibImpl implements InterfaceSaju, InterfaceSakib{

	public static void main(String[] args){
		SajuSakibImpl impl = new SajuSakibImpl();
		
		System.out.println("=================");
		impl.displaySajuSakib(impl);
		System.out.println("=================");
		impl.displaySaju(impl);
		System.out.println("=================");
		impl.displaySakib(impl);		
	}
	
	@Override
	public int sum(int x, int y){
		return x + y;	
	}
	
	@Override
	public int sum(int x, int y, int z){
		return x + y + z;	
	}
	
	@Override
	public int sum(int x, int y, int z, int p){
		return x + y + z + p;
	}
	
	private void displaySajuSakib(SajuSakibImpl all){
		System.out.println("all->sum(x, y)" + all.sum(10, 10));
		System.out.println("all->sum(x, y, z)" + all.sum(10, 10, 10));
		System.out.println("all->sum(x, y, z, p)" + all.sum(10, 10, 10, 10));
	}
	
	private void displaySaju(InterfaceSaju saju){
		System.out.println("saju->sum(x, y)" + saju.sum(10, 10));
		System.out.println("saju->sum(x, y, z)" + saju.sum(10, 10, 10));
		//saju.sum(10, 10, 10, 10); // Compilation Error due security
		
	}
	
	private void displaySakib(InterfaceSakib sakib){
		System.out.println("sakib->sum(x, y, z)" + sakib.sum(10, 10, 10));
		System.out.println("sakib->sum(x, y, z, p)" + sakib.sum(10, 10, 10, 10));
	}
	
}