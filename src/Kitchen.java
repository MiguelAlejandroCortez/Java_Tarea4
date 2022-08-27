import java.nio.channels.Pipe;

public class Kitchen {
    private boolean stove;
    private boolean sink;
    private int windows;
    private boolean refrigerator;
    private boolean oven;
    private int width;
    private int height;
    private String color;

    public boolean isStove() {
        return stove;
    }

    public void setStove(boolean stove) {
        this.stove = stove;
    }

    public boolean isSink() {
        return sink;
    }

    public void setSink(boolean sink) {
        this.sink = sink;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public boolean isRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(boolean refrigerator) {
        this.refrigerator = refrigerator;
    }

    public boolean isOven() {
        return oven;
    }

    public void setOven(boolean oven) {
        this.oven = oven;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static class builder {
        boolean stove;
        boolean sink;
        int windows;
        boolean refrigerator;
        boolean oven;
        int width;
        int height;
        String color;
        public Kitchen build() {
            Kitchen kitchen = new Kitchen();
            kitchen.setStove(this.stove);
            kitchen.setSink(this.sink);
            kitchen.setWindows(this.windows);
            kitchen.setRefrigerator(this.refrigerator);
            kitchen.setStove(this.stove);
            kitchen.setOven(this.oven);
            kitchen.setWidth(this.width);
            kitchen.setHeight(this.height);
            kitchen.setColor(this.color);
            return kitchen;
        }
        public boolean stove(boolean b) {
            this.stove=b;
            return b;
        }
    }
}