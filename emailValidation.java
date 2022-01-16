package assigment;
	
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	

	public class emailValidation {
		
			 
			

			   public static void main(String[] args) {
			       List<String> emails = new ArrayList<String>();
			       // valid email addresses
			       emails.add("harshitha@example.com");
			       emails.add("karshithabob@example.com");
			       emails.add("harshi@example.com");
			       emails.add("aman.@ex.com");
			       emails.add("alvidabob@example.com");
			       emails.add("alkaida@example.com");
			       System.out.println("enter user");
		    	   
			       Scanner sc = new Scanner(System.in);
			       String input = sc.nextLine(); 
			      
			       if(emails.contains(input))
			       {
			    	   System.out.println("valid");
			    	   
			       }
			       else
			       {
			    	   System.out.println("invalid");
			    	   
			    	   
			       }
			       
			    
			   }
	}


