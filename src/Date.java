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
}


