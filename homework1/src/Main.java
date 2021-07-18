import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        TaskListContainer List=new TaskListContainer();
        List.add(new UncompletedTask(1,"create a repository","Ivanov"));
        List.add(new UncompletedTask(2,"create a commit","Petrov"));
        List.add(new UncompletedTask(3,"upload to github","Sidorov"));
        List.add(new CompletedTask(4,"make a main menu"));
        List.add(new CompletedTask(5,"make git screen shots"));
        List.add(new CompletedTask(6,"send a homework"));



        Scanner scanner=new Scanner(System.in);
         int answer;
        while(true)
        {
            System.out.println("Press 1 to add a task");
            System.out.println("Press 2 to show all tasks");
            System.out.println("Press 3 to show completed tasks");
            System.out.println("Press 4 to show uncompleted tasks");
            System.out.println("Press 5 to mark a task as completed by ID");
            System.out.println("Press 0 to quit");

            answer=scanner.nextInt();
            scanner.nextLine();
            System.out.flush();
            switch (answer)
            {
                case 0: return;
                case 1:
                     {addTask(List,scanner); break;}
                case 2:
                    {List.showAll(); System.out.println(""); break;}
                case 3:
                    {List.showCompleted(); System.out.println(""); break;}
                case 4:
                    {List.showUncompleted(); System.out.println(""); break;}
                case 5:
                    {completeTask(List, scanner); break;}
            }
        }
    }

static void addTask(TaskListContainer List, Scanner scanner)
    {

        System.out.println("Enter a name of a new task:");
        String Name=scanner.nextLine();

        System.out.println("Enter a responsible person:");
        String Owner=scanner.nextLine();
        int id=List.getMaxID();
        //System.out.println(id);System.out.println(id);System.out.println(id);

        List.add(new UncompletedTask(id+1,Name,Owner));

    }
static void completeTask(TaskListContainer List, Scanner scanner)
    {
        System.out.println("Enter ID of the task to complete:");
         int id=scanner.nextInt();
         List.CompleteTask(id);

    }
}

