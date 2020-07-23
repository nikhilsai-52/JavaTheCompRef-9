import java.util.*;
public class PalindromeRearrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int temp,count;
		int[] arr = new int[20];
		int digitcount=0;
		int count2=0;
		while(n>0)
		{
		   temp=n%10;
		   arr[temp]++;
		   n=n/10;
		   digitcount++;
		   
		}
		for(int i=0;i<10;i++)
		{    
		 
		   if(arr[i]%2 == 0 && arr[i]!=0 )
		   {
		       count2 = count2 + arr[i] ;
		       
		       
		   }
		   
		}
		int result = digitcount - count2;
		if (result == 1 || result == 0)
		{
		   System.out.println("It can be rearranged to a palindrome");
		   
		}
		else
		{
		   System.out.println("It cannot be rearranged to a palindrome");
		   
		}

	}

}
