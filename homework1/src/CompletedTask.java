import java.util.Date;

import static java.lang.System.*;

public class CompletedTask extends Task
{
Date CompletionDate;
public Date getDate(){ return CompletionDate;}
public CompletedTask(){}
public CompletedTask(Task TaskToComplete)

    {   setId(TaskToComplete.getId());
        setName(TaskToComplete.getName());
        CompletionDate=new Date(System.currentTimeMillis());
    }
    public CompletedTask(int id, String Name)

    {   this.id=id;
        this.Name=Name;
        CompletionDate=new Date(System.currentTimeMillis());
    }

    public void show(){System.out.printf("ID: %d Name: %s, Completed: %s\n", id,Name,CompletionDate.toString());}


}
