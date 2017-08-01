import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class player66{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> l=new ArrayList<Integer>();
		int n=Integer.parseInt(br.readLine());
		int m=Integer.parseInt(br.readLine());
		int min=10,k=0;
		int[][] arr=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=Integer.parseInt(br.readLine());
			}
		}
		for(int i=0;i<n;i++)
		{int count=0;
			for(int j=0;j<m;j++)
			{
				if(arr[i][j]==0)
				{
					count++;
				}
			}
			l.add(count);
		}
		for(int i=0;i<l.size();i++)
		{ int a=l.get(i);
		if(a<min&&a!=0)
		{
			min=a;
			k=i+1;
		}
			
		}
		System.out.println(k+"-row");
	}

}
