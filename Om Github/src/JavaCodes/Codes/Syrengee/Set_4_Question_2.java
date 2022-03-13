package JavaCodes.Codes.Syrengee;

public class Set_4_Question_2 {
	 public int findsmallest(int a[],int n) {
		 int res=1;
		 for(int i=0;i<n;i++) {
			 if(a[i]>res) {
				 return res;
				 
			 }
			 else {
				 res=res+a[i];
			 }
		 }
		 return res;
		
	}
public static void main(String[] args) {
	Set_4_Question_2 a=new Set_4_Question_2();
	int arr[]= {1,3,4,5};
	int n1=arr.length;
	System.out.println(a.findsmallest(arr, n1));
}
}
