import java.util.TreeMap;

public class MyCalendar {
    TreeMap<Integer, Integer> calendar;

    public MyCalendar() {
        calendar = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        if (calendar.floorEntry(start) != null && start < calendar.floorEntry(start).getValue()) {
            return false;
        }
        if (calendar.ceilingEntry(start) != null && end > calendar.ceilingEntry(start).getKey()) {
            return false;
        }

        calendar.put(start, end);
        return true;
    }

    public static void main(String[] args) {
        MyCalendar myCalendar = new MyCalendar();
        System.out.println(myCalendar.book(10, 20));
        System.out.println(myCalendar.book(15, 25));
        System.out.println(myCalendar.book(20, 30));
    }
}
