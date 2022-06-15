import java.util.Date;

public class Coach extends Runner
{
    private Date registerExpiredDate;

    public Coach(String name, Date birtdate, String gender, Date registerExpiredDate) {
        super(name, birtdate, gender);
        this.registerExpiredDate = registerExpiredDate;
    }

    public Date getRegisterExpiredDate() {
        return registerExpiredDate;
    }

    public void setRegisterExpiredDate(Date registerExpiredDate) {
        this.registerExpiredDate = registerExpiredDate;
    }
}
