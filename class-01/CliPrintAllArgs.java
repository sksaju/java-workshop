public class CliPrintAllArgs {

	public static void main(String args[]){	
		if(args.length > 0){
		
			for(int index = 0; index < args.length; index++){
				String name 	= args[index];
				String hello 	= "Hello" + " " + name;
				System.out.println(hello);
			}
			
			/*for(String name: args){
				String hello = "Hello" + " " + name;
				System.out.println(hello);
			}*/			
		}
	}
}