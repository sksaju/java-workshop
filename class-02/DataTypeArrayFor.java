public class DataTypeArrayFor {

	public static void main(String[] args){

		char a[] = new char[]{'A', 'B', 'C'};
		
		a[1] = 'Z';
		
		//Collection for loop
		for(int index = 0; index < a.length; index++){
			System.out.println("Char : " + a[index]);
		}	
	}

}