public class Lasagna {
    
    public int expectedMinutesInOven() {
        return 40;
    }
    
    public int remainingMinutesInOven(int timeSpent) {
        return this.expectedMinutesInOven() - timeSpent;
    }
    
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }
    
    public int totalTimeInMinutes(int layers, int timeLasagna) {
        return this.preparationTimeInMinutes(layers) + timeLasagna;
    }
}
