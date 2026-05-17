package src;
public class Camera extends SmartDevice {
    private String resolution;
    private String format;

    public Camera(String name, String resolution, String format) {
        super(name);
        this.resolution = resolution;
        this.format = format;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

}
