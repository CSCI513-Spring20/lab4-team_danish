public class HouseAreaFactory extends HouseFactory {
    @Override
    public HouseEntity createHouse(String type) {
        switch (type) {
            case "Kitchen":
                return new HouseArea("Kitchen");
            case "Bedroom":
                return new HouseArea("Bedroom");
            case "Bathroom":
                return new HouseArea("Bathroom");
            case "Downstairs":
                return new HouseArea("Downstairs");
            case "Upstairs":
                return new HouseArea("Upstairs");
            default:
                return null;
        }
    }
}