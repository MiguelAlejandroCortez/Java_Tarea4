import java.util.List;

public class Neighborhood {
    private List<Street> streets;
    private int gardens;
    private boolean  basketballCourt;
    private boolean footballCourt;
    private boolean swimmingPool;
    public List<Street> getStreets() {
        return streets;
    }
    public void setStreets(List<Street> streets) {
        this.streets = streets;
    }
    public int getGardens() {
        return gardens;
    }
    public void setGardens(int gardens) {
        this.gardens = gardens;
    }
    public boolean isBasketballCourt() {
        return basketballCourt;
    }
    public void setBasketballCourt(boolean basketballCourt) {
        this.basketballCourt = basketballCourt;
    }
    public boolean isFootballCourt() {
        return footballCourt;
    }
    public void setFootballCourt(boolean footballCourt) {
        this.footballCourt = footballCourt;
    }
    public boolean isSwimmingPool() {
        return swimmingPool;
    }
    public void setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }
}