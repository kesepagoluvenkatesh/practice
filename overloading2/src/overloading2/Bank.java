package overloading2;

public class Bank {
	String Name;
	String Branch;
	long Balance;
	boolean Active;
	Bank(String Name,String Branch,long Balance,boolean Active)
	{
		this.Name=Name;
		this.Branch=Branch;
		this.Balance=Balance;
		this.Active=Active;
	}
	String withdraw(long balance)
	{
		System.out.println("Bank balance:"+balance);
		System.out.print("Branch:");
		return Branch;
	}
	boolean withdraw(String Name)
	{
		System.out.println(this.withdraw(Balance));
		System.out.println("Acc holder Name:"+Name);
		System.out.print("Acc Activation:");
		return Active;

	}
	public static void main(String[] args) {
		Bank customer=new Bank("venky","Madhapur",546647,true);
		System.out.println(customer.withdraw("venky"));
	}

}
