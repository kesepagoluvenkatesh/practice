#he
package stringreverse;
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("Enter String:");
		String s=sc.nextLine();
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}

	}

}
