public class JedliksToyCar {

    private int battery = 100;
    private int distance = 0;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        if(battery != 0) return "Battery at " + battery + "%";
        else return "Battery empty";
    }

    public void drive() {
        if(battery > 0) {
            distance += 20;
            battery--;
        }
    }
}
