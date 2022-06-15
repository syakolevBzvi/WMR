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
    protected int watched;
    protected Runner runner;

    public Run(Runner runner) {
        this.distance = -1.0;
        this.duration = null;
        this.startingTime = null;
        this.startingDate = null;
        this.route = new ArrayList<Location>();
        this.watched=0;
        this.runner=runner;
    }

    public Run(double distance, Date duration, Date startingTime, Date startingDate, Runner runner) {
        this.distance = distance;
        this.duration = duration;
        this.startingTime = startingTime;
        this.startingDate = startingDate;
        this.route = new ArrayList<Location>();
        this.watched=0;
        this.runner=runner;
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

    public Runner getRunner() {
        return runner;
    }

    public void setRunner(Runner runner) {
        this.runner = runner;
    }

    public int getWatched() {
        return watched;
    }

    public void addWatched()
    {
        this.watched++;
    }
}
