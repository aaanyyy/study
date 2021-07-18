import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {


        ArrayList<Task> taskList = new ArrayList<Task>();
        taskList.add(new UncompletedTask(1,"create a repository","Ivanov"));
        taskList.add(new UncompletedTask(2,"create a commit","Petrov"));
        taskList.add(new UncompletedTask(3,"upload to github","Sidorov"));
        taskList.add(new CompletedTask(4,"make a main menu"));
        taskList.add(new CompletedTask(5,"make git screen shots"));
        taskList.add(new CompletedTask(6,"send a homework"));

        Scanner sc=new Scanner(System.in);
         int answer;
        while(true)
        {
            System.out.println("Press 1 to add a task");
            System.out.println("Press 2 to show all tasks");
            System.out.println("Press 3 to show completed tasks");
            System.out.println("Press 4 to show uncompleted tasks");
            System.out.println("Press 5 to mark a task as completed by ID");
            System.out.println("Press 0 to quit");

            answer=sc.nextInt();
            //sc.next();
            System.out.flush();
            switch (answer)
            {
            case 0: return;
            }
        }
    }



}

