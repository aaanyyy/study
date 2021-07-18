import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

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

