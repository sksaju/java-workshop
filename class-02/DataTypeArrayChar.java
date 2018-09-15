public class DataTypeArrayChar {

	public static void main(String[] args){

		char a[] = new char[]{'A', 'B', 'C'};
		
		a[1] = 'Z';
		
		//Collection for loop
		for(char c:a){
			System.out.println("Char : " + c);
		}	
	}

}