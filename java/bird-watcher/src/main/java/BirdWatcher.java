class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        int l = birdsPerDay.length;
        return birdsPerDay[l-1];
    }

    public void incrementTodaysCount() {
        int l = birdsPerDay.length;
        birdsPerDay[l-1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int bird: birdsPerDay) if(bird == 0) return true;
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0, l = Math.min(birdsPerDay.length, numberOfDays);
        for(int i = 0; i < l; i++) sum += birdsPerDay[i];
        return sum;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for(int bird: birdsPerDay) if(bird >= 5) busyDays++;
        return busyDays;
    }
}
