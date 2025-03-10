public non-sealed class  AmericanClock extends Clock{

    private String periodIndicator;

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setPeriodIndicator(String periodIndicator) {
        this.periodIndicator = periodIndicator;
    }

    public void setBeforeMidday() {
        this.periodIndicator = "AM";
    }
    
    public void setAfterMidday() {
        this.periodIndicator = "PM";
    }

    public void setHour(int hour) {
        setBeforeMidday();
        if(hour > 12 && hour <= 24) {
            setAfterMidday();
            this.hour = hour - 12;
        } else {
            this.hour = hour;
        }
    }

    @Override
    public Clock convert(Clock clock) {
        switch (clock) {
            case AmericanClock americanClock -> {
                this.hour = americanClock.getHour();
            }

            case BrazillianClock brazillianClock -> {
                this.setHour(brazillianClock.getHour());
            }
        }

        return null;
    }

    @Override
    public String showTime() {
        return super.showTime() + " " + this.periodIndicator;
    }
}
