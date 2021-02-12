import java.util.Arrays;
import java.util.Scanner;

public class UC6 
{

	public static void main(String[] args) 
	{
		
		int temp=0;
		Scanner sc=new Scanner(System.in);
		int pos=0;
		int posfinal =100;
		int inipos=0;
		System.out.println("lets have a game play");
		
		String s="START";
		System.out.println("please roll the die");
		
		int roll=0;
		
		
	
			       int count=0;
			       int no=0;
			       int ladder=1;
			       int snake=2;
			       
			       while(pos<100) {
			    	   int play=(int)(Math.floor(Math.random()*10)%3);
				       System.out.println("chance : "+play);
			       if(play==no)
			         {
			    	   System.out.println("pass the chance");
			         }
			       else if(play==ladder)
			       {   
			    	    roll = (int) (Math.floor(Math.random()*(6-1+1)+1)); 
		    	        System.out.println("your dice shows : "+roll);
			    	   
			    	        
			    	    	System.out.println("yeppp!!! you got ladder");
			    	    	if(pos+roll<=100)
			    	    	{
			    	    	pos=pos+roll;
			    	    	temp=pos;
			    	    	System.out.println("your dice postion is " +pos);
			    	    	
			    	    	}
			    	    	
			    	    	else {
			    	    		System.out.println("your dice postion is " +pos);
			    	    		break;
			    	    	}
			    	    	count=count+1;
			    	    	
			       }
			    	    else
			    	         {
			    	    	  System.out.println("oops!!! you faced a snake");
			    	    	  pos=pos-roll;
			    	    	  temp=pos;
			    	    	      if(pos<0)
			    	    	      {
			    	    	    	  pos=0;
			    	    	    	  temp=pos;
			    	    	    	  System.out.println("your dice postion is " +pos);
			    	    	      }
			    	    	      else
			    	    	           {
			    	    	    	    System.out.println("your dice postion is " +pos);
			    	    	           }
			    	    	      
			    	    	      count=count+1;
			    	    	      
			    	         }
				  }
				System.out.println("you hav rolled the dice for :"+count+ " times");
	}

}
