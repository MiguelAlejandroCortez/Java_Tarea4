public class HouseBuilder{
    public static void main(String[] args){
        House house = new House.Builder()
                .kitchen(new Kitchen.builder()
                        .stove(true)
                        .sink(true)
                        .windows(1)
                        .refrigerator(true)
                        .oven(false)
                        .width(3)
                        .height(4)
                        .color("red")
                        .build())
                .diningRoom(new DiningRoom.builder()
                        .windows(2)
                        .tv(false)
                        .width(5)
                        .height(5)
                        .color("white")
                        .chairsCapacity(8)
                        .build())
                .bedRoom(new BedRoom.builder()
                        .bedSize(BedSize.queen)
                        .tv(false)
                        .width(5)
                        .height(5)
                        .color("blue")
                        .build())
                .build();
    }
    private HouseBuilder(){

    }
}