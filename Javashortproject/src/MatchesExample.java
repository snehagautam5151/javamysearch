

public class MatchesExample {
 public static void main(String args[]) {
	 String str = new String("java String method");
	 
	 System.out.print("Regex: (.*) String(.*) Matches String? ");
	 System.out.println(str.matches("(.*)String(.*)"));
	 		
	 System.out.print("Regex: (.*) Strings(.*) Matches String? ");
	 System.out.println(str.matches("(.*)String(.*)"));
	 	
	 System.out.print("Regex: (.*) Strings(.*) Method Matches String? ");
	 System.out.println(str.matches("(.*)String(.*)"));
	 	
}
	
}

