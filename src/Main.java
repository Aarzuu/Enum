import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1.2.verilən günün növbəti gününü əldə edin. //1.4
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of any day of the week:");
        String day = sc.next();
        if (Objects.equals(day, daysofweek.Monday.name())) {
            System.out.println(daysofweek.Monday.getNextDay());
        }
        else if (Objects.equals(day, daysofweek.Tuesday.name())) {
            System.out.println(daysofweek.Tuesday.getNextDay());
        }
        else if (Objects.equals(day, daysofweek.Wednesday.name())) {
            System.out.println(daysofweek.Wednesday.getNextDay());
        }
        else if (Objects.equals(day, daysofweek.Thursday.name())) {
            System.out.println(daysofweek.Thursday.getNextDay());
        }
        else if (Objects.equals(day, daysofweek.Friday.name())){
            System.out.println(daysofweek.Friday.getNextDay());;
        }
        else if (Objects.equals(day, daysofweek.Saturday.name())){
            System.out.println(daysofweek.Saturday.getNextDay());
        }
        else if (Objects.equals(day, daysofweek.Sunday.name())){
            System.out.println(daysofweek.Sunday.getNextDay());
        }
        else {
            System.out.println("this is not a day of week");
            System.out.println("Or you type it wrong");
        }


        //1.3.Müəyyən bir günün iş günü və ya həftə sonu olub olmadığını yoxlayın
            if (Objects.equals(day, daysofweek.Monday.name()) || Objects.equals(day, daysofweek.Tuesday.name()) || Objects.equals(day, daysofweek.Wednesday.name()) || Objects.equals(day, daysofweek.Thursday.name()) || Objects.equals(day, daysofweek.Friday.name())){
                System.out.println("weekday");
            }
            else if (Objects.equals(day, daysofweek.Saturday.name()) || Objects.equals(day, daysofweek.Sunday.name())) {
                System.out.println("weekend");
            }
            else {
                System.out.println("not a day of week");
                System.out.println("or you type it wrong");
            }
    }
}