public class CarsAssemble {

    private static final int CARS_PER_SPEED = 221;
    private static final double SUCCESS_RATE_1_TO_4 = 1;
    private static final double SUCCESS_RATE_5_TO_8 = 0.9;
    private static final double SUCCESS_RATE_9 = 0.8;
    private static final double SUCCESS_RATE_10 = 0.77;

    public double productionRatePerHour(int speed) {
        double successRate = SUCCESS_RATE_10;
        if(speed <= 4) {
            successRate = SUCCESS_RATE_1_TO_4;
        } else if(speed <= 8) {
            successRate = SUCCESS_RATE_5_TO_8;
        } else if(speed == 9) {
            successRate = SUCCESS_RATE_9;
        }

        int carsProduced = speed * CARS_PER_SPEED;
        return carsProduced * successRate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed)/60;
    }
}
