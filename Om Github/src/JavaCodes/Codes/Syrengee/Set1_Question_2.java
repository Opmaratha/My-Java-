package JavaCodes.Codes.Syrengee;

public class Set1_Question_2 {
	public int makeChocolate(int small, int big, int goal) {

		int rem = goal % 5;



		if (small + (big*5) < goal)

			return -1;

		else if (rem <= small && goal - big*5 > 4)

			return rem + 5;

		else if (rem <= small)

			return rem;

		else

			return -1;

	}
	public static void main(String[] args) {
		JavaCodes.Codes.Syrengee.Set1_Question_2 a=new JavaCodes.Codes.Syrengee.Set1_Question_2();
		System.out.println(a.makeChocolate(5, 2, 9));

	}




}


