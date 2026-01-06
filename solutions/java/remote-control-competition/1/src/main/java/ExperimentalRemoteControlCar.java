public class ExperimentalRemoteControlCar implements RemoteControlCar {

    int distanceTraveled = 0;

    public void drive() {
        this.distanceTraveled += 20;
    }

    public int getDistanceTravelled() {
        return this.distanceTraveled;
    }
}
