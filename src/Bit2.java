/**
 * Garrett Hurd
 * Cube computing!!!!
 */
public class Bit2 {

    /**
        Computes the volume of a cube
        @param sideLength the side length of the cube
        @return the volume
     */
    public double cubeVolume(double sideLength){
        double volume = (double) (Math.pow(sideLength,3)); //Cubes the input
        return volume;
    }

    public static void main(String[] args) {
        Bit2 tester = new Bit2();
        double result1 = tester.cubeVolume(2);
        double result2 = tester.cubeVolume(10);
        System.out.println("A cube with side length 2 has volume " + result1);
        System.out.println("A cube with side length 10 has volume " + result2);
    }

}
