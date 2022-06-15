import java.util.ArrayList;

public class Race
{
    private ArrayList<Runner> runners;



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
