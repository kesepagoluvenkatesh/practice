package stringreverse;

public class RevEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("Enter String:");
		String s=sc.nextLine();
		String[] ar = s.split(" ");
		for(int i=0;i<ar.length-1;i--)
		{
				System.out.println(ar[i]);
	}
	}

}
