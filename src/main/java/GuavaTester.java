import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;

public class GuavaTester {
    public static void main(String[] args) {
        double num = Math.PI;
        double butInt = 7;


        System.out.println(num);

        System.out.println(DoubleMath.isMathematicalInteger(num));
        System.out.println(DoubleMath.isMathematicalInteger(butInt));

        int largeNum = Integer.MAX_VALUE;
        //System.out.println(largeNum + 1);

        try{
            System.out.println(IntMath.checkedAdd(largeNum, 1));
        }catch(ArithmeticException e){
            System.out.println("That number is too big, genius.");
        }

    }


}
