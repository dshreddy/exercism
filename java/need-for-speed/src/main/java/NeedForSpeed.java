class NeedForSpeed {

    private int distance = 0;
    private int battery = 100;

    public final int speed;
    public final int batteryDrain;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.battery < this.batteryDrain;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if(!batteryDrained()) {
            this.battery -= batteryDrain;
            this.distance += speed;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private final int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int max_drive_iterations = 100/car.batteryDrain;
        int max_distance = max_drive_iterations * car.speed;
        return max_distance >= this.distance;
    }
}
