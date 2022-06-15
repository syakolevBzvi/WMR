import java.util.Date;

public class RaceRun extends Run
{
    private int position;
    private Category category;
    private Group group;
    private int number;
    private double raceDistance;

    public RaceRun(Runner runner, Category category, double raceDistance)
    {
        super(runner);
        this.category = category;
        this.group = null;
        this.raceDistance=raceDistance;
        this.position=-1;
        this.number=-1;
    }

    public RaceRun(Runner runner, Category category, Group group, double raceDistance)
    {
        super(runner);
        this.category = category;
        this.group = group;
        this.raceDistance=raceDistance;
        this.position=-1;
        this.number=-1;
    }

    public RaceRun(double distance, Date duration, Date startingTime, Date startingDate, Runner runner, Category category, Group group, double raceDistance) {
        super(distance, duration, startingTime, startingDate, runner);
        this.category = category;
        this.group = group;
        this.raceDistance=raceDistance;
        this.position=-1;
        this.number=-1;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getRaceDistance() {
        return raceDistance;
    }

    public void setRaceDistance(double raceDistance) {
        this.raceDistance = raceDistance;
    }
}
