import java.util.Arrays;
import java.util.Scanner;

public class UC3
{

	public static void main(String[] args) 
	{
	
		
		int temp=0;
		Scanner sc=new Scanner(System.in);
		int pos=0;
		int posfinal =100;
		int inipos=0;
		int no=0;
	       int ladder=1;
	       int snake=2;
		System.out.println("lets have a game play");
		String s="START";
		System.out.println("please roll the die");
		 String st=sc.next();
	   	 int roll=0;
	   	 
	   	if(s.toLowerCase().toUpperCase().contains(st.toLowerCase().toUpperCase()))
		{  
	       
		 int play=(int)(Math.floor(Math.random()*10)%3);
	       System.out.println("chance : "+play);
     if(play==no)
       {
  	   System.out.println("pass the chance");
       }
     else 
     {   
  	    roll = (int) (Math.floor(Math.random()*(6-1+1)+1)); 
	        System.out.println("your dice shows : "+roll);
  	    if(play==ladder)
  	       {
  	    	System.out.println("yeppp!!! you got ladder");
  	    	pos=pos+roll;
  	    	temp=pos;
  	    	System.out.println("your dice postion is " +pos);
  	       }
  	    else
  	         {
  	    	  System.out.println("oops!!! you faced a snake");
  	    	  pos=pos-roll;
  	    	  temp=pos;
  	    	  System.out.println("your dice postion is " +pos);    	    
  	         }
     	}
     }
	}
}	
	