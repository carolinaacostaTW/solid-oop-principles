package single_responsibility.exercise_2.bad;

public class AudioConfig extends StreamMediaConfig {

    private final AudioFormat format;

    public AudioConfig(String title, AudioFormat format, int duration) {
        super(title, duration);
        this.format = format;
    }

    public AudioFormat getFormat() {
        return format;
    }
}
