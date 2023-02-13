public class Main {
    ///This is a field - it's a type of variable that is visible
    //throughout the class
    private static int result;

    //This is a method
    private static void testOne() {
        //Local variables
        int num = 14;
        int divisor = 10;
        System.out.println(num + " % " + divisor + " = " + num % divisor);
        result = num % divisor;
    }

    public static void main(String[] args) {
        //Calls the Game class - static so doesn't need an instance
        Game.playGame();
        testOne();
        System.out.println(result);
    }
}
