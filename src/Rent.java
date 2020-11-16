import java.util.Date;

public class Rent {
    private Date rentStart;
    private  Date rentEnd;

    public Rent(Date rentStart, Date rentEnd) {
        this.rentStart = rentStart;
        this.rentEnd = rentEnd;
    }

    public Date getRentStart() {
        return rentStart;
    }

    public void setRentStart(Date rentStart) {
        this.rentStart = rentStart;
    }

    public Date getRentEnd() {
        return rentEnd;
    }

    public void setRentEnd(Date rentEnd) {
        this.rentEnd = rentEnd;
    }
}
