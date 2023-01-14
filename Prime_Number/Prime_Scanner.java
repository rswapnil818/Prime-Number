package Prime_Number;

import java.util.Scanner;

public class Prime_Scanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Value"); 
		int n=sc.nextInt();
		
		
		int count=0;
		
		for (int i = 2; i < n; i++) {
			
			if(n%i==0){
				count++;
				break;
			}
			
		}
		if(count==0){
			System.out.println(n+" Is Prime Number ");
		}else
		{
			System.out.println(n+"is Non-Prime Number");
		}
	}

}
