
import java.util.Scanner;

public class UC7 
{

	public static void main(String[] args) 
	{
		int temp=0;
		Scanner sc=new Scanner(System.in);
		int pos1=0;
		int pos2=0;
		int posfinal =100;
		int inipos=0;
		System.out.println("lets have a game play");
		String s="START";
		System.out.println("please roll the die");
		int roll1=0;
		int roll2=0;
		
		
	
			       int count=0;
			       int no=0;
			       int ladder=1;
			       int snake=2;
			       
			       while(pos1<100 && pos2<100) {
			    	   int play=(int)(Math.floor(Math.random()*10)%3);
				       System.out.println("chance : "+play);
			       if(play==no)
			         {
			    	   System.out.println("pass the chance");
			         }
			       else if(play==ladder)
			       {   
			    	    roll1 = (int) (Math.floor(Math.random()*(6-1+1)+1)); 
			    	    roll2 = (int) (Math.floor(Math.random()*(6-1+1)+1));
		    	        System.out.println("your dice shows : "+roll1);
		    	        System.out.println("your dice shows : "+roll2);
			    	   
			    	        
			    	    	System.out.println("yeppp!!! you got ladder");
			    	    	if(pos1+roll1<=100)
			    	    	{
			    	    	pos1=pos1+roll1;
			    	    	System.out.println("your dice postion is " +pos1);
			    	    	
			    	    	}
			    	    	
			    	    	else {
			    	    		System.out.println("your dice postion is " +pos1);
			    	    		break;
			    	    	}
			    	    	count=count+1;
			    	    	
			    	    	if(pos2+roll2<=100)
			    	    	{
			    	    	pos2=pos2+roll2;
			    	    	System.out.println("your dice postion is " +pos2);
			    	    	
			    	    	}
			    	    	
			    	    	else {
			    	    		System.out.println("your dice postion is " +pos2);
			    	    		break;
			    	    	}
			    	    	
			       }
			    	    else
			    	         {
			    	    	  System.out.println("oops!!! you faced a snake");
			    	    	  pos1=pos1-roll1;
			    	    	  pos2=pos2-roll2;
			    	    	      if(pos1<0 || pos2<0)
			    	    	      {
			    	    	    	  pos1=0;
			    	    	    	  pos2=0;
			    	    	    	System.out.println("your dice postion is " +pos1);
			    	    	    	  System.out.println("your dice postion is " +pos2);
			    	    	      }
			    	    	      else
			    	    	           {
			    	    	    	    System.out.println("your dice postion is " +pos1);
			    	    	    	    System.out.println("your dice postion is " +pos2);
			    	    	           }
			    	    	      count=count+1;    
			    	         }
				  }
		        if(pos1>pos2)
		        {
		        	System.out.println("player 1 is winner");
		        	
		        }
		        
		        else {
		        	System.out.println("player 2 is winner");
		        }
				System.out.println("you hav rolled the dice for :"+count+ " times");	
	}

}