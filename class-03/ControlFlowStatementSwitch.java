public class ControlFlowStatementSwitch {
	
	public static void main(String[] agrs){
	
		/* byte, short, char, integer */
		char grade = 'D';
		
		switch(grade){
			case 'A': System.out.println("Marks  >= 60"); break;
			case 'B': System.out.println("Marks  >= 50"); break;
			case 'C': System.out.println("Marks  >= 40"); break;
			case 'D': System.out.println("Marks  >= 30"); break;
			case 'F': System.out.println("Marks  < 30"); break;
			default : System.out.println("Invalid input");		
		}
		
		/* Compile time error as of datatype long
		long distance = 10l;		
		switch(distance){
			case 10l : System.out.println("long 10L"); break;
			case 11l: System.out.println("long 11L"); break;
			default : System.out.println("Invalid input long");		
		}*/
		
		int distance = 10;		
		switch(distance){
			case 10 : System.out.println("int 10"); break;
			case 11: System.out.println("int 11"); break;
			default : System.out.println("Invalid input long");		
		}
		
		int temparature = 37;		
		switch(temparature){
			case 40 :
			case 39 :
			case 38 :
			case 37 :
			case 36 : System.out.println("Too hot"); break;
			
			case 35 :
			case 34 :
			case 33 :
			case 32 :
			case 31 : System.out.println("hot"); break;
			
			case 30 :
			case 29 :
			case 28 :
			case 27 :
			case 26 : System.out.println("comfort"); break;
			
			case 25 :
			case 24 :
			case 23 :
			case 22 :
			case 21 : System.out.println("room temp"); break;
			
			default :  System.out.println("cool"); break;
			
		}
		
		
	}

}