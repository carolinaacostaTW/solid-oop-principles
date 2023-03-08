package single_responsibility.exercise_2.bad;

public class ImageConfig extends MediaConfig{
    private ImageFormat imageFormat;
    private int imageHeight;
    private int imageWidth;
    private int imageResolution;

    public ImageConfig(String title,
                       ImageFormat imageFormat,
                       int imageHeight,
                       int imageWidth,
                       int imageResolution) {
        super(title);
        this.imageFormat = imageFormat;
        this.imageHeight = imageHeight;
        this.imageWidth = imageWidth;
        this.imageResolution = imageResolution;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public ImageFormat getImageFormat() {
        return imageFormat;
    }

    public int getImageResolution() {
        return imageResolution;
    }
}
