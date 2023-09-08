package hexlet.code;

public class Random {
    public static int getRandom(int minValue, int maxValue) {
        return (int) (Math.random() * (maxValue - minValue + 1)) + minValue;
    }
}
