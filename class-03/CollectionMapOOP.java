import java.util.Map;
import java.util.HashMap;

public class CollectionMapOOP {

	public static void main(String[] args){
		// if display method is none-static 
		/*CollectionMapOOP oop = new CollectionMapOOP();
		oop.displayMap();*/
		
		// when displayMap is an static mathod
		displayMap();
		
		CollectionMapOOP.displayMap();
	}
	
	public static void displayMap(){
		/* Generic Type Or Parameteralizing*/
		Map<String, String> map = new HashMap<String, String>();
		map.put("ID", "01");
		map.put("Name", "Saju");
					
		for(String key : map.keySet()){
			System.out.println(map.get(key));
		}
	}
}