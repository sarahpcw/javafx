package e_stringArgs;
//exec strngargs peter

public class strngargs {

	public static void main(String[] args) {  // {"Peter","paul","Nigel"}
		String name = " ";
		if ( args.length > 0){
			for (int i = 0; i<args.length; i++){
				System.out.println(args[i]  );
			}
			
			System.out.println("args[0] " + args[0]);
			name = args[0];
			
		} else {
			System.out.println("No args");
		}
		
		
	}

}
