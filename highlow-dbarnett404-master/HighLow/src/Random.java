public class Random {
    /**
     * Simple static class the returns a number from 1 to a range
     * @param range max range for the number
     * @return the random number
     */
    public static int getRandInt(int range){
        return (int)(Math.random() * range) + 1;
    }
}
