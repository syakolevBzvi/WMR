import android.location.Location;

import java.util.ArrayList;
import java.util.Date;

public class Race
{
    private String name;
    private Location location;
    private Date date;
    private ArrayList<Route> routes;
    private ArrayList<RaceRun> runners;
    private int index;

    public Race(String name, Location location, Date date, int index) {
        this.name = name;
        this.location = location;
        this.date = date;
        this.runners = new ArrayList<RaceRun>();
        this.routes = new ArrayList<Route>();
        this.index=index;
    }

    public Race(String name, Location location, Date date) {
        this.name = name;
        this.location = location;
        this.date = date;
        this.runners = new ArrayList<RaceRun>();
        this.routes = new ArrayList<Route>();
        this.index=-1;
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

    public ArrayList<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(ArrayList<Route> routes) {
        this.routes = routes;
    }

    public ArrayList<RaceRun> getRunners() {
        return runners;
    }

    public void addRunner(RaceRun runner)
    {
        this.runners.add(runner);
    }

    public void removeRunner(int index)
    {
        this.runners.remove(index);
    }

    public void addRoute(Route route)
    {
        this.routes.add(route);
    }

    public void removeRoute(int index)
    {
        this.routes.remove(index);
    }
}
