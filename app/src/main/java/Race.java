import android.location.Location;

import java.util.ArrayList;
import java.util.Date;

public class Race
{
    private String name;
    private Location location;
    private Date date;
    private ArrayList<Location> route;
    private ArrayList<Runner> runners;

    public Race(String name, Location location, Date date) {
        this.name = name;
        this.location = location;
        this.date = date;
        this.runners = new ArrayList<Runner>();
        this.route = new ArrayList<Location>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Location> getRoute() {
        return route;
    }

    public void setRoute(ArrayList<Location> route) {
        this.route = route;
    }

    public ArrayList<Runner> getRunners() {
        return runners;
    }

    public void addRunner(Runner runner)
    {
        this.runners.add(runner);
    }

    public void removeRunner(int index)
    {
        this.runners.remove(index);
    }
}
