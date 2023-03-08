package single_responsibility.exercise_2.bad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MediaConfigTest {

    @Test
    public void audioFormat_shouldHaveAllPropertiesSetted() {
        var audio = new AudioConfig("audioTitle",
                AudioFormat.MP3,
                33
        );

        assertEquals("audioTitle", audio.getTitle());
        assertEquals(33, audio.getDuration());
        assertEquals(AudioFormat.MP3, audio.getFormat());
    }

    @Test
    public void videoFormat_shouldHaveAllPropertiesSetted() {
        var video = new VideoConfig("videoTitle",
                VideoFormat.AVI,
                24,
                60
        );

        assertEquals("videoTitle", video.getTitle());
        assertEquals(24, video.getFps());
        assertEquals(60, video.getDuration());
        assertEquals(VideoFormat.AVI, video.getFormat());
    }

    @Test
    public void imageFormat_shouldHaveAllPropertiesSetted() {
        var image = new ImageConfig("imageTitle",
                ImageFormat.BMP,
                56,
                65,
                37
        );

        assertEquals("imageTitle", image.getTitle());
        assertEquals(ImageFormat.BMP, image.getImageFormat());
        assertEquals(56, image.getImageHeight());
        assertEquals(65, image.getImageWidth());
        assertEquals(37, image.getImageResolution());
    }
}