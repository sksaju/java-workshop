public class CliArgs {

	public static void main(String args[]){	
		if(args.length > 0){
			String name = args[0];
			String hello = "Hello" + " " + name;
			System.out.println(hello);
		}
	}
}