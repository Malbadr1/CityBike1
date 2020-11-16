import java.util.ArrayList;
import java.util.Date;

public class Station {
    private static int IncrementStationId=1;
    private int stationID;
    private String location;
    private ArrayList<Bike> bikesInStation;
    private int Limit;

    public Station(String location, int Limit) {
        this.stationID = IncrementStationId++;
        this.location = location;
        bikesInStation=new ArrayList<>();
        this.Limit=Limit;
    }

    public boolean addBike(Bike bike){

        if(bikesInStation.size()>=Limit){
            return false;
        }

        bikesInStation.add(bike);
        return true;
    }

    public int getStationID() {
        return stationID;
    }

    public void setStationID(int stationID) {
        this.stationID = stationID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Bike> getBikesInStation() {
        return bikesInStation;
    }

    public void setBikesInStation(ArrayList<Bike> bikesInStation) {

        this.bikesInStation = bikesInStation;
    }

    public boolean   rentBikeDate(User user,Bike bike,Rent rent){
        Date rentStart=rent.getRentStart();
        Date rentEnd= rent.getRentEnd();


        System.out.println("User : "+user.getName()+"\t"+user.getSurname()+"\t"+" now renting bike Id:"+"\t"+bike.getBikeID()+"\t"+"at"+"\t"+rentStart+
                "\n"+"User : "+user.getName()+"\t"+user.getSurname()+"\t"+" now returned bike Id:"+"\t"+bike.getBikeID()+"\t"+"at"+"\t"+rentEnd);
        return true;

    }
}
