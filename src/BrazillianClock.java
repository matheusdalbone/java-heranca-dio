public non-sealed class BrazillianClock extends Clock{

    @Override
    public Clock convert(final Clock clock) {
        this.seconds = clock.getSeconds();
        this.minutes = clock.getMinutes();
        switch (clock) {
            case AmericanClock americanClock -> {
                if(americanClock.getPeriodIndicator().equals("AM")) {
                    this.hour = americanClock.getHour();
                } else {
                    this.hour = americanClock.getHour() + 12;
                }
            }
            case BrazillianClock brazillianClock -> {
                this.hour = brazillianClock.getHour();
            }
        }

        return null;
    }
}
