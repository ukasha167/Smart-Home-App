package src;
public class LightBulb extends SmartDevice {
    private int brigtness;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBrigtness() {
        return brigtness;
    }

    public void setBrigtness(int brigtness) {
        if (brigtness < 0 || brigtness > 100) {
            brigtness = 0;
        } else {
            this.brigtness = brigtness;
        }
    }

    public LightBulb(String name, String color) {
        super(name);
        this.color = color;
        brigtness = 0;
    }
}
