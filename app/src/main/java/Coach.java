import java.util.Date;

public class Coach extends Runner
{
    private Date registerDate;

    public Coach(String name, Date birtdate, String gender) {
        super(name, birtdate, gender);
    }

    public Date getRegisterDate() {
        return registerDate;
    }
}
