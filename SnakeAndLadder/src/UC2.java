import java.util.Scanner;

public class UC2 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int pos=0;
		System.out.println("lets have a game play");
		String s="START";
		System.out.println("please roll the die");
		String st=sc.next();
		if(s.toLowerCase().toUpperCase().equals(st.toLowerCase().toUpperCase()))
		{
		int roll=(int) (Math.floor(Math.random()*(6-1+1)+1));
		System.out.println("result  "+roll);
		}

	}

}
