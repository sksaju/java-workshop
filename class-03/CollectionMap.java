import java.util.Map;
import java.util.HashMap;

public class CollectionMap {

	public static void main(String[] args){
		
		/* Generic Type Or Parameteralizing*/
		Map<String, String> map = new HashMap<String, String>();
		map.put("ID", "01");
		map.put("Name", "Saju");
			
		for(String key : map.keySet()){
			System.out.println(map.get(key));
		}
		
	}
}