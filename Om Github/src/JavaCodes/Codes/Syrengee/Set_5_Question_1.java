package JavaCodes.Codes.Syrengee;

public class Set_5_Question_1 {
	public void r(String a) {
		char c=a.charAt(a.length()-1);
		char m=a.charAt(0);
		StringBuilder z=new StringBuilder();
		for(int i=0;i<a.length();i++) {
			if(i==0) {
				z.insert(0, c);
				
			}else if(i==a.length()-1) {
			      z.append(m);
			}
			else {
				z.append(a.charAt(i));
			}
		}
		System.out.println(z);
		
		
		
	}
	public static void main(String[] args) {
	
		Set_5_Question_1 a=new Set_5_Question_1();
		a.r("hiiio");
		
		
	}

}
