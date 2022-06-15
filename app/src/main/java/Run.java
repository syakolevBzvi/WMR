import android.location.Location;

import java.util.ArrayList;
import java.util.Date;

public class Run
{
    protected double distance;
    protected Date duration;
    protected Date startingTime;
    protected Date startingDate;
    protected ArrayList<Location> route;

    public Run(double distance, Date duration, Date startingTime, Date startingDate) {
        this.distance = distance;
        this.duration = duration;
        this.startingTime = startingTime;
        this.startingDate = startingDate;
        this.route = new ArrayList<Location>();
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    public Date getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(Date startingTime) {
        this.startingTime = startingTime;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public ArrayList<Location> getRoute() {
        return route;
    }

    public void setRoute(ArrayList<Location> route) {
        this.route = route;
    }
}
