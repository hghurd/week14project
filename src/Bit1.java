/**
 * Garrett Hurd
 * Week 6 Sandbox
 * Bit 1
 * This is just like a scratch notebook for CS1121, week 6
 **/
public class Bit1 {

    public  int cubeIt(int num1){
        int num2 = (int) (Math.pow(num1, 2));
        return num2;
    }

    public double cubeIt(double num1){
        double num2 = (double) (Math.pow(num1, 2));
        return num2;
    }

    public static void main(String[] args) {
        Bit1 tester = new Bit1();
        System.out.println(tester.cubeIt(15));
        System.out.println(tester.cubeIt(1.5));
    }

}
