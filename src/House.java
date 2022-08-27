public class House{
    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private LivingRoom livingRoom;
    private RestRoom []restRooms;
    private BedRoom []bedRooms;
    private Yard yard;

    private int cont1;
    private int cont2;

    House(){
        restRooms = new RestRoom[10];
        bedRooms = new BedRoom[10];
    }

    public void addRoom(RestRoom restRoom){
        if(this.cont1 < 10){
            this.restRooms[this.cont1] = restRoom;
            this.cont1++;
        }
        else
            throw new RuntimeException("No se permiten mas RestRooms en este programa");
    }

    public void addRoom(BedRoom bedRoom){
        if(this.cont2 < 10){
            this.bedRooms[this.cont2] = bedRoom;
            this.cont2++;
        }
        else
            throw new RuntimeException("No se permiten mas BedRooms en este programa");
    }

    public void setBedRoom(BedRoom bedRoom){
        this.bedRooms = bedRooms;
    }
    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public DiningRoom getDiningRoom() {
        return diningRoom;
    }

    public void setDiningRoom(DiningRoom diningRoom) {
        this.diningRoom = diningRoom;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(LivingRoom livingRoom) {
        this.livingRoom = livingRoom;
    }

    public RestRoom[] getRestRooms() {
        return restRooms;
    }

    public BedRoom[] getBedRooms() {
        return bedRooms;
    }

    public Yard getYard() {
        return yard;
    }

    public void setYard(Yard yard) {
        this.yard = yard;
    }

    static class Builder {
        Kitchen kitchen;
        DiningRoom diningRoom;
        BedRoom bedRoom;

        public Kitchen conKitchen(Kitchen kitchen) {
            this.kitchen = kitchen;
            return kitchen;
        }
        public Builder conDiningRoom(DiningRoom diningRoom) {
            this.diningRoom = diningRoom;
            return this;
        }

        public Builder conBedRoom(BedRoom bedRoom) {
            this.bedRoom = bedRoom;
            return this;
        }

        public House build() {
            House house = new House();
            house.setKitchen(this.kitchen);
            house.setDiningRoom(this.diningRoom);
            house.setBedRoom(this.bedRoom);
            return house;
        }
    }
}