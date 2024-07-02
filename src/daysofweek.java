public enum daysofweek {
    Monday("the next day is Tuesday"),
    Tuesday("the next day is Wednesday"),
    Wednesday("the next day is Thursday"),
    Thursday("the next day is Friday"),
    Friday("the next day is Saturday"),
    Saturday("the next day is Sunday"),
    Sunday("the next day is Monday");

    private String nextDay;

    daysofweek(String nextDay) {
        this.nextDay = nextDay;
    }

    public String getNextDay() {
        return nextDay;
    }
}
