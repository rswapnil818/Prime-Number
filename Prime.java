package Prime_Number;

public class Prime {

	public static void main(String[] args) {
		int n=4;
		int count=0;
		for (int i = 2; i <n; i++) {
			if(n%i==0){
				
			
			count++;
			break;
			}
		} 
		if (count==0){
			System.out.println(n+" is Prime Number ");
		}else
		{
			System.out.println(n+" Number is non Prime");
		}
	}

}
