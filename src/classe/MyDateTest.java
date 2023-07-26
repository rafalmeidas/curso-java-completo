package classe;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate();

        date1.setDay(1)
                .setMonth(5)
                .setYear(2023);



        var date2 = new MyDate();

        date2.setDay(20)
                .setMonth(9)
                .setYear(2023);

        date1.viewDate();
        date2.viewDate();
    }
}
