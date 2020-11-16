import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Test{
    public static void main(String[] args) {

        Bike bike1 = new Bike( "red");
        Bike bike2 = new Bike( "yellow");
        Bike bike3 = new Bike("green");
        Bike bike4 = new Bike( "whit");
        Bike bike5 = new Bike( "black");
        Bike bike6 = new Bike( "grey");
        Bike bike7 = new Bike( "brown");
        Bike bike8 = new Bike( "pink");

        System.out.println(bike1.getBikeID());
        System.out.println(bike2.getBikeID());

        HashMap<Integer,Bike> myHahMap=new HashMap<>();
        myHahMap.put(bike1.getBikeID(),bike1);
        myHahMap.put(bike2.getBikeID(),bike2);
        myHahMap.put(bike3.getBikeID(),bike3);
        myHahMap.put(bike4.getBikeID(),bike4);
        myHahMap.put(bike5.getBikeID(),bike5);
        myHahMap.put(bike6.getBikeID(),bike6);
        myHahMap.put(bike7.getBikeID(),bike7);
        myHahMap.put(bike8.getBikeID(),bike8);

        Station station1 = new Station( "lechnerStrasse",5);
        Station station2 = new Station( "wienMitte",4);
        Station station3 = new Station( "meidling",2);
        Station station4 = new Station( "KarlisPlaz",3);

        station1.addBike(bike1);
        station1.addBike(bike2);
        station2.addBike(bike3);
        station2.addBike(bike4);
        station3.addBike(bike5);
        station3.addBike(bike6);
        station4.addBike(bike7);
        station4.addBike(bike8);

        HashMap<Integer, Station> myHashMapStation=new HashMap<>();
        myHashMapStation.put(station1.getStationID(),station1);
        myHashMapStation.put(station2.getStationID(),station2);
        myHashMapStation.put(station3.getStationID(),station3);

        User user1=new User();
        user1.setName("Joe ");
        user1.setSurname("Deo");

        User user2=new User();
        user2.setName("Mary");
        user2.setSurname("Maxi");


        user1.rentBike(bike1,station1);
        user1.returnBike(bike1,station2);
        user2.rentBike(bike3,station2);
        user2.returnBike(bike3,station4);


        Date date1=new Date();
        SimpleDateFormat sf=new SimpleDateFormat();

        Date date2= new Date();
        SimpleDateFormat sf1=new SimpleDateFormat();

        Rent rent=new Rent(date1,date2);
        station1.rentBikeDate(user1,bike1,rent);

    }
}