class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    int distanceTraveled = 0;
    int numberOfVictories = 0;
    public void drive() {

        this.distanceTraveled += 10;
    }

    public int getDistanceTravelled() {
        return this.distanceTraveled;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(other.numberOfVictories, this.numberOfVictories);
    }
}
