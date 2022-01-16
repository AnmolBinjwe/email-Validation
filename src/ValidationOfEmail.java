	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;



public class ValidationOfEmail {
		
		
			   public static boolean ValidEmail(String email) {
				   String regex = "^(.+)@(.+)$";
				 //initialize the Pattern object
			       Pattern pattern = Pattern.compile(regex);
			       Matcher matcher = pattern.matcher(email);
			       return matcher.matches();

			       
			   }

			   public static void main(String[] args) {
			       List<String> emails = new ArrayList<String>();
			       // valid email addresses
			       emails.add("anmol@etc.com");
			       emails.add("abhi@ex.com");
			       emails.add("sam@example.me.org");
			       //invalid email addresses
			       emails.add("manish.1.com");
			       emails.add("see..bob@example.com");
			       emails.add("alkaida@.example.com");

			       for (String value : emails) {
			           System.out.println("The Email address " + value + " is " + (ValidEmail(value) ? "valid" : "invalid"));
			       }
			       
			       System.out.println("Enter any email address to check");
			       Scanner sc = new Scanner(System.in);
			       String input = sc.nextLine();
			       System.out.println("The Email address " + input + " is " + (ValidEmail(input) ? "valid" : "invalid"));
			       
			   }
			   
	}


