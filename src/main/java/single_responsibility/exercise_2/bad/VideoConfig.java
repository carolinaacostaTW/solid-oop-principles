package single_responsibility.exercise_2.bad;

public class VideoConfig extends StreamMediaConfig {

    private final VideoFormat format;
    private final int fps;

    public VideoConfig(final String title,
                       final VideoFormat format,
                       final int fps,
                       final int duration) {
        super(title, duration);
        this.format = format;
        this.fps = fps;
    }

    public int getFps() {
        return fps;
    }

    public VideoFormat getFormat() {
        return format;
    }
}
