import java.util.Date;

public class UncompletedTask extends Task
{
    String Owner;
    public String getOwner(){ return Owner;}
    public UncompletedTask(){}
    public UncompletedTask(int id, String Name, String Owner)
    {
        this.Owner=Owner;
        this.id=id;
        this.Name=Name;

    }
    public void show(){System.out.printf("ID: %d Name: %s, Owner: %s\n", id,Name,Owner);}

}
