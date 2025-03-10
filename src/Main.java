//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Clock brlClock = new BrazillianClock();

        brlClock.setHour(24);
        brlClock.setMinutes(50);
        brlClock.setSeconds(34);

       System.out.println(brlClock.showTime());

        Clock usClock = new AmericanClock();

        usClock.setHour(1);
        usClock.setMinutes(50);
        usClock.setSeconds(34);

       System.out.println(usClock.showTime());

    }
}