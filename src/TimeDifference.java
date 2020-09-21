import java.util.Scanner;

public class TimeDifference {
    public static void main(String[] args) {
        System.out.println();
        Scanner scan = new Scanner(System.in);
        int firstHour = scan.nextInt();
        int firstMinutes = scan.nextInt();
        int firstSeconds = scan.nextInt();
        int secondHour = scan.nextInt();
        int secondMinutes = scan.nextInt();
        int secondSeconds = scan.nextInt();
        int firstMoment = firstHour*3600 + firstMinutes*60 + firstSeconds;
        int secondMoment = secondHour*3600 + secondMinutes*60 + secondSeconds;
        int difference = secondMoment - firstMoment;
        System.out.println(difference);



    }
}
