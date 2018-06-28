import java.util.Calendar;

public class StopWatch {
    private String startTime;

    private long startTimeInMilis;
    private long endTimeInMilis;

    private int second;
    private int minute;
    private int hour;

    private Calendar calendar = Calendar.getInstance();

    public StopWatch() {
        this.startTime = getCurrentTime();
        System.out.println("Start time is: " + startTime);
        this.startTimeInMilis = calendar.getTimeInMillis();
    }

    public String getStartTime() {
        return startTime;
    }

    public void start() {
        this.endTimeInMilis = System.currentTimeMillis();
    }

    public void stop() {
        this.endTimeInMilis = System.currentTimeMillis();
    }

    public void getElapsedTime() {
        long elapsedTime = endTimeInMilis - startTimeInMilis;
        System.out.println("Elapsed time is: " + elapsedTime);
    }

    private String toString(int number) {
        return Integer.toString(number);
    }

    private String getCurrentTime() {
        this.hour = calendar.get(Calendar.HOUR);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);

        return toString(hour) + ":" + toString(minute) + ":" + toString(second);
    }
}
