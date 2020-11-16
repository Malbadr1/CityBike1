

public class Bike {
    private static int idIncrement=1;
    private int bikeID;
    private String color;

    public Bike( String color) {
        this.bikeID = idIncrement++;
        this.color = color;
    }

    public int getBikeID() {
        return bikeID;
    }

    public void setBikeID(int bikeID) {
        this.bikeID = bikeID;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  
                "bikeID=" + bikeID +
                ", color='" + color ;
    }
}