
class BirdWatcher {
    private final int[] birdsPerDay;
    private final int[] LAST_WEEK = {0,2,5,3,7,8,4};

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.LAST_WEEK;
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1] = this.birdsPerDay[this.birdsPerDay.length - 1] + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int birds: this.birdsPerDay) {
            if (birds == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int visited = 0;
        for (int i = 0; i <= (numberOfDays - 1); i++) {
            if(this.birdsPerDay.length < (i + 1)) continue;
            visited += this.birdsPerDay[i];
        }
        return visited; 
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int birds: this.birdsPerDay) {
            if (birds >= 5) busyDays ++;
        }
        return busyDays;
    }
}
