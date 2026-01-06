class NeedForSpeed {

    int speed;
    int batteryDrain;
    int distanceDriven = 0;
    int battery = 100;
    boolean isUsed = false;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.battery < this.batteryDrain;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if (this.batteryDrained()) return;
        this.distanceDriven += this.speed;
        this.battery -= this.batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {

    int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {

        if (car.batteryDrained()) return false;

        int speed = car.speed;
        int battery = car.battery;
        int drain = car.batteryDrain;

        int handleCarDistance = (battery / drain) * speed;

        return this.distance <= handleCarDistance;
    }
}
