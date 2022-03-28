import java.util.Scanner;

class Date{

    int day, month, year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;

        if(day<1 || day >31 || month<1 || month>12 || year<1600 || year>2999){
            System.out.println("Fhelermeldung!");
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

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


