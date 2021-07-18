import java.util.ArrayList;

public class TaskListContainer {

    private ArrayList<Task> TaskList;
    public TaskListContainer()
    {
        TaskList=new ArrayList<Task>();
    }
    public void add(Task NewTask)
    {
        TaskList.add(NewTask);
    }

    public void showCompleted()
    {
       for (int i = 0; i < TaskList.size(); i++)
        if((TaskList.get(i).getClass().toString().equals("class CompletedTask")))
        {
            TaskList.get(i).show();
        }

    }


    public void showUncompleted()
    {
        for (int i = 0; i < TaskList.size(); i++)
            if((TaskList.get(i).getClass().toString().equals("class UncompletedTask")))
            {
                TaskList.get(i).show();
            }

    }
    public void showAll()
    {
        //showCompleted();
        //showUncompleted();
        for (int i = 0; i < TaskList.size(); i++)    TaskList.get(i).show();


    }


    public int getMaxID()
    {
        int result=0;
        for (int i = 0; i < TaskList.size(); i++)
            if (result <TaskList.get(i).getId())
                result = TaskList.get(i).getId();


            return result;
    }

    public void CompleteTask(int id) {

        for (int i = 0; i < TaskList.size(); i++) {

            if((TaskList.get(i).getClass().toString().equals("class CompletedTask"))&&(TaskList.get(i).getId() == id))
                System.out.printf("The task with id %d is already comleted\n", TaskList.get(i).getId());

            if ((TaskList.get(i).getId() == id) && (TaskList.get(i).getClass().toString().equals("class UncompletedTask"))) {
                Task task = TaskList.get(i);
                TaskList.remove(i);
                TaskList.add(new CompletedTask(task));

            }
        }
    }
}
