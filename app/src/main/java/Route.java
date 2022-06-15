import android.location.Location;

import java.util.ArrayList;

public class Route
{
    private ArrayList<Location> route;
    private String name;
    private double length;

    public Route(ArrayList<Location> route, String name, double length) {
        this.route = route;
        this.name = name;
        this.length = length;
    }

    public Route(String name, double length) {
        this.route = new ArrayList<Location>();
        this.name = name;
        this.length = length;
    }

    public ArrayList<Location> getRoute() {
        return route;
    }

    public void setRoute(ArrayList<Location> route) {
        this.route = route;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
