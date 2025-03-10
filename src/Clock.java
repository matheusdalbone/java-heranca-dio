public sealed abstract class Clock permits AmericanClock, BrazillianClock{
    protected int hour;
    protected int minutes;
    protected int seconds;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour <= 24) {
            this.hour = hour;
        } else {
            System.out.println("Hora invalida.");
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if(minutes <= 60) {
            this.minutes = minutes;
        } else {
            System.out.println("Minutos invalidos.");
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if(seconds <= 60) {
            this.seconds = seconds;
        } else {
            System.out.println("Segundos invalidos.");
        }
    }

    abstract Clock convert(Clock clock);

    public String showTime() {
        return this.hour + ":" + this.minutes + ":" + this.seconds;
    }
}
