public class DataTypeImplicitCast {

	public static void main(String[] args){
		
		boolean flag = true;
		byte  bytee = (byte)128;
		short srt = (short)32768;
		char a  = 'A';
		
		int rollNo = 10;
		float gpa = 3.5f;
		long distance  = 100000L;
		double radious = 1000;
	
		System.out.println("Boolean : " + flag);
		System.out.println("Byte :" +bytee);
		System.out.println("Short :" +srt);
		System.out.println("Character :" +a);
		
		System.out.println("Integer :" +rollNo);
		System.out.println("Float :" +gpa);
		System.out.println("Long :" +distance);
		System.out.println("Double :" +radious);
	}

}