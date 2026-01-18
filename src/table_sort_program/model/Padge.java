package table_sort_program.model;
import java.util.Date;

public class Padge{
    private int id;
    private String owner;
    private int personQuantity;
    private Date timeArrived;

    public Padge(){

    }

    public Padge(int id, int personQuantity, Date timeArrived, String owner){
        this.id = id;
        this.personQuantity = personQuantity;
        this.timeArrived = timeArrived;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPersonQuantity() {
        return personQuantity;
    }

    public void setPersonQuantity(int personQuantity) {
        this.personQuantity = personQuantity;
    }

    public Date getTimeArrived() {
        return timeArrived;
    }

    public void setTimeArrived(Date timeArrived) {
        this.timeArrived = timeArrived;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
