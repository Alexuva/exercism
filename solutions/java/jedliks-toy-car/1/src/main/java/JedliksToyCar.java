public class JedliksToyCar {

    private int battery = 100;
    private int driven = 0;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + driven + " meters";
    }

    public String batteryDisplay() {
        return battery == 0 ? "Battery empty" : "Battery at " + battery + "%";
    }

    public void drive() {
        if (battery == 0) return;
        driven += 20;
        battery -= 1;
    }
}
