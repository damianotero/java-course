package algorithms;

public class FactorialRecursive {

    public int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public void oddsToNumber(int number){
        if (number<=0) {
            return;
        }
        oddsToNumber(number-2);
        System.out.println(number);
    }


}
