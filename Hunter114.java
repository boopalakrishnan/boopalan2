import java.util.*;
import java.io.*;
public class Hunter114
{
   public static void main (String[] args) throws NumberFormatException, IOException
   {		
       int i =0;
       int num =0,sum,count=0;
       //Empty String
   
ArrayList<Integer> l=new ArrayList<Integer>();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the value of N:");
int a=Integer.parseInt(br.readLine());
       for (i = 1; i <=a; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     l.add(i);
	  }	
       }	
      // System.out.println("Prime numbers from 1 to "+a+" are :");
   // System.out.println(l);
    for(i=0;i<l.size();i++)
    {int n=l.get(i);sum=0;
    if(n>10&&n<100)
    {
    for(int j=i;j<l.size();j++)
    {
    	sum=sum+n;
    	if(sum==a)
    	{
    		//System.out.println(n+" * "+((j-i)+1)+" = "+a);
    		count+=((j-i)+1);
    	}
    }
    }
    }
    if(count==0||count!=0)
    {
    	 for(i=0;i<l.size();i++)
    	    {int n=l.get(i);sum=0;
    	    if(n>10&&n<100)
    	    {
    	    for(int j=i;j<l.size();j++)
    	    {
    	    	if(l.get(j)>10&&l.get(j)<100)
    	    	{
    	    	sum=n+l.get(j);
    	    	if(sum==a)
    	    	{//System.out.println(n+" "+l.get(j));
    	    		//System.out.println(n+" * "+((j-i)+1)+" = "+a);
    	    		count++;
    	    		break;
    	    	}}
    	    }
    	    }
    	    }
    }
    System.out.println("The answer is:"+count);
   }
}
