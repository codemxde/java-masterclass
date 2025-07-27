public class SpeedConverter {
    // write code here

    public static long toMilesPerHour(double kilometersPerHour) {
        double milesPerHour = (double) (kilometersPerHour / 1.609344);
        return (long) milesPerHour;
    }

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));
    }
}