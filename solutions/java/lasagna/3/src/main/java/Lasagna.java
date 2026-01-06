public class Lasagna {

    final int PREPARATION_TIME_PER_LAYER = 2;
    final int EXPECTED_MINUTES_OVEN = 40;
    
    public int expectedMinutesInOven() {
        return this.EXPECTED_MINUTES_OVEN;
    }
    
    public int remainingMinutesInOven(int timeSpent) {
        return this.expectedMinutesInOven() - timeSpent;
    }
    
    public int preparationTimeInMinutes(int layers) {
        return layers * this.PREPARATION_TIME_PER_LAYER;
    }
    
    public int totalTimeInMinutes(int layers, int timeLasagna) {
        return this.preparationTimeInMinutes(layers) + timeLasagna;
    }
}
