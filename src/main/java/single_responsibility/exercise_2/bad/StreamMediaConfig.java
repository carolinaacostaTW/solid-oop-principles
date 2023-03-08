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

//    public String getPrettyDuration() {
//        throw new RuntimeException("Implement me");
//    }

    //hacer varios casos para probar varis escenarios.
}
