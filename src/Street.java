import java.util.ArrayList;
import java.util.List;
public class Street {
    private String name;
    private List<House> houses;

    public Street(){
        this.houses = new ArrayList<House>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<House> getHouses(){
        return houses;
    }
    public void addHouse(int number, House house){
        this.houses.add(house);
    }
}