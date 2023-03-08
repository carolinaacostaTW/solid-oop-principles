package single_responsibility.exercise_2.bad;

public abstract class MediaConfig {

    private final String title;

    public MediaConfig(final String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
