public class ControlFlowStatementIf {
	
	public static void main(String[] agrs){
		
		boolean flag		= true;
		if(flag){
			System.out.println("Hello World");
		}
		
		int marks			= 80;
		if(marks >= 80){
			System.out.println("Grade : A+");
		}else if(marks >= 70){
			System.out.println("Grade : A");		
		}else {
			System.out.println("Pass");
		}	
	}

}