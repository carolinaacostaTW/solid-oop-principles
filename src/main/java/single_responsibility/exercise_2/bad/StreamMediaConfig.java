package single_responsibility.exercise_2.bad;

public abstract class StreamMediaConfig extends MediaConfig {
    private final int duration;

    public StreamMediaConfig(String title, int duration) {
        super(title);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public String getPrettyDuration() {
        int hours = duration/60;
        int minutes = duration % 60;
        String hoursString = String.format("%02d", hours);
        String minutesString = String.format("%02d", minutes);
        return hoursString + ":" + minutesString;
    }
}
