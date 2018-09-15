public class DataTypeArray {

	public static void main(String[] args){
		char[] a = new char[3];
		//char[] a = new char[]; // ERROR
		//char[] a = {'A', 'B', 'C'};
		//char a[] = {'A', 'B', 'C'};
		//char a[] = new char[]{'A', 'B', 'C'};
		//char a[] = new char[3]{'A', 'B', 'C'}; //ERROR
		
		a[0] = 'A';
		a[1] = 'B';
		a[2] = 'C';
		
		for(char c:a){
			System.out.println("Char : " + c);
		}	
	}

}