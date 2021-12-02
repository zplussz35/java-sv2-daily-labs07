package day04;

import java.util.ArrayList;
import java.util.List;

public class Courier {

    private List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride){
        if(!this.rides.isEmpty() && ride.getDay()<rides.get(rides.size()-1).getDay()||
                (ride.getDay()==rides.get(rides.size()-1).getDay()&&ride.getSerialNum()<=rides.get(rides.size()-1).getSerialNum())){
            throw new IllegalArgumentException("Not correct record!");
        }
        this.rides.add(ride);
    }
}
