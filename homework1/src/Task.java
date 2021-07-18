public abstract class Task
{
    String Name;
    int id;
    public String getName()  {return Name;}
    public int getId() {return id;}
    public void setName(String Name) {this.Name=Name;}
    public void setId(int id) {this.id=id;}
    public Task(){}
    public Task(String Name, int id){setName(Name); setId(id);}
    public abstract void show();
}
