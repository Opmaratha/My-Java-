package JavaCodes.Codes;

public class RequiredChoclates {
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
        RequiredChoclates ch = new RequiredChoclates();
        ch.makeChocolate(4,1,9);
    }
}
