import java.util.List;
import java.util.ArrayList;

public class CollectionListRaw {

	public static void main(String[] args){
		
		/* Generic Type Or Parameteralizing*/
		List list = new ArrayList();
		list.add("Sakib");
		list.add("Saju");
		list.add("Shahed");
		
		List a = new ArrayList();
		a.add("X");
		a.add("Y");
		
		list.add(a);
	
		for(Object name:list){
			if(name instanceof String){
				System.out.println((String)name);
			}
			
			if(name instanceof List){
				System.out.println("List object found");
				for(Object x: (List)name){
					System.out.println((String)x);
				}
			}
		}

		/*List<String> a = new ArrayList<String>();
		a.add("X");
		a.add("Y");
		
		list.add(a);
	
		for(Object name:list){
			if(name instanceof String){
				System.out.println((String)name);
			}
			
			if(name instanceof List){
				System.out.println("List object found");
				for(String x: (List<String>)name){
					System.out.println(x);
				}
			}
		}*/		
	}
}