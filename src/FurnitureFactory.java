public class FurnitureFactory extends HouseFactory {
    public HouseEntity createHouse(String type) {
        switch (type) {
            case "Sink":
                return new Furniture("Sink");
            case "Counter":
                return new Furniture("Counter");
            case "Bed":
                return new Furniture("Bed");
            case "Dresser":
                return new Furniture("Dresser");
            case "Bathtub":
                return new Furniture("Bathtub");
            default:
                return null;
        }
    }
}