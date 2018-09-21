import com.chorke.sakib.A;
import com.chorke.saju.B;
import com.chorke.shahed.C;

public  class MainOfABC{

	public static void main(String[] args){
		
		A a = new A();
		B b = new B();
		C c = new C();
		
		System.out.println("a->sum()" + a.sum(10, 10, 10));
		System.out.println("a->sum()" + b.sum(10, 10, 10));
		System.out.println("c->sum()" + c.sum(10, 10, 10));
	}
	
}