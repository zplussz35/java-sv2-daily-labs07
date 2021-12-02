package day04;

public class Ride {
    private int day;
    private int serialNum;
    private int km;

    public Ride(int day, int serialNum, int km) {
        this.day = day;
        this.serialNum = serialNum;
        this.km = km;
    }

    public int getDay() {
        return day;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public int getKm() {
        return km;
    }
}
