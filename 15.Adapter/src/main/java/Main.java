public class Main {

    public static void main(String[] args) {
        NewDateInterface date = new CalendarToNewDateAdapter();

        date.setDay(5);
        date.setMonth(1); // February
        date.setYear(2018);

        printDate("Initial Date: " , date);

        int daysToAdd = 74;
        date.advanceDays(daysToAdd);

        printDate("After " + daysToAdd + " days: " , date);
    }

    private static void printDate(String label, NewDateInterface d) {
        System.out.printf("%s %02d/%02d/%d%n", label, d.getDay(), d.getMonth() + 1, d.getYear());
    }

}