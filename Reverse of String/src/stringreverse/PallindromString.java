package stringreverse;

public class PallindromString {

	public static void main(String[] args)
	{
			java.util.Scanner ss=new java.util.Scanner(System.in);
			System.out.print("Enter String:");
			String s=ss.nextLine(),k="";
			char rev;
	    	for(int i=0;i<s.length();i++)
	    		{
	    		 rev=s.charAt(i);
	    		 k=rev+k;
	    		}
	    	if(s.equals(k))
	    	{
	    		System.out.print("Given String is palindrome");
	    	}else
	    		System.out.print("Given String is Not a palindrome");
	}
	    
}
			
			