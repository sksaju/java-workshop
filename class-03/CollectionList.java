import java.util.List;
import java.util.ArrayList;

public class CollectionList {

	public static void main(String[] args){
		
		/* Generic Type Or Parameteralizing*/
		List<String> list = new ArrayList<String>();
		list.add("Sakib");
		list.add("Saju");
		list.add("Shahed");
	
		for(String name:list){
			System.out.println(name);
		}
		
		System.out.println("====================================");
		
		List<String> listA = new ArrayList<String>();
		listA.add("Sakib");
		listA.add("Saju");
		listA.add("Shahed");
		
		List<String> listB = new ArrayList<String>();
		listB.add("Sakibx");
		listB.add("Sajux");
		listB.add("Shahedx");
		
		List<String> listC = new ArrayList<String>();
		listC.addAll(listA);
		listC.addAll(listB);
		
		for(String name:listC){
			System.out.println(name);
		}
		
		
		
		
		
		
	
	}
}