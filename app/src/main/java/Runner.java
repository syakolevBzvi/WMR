import java.util.Date;

public class Runner
{
    protected String name;
    protected Date birtdate;
    protected String gender;
    protected int index;

    public Runner(String name, Date birtdate, int index)
    {
        this.name = name;
        this.birtdate = birtdate;
        this.gender = gender;
        this.index=-1;
    }

    public Runner(String name, Date birtdate, String gender)
    {
        this.name = name;
        this.birtdate = birtdate;
        this.gender = gender;
        this.index=-1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirtdate() {
        return birtdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
