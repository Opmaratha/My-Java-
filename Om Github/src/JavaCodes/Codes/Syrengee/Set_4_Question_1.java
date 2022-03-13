package JavaCodes.Codes.Syrengee;

public class Set_4_Question_1 {
	public static int findapperadNUmbers(int []a) {
		int n=a.length;
		int sum=((n+1)*(n+2)/2);
		for(int i=0;i<n;i++) {
			sum-=a[i];
			
		}
		return sum;
		
		}
	public static void main(String[] args) {
		int num[]= {1,3,6,8,9,10};
		System.out.println(findapperadNUmbers(num));
		
	}
		
	}
	


