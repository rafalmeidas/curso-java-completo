package classe;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public MyDate setDay(int day) {
        this.day = day;
        return this;
    }

    public int getMonth() {
        return month;
    }

    public MyDate setMonth(int month) {
        this.month = month;
        return this;
    }

    public int getYear() {
        return year;
    }

    public MyDate setYear(int year) {
        this.year = year;
        return this;
    }

    public void viewDate() {
        System.out.printf("%d/%d/%d \n", getDay(), getMonth(), getYear());
    }
}
