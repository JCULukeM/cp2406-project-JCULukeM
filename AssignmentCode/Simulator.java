public class Simulator {
    int day, hour, minute;
    public Simulator(int day, int hour, int minute)
    {
        this.day = 0;
        this.hour = 0;
        this.minute = 0;
    }

    public static void main(String[] args) {
        Simulator daycycle = new Simulator(0, 0,0);
        daycycle.incrementMinute();
        int x = 1;
    }
    public void incrementMinute()
    {
        for(int x = 0; x < 1; minute ++) {
            if (minute == 60)
                minute = 0;
            hour += 1;
            if(hour == 24)
                x = 1;
            System.out.println(hour + "AM");
        }
    }

}
