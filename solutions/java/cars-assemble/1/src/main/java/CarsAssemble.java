public class CarsAssemble {

    final int CARS_PER_HOUR = 221;
    
    public double productionRatePerHour(int speed) {
        double result = 0;
        switch (speed) {
            case 1,2,3,4:
                result = speed * this.CARS_PER_HOUR;
                break;
            case 5,6,7,8:
                result = (speed * this.CARS_PER_HOUR) * 0.9;
                break;
            case 9:
                result = (speed * this.CARS_PER_HOUR) * 0.8;
                break;
            case 10:
                result = (speed * this.CARS_PER_HOUR) * 0.77;
                break;
            default:
                result = 0;
                break;
        }

        return result;
    }

    public int workingItemsPerMinute(int speed) {
        int productionPerHour = (int) Math.round(this.productionRatePerHour(speed));
        return productionPerHour / 60;
    }
}
