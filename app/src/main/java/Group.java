import java.util.ArrayList;

public class Group
{
    private String name;
    private ArrayList<Runner> runners;
    private Coach coach;

    public Group(String name, Coach coach) {
        this.name = name;
        this.coach = coach;
        this.runners = new ArrayList<Runner>();
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

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
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
