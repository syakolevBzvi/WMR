import java.util.ArrayList;

public class Group
{
    private int index;
    private String name;
    private ArrayList<Runner> runners;
    private ArrayList<Coach> coaches;

    public Group(String name, Coach coach, int index) {
        this.name = name;
        this.coaches = new ArrayList<Coach>();
        this.coaches.add(coach);
        this.runners = new ArrayList<Runner>();
        this.index = index;
    }

    public Group(String name, Coach coach) {
        this.name = name;
        this.coaches = new ArrayList<Coach>();
        this.coaches.add(coach);
        this.runners = new ArrayList<Runner>();
        int index = -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Runner> getRunners() {
        return runners;
    }

    public ArrayList<Coach> getCoaches() {
        return coaches;
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
