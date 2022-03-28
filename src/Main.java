import java.util.Scanner;

class Main{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day1 = sc.nextInt();
        int month1 = sc.nextInt();
        int year1 = sc.nextInt();

        Date date1 = new Date(day1, month1, year1);
        System.out.println(date1.getDay() + "." + date1.getMonth() + "." + date1.getYear());


        int day2 = sc.nextInt();
        int month2 = sc.nextInt();
        int year2 = sc.nextInt();

        Date date2 = new Date(day2, month2, year2);
        System.out.println(date2.getDay() + "." + date2.getMonth() + "." + date2.getYear());
    }
}