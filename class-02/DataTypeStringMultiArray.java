public class DataTypeStringMultiArray {

	public static void main(String[] args){
	
		String[][] clazz = new String[2][3];
		
		clazz[0] = new String[]{"Shahed", "Sakib", "Saju"};
		clazz[1] = new String[]{"Shahedx", "Sakibx", "Sajux"};

		clazz[0][1] = "Rajib";
		clazz[1][1] = "Rajibx";
		
		for(int i = 0; i < clazz.length; i++){
			String[] section = clazz[i];
			for(int j = 0; j < section.length; j++){
				System.out.print(section[j] + ", ");
			}
			System.out.println();
		}
			
	}

}