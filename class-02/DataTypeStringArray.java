public class DataTypeStringArray {

	public static void main(String[] args){

		String students[] = new String[]{"Shahed", "Sakib", "Saju"};
		
		students[1] = "Rajib";
		
		for(int index = 0; index < students.length; index++){
			System.out.println("Student [" + index +"]: " + students[index]);
		}	
	}

}