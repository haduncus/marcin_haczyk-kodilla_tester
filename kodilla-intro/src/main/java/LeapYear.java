public class LeapYear {
    int yearNo;
    boolean leapCheck;

    public LeapYear(int yearNum) {
        this.yearNo = yearNum;

        // Checking if the year is leap
        if (yearNo % 4 != 0) {
            this.leapCheck = false;
        } else if (yearNo % 100 != 0) {
            this.leapCheck = true;
        } else this.leapCheck = yearNo % 400 == 0;
    }
}