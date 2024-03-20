class Year {
    int year;

    Year(int year) {
        this.year = year;
    }

    boolean isLeapYear() {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            return true;
        else
            return false;
    }
}

class LeapYearChecker extends Year {
    LeapYearChecker(int year) {
        super(year);
    }

    void checkLeapYear() {
        if (isLeapYear())
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}

public class p2 {
    public static void main(String[] args) {
        LeapYearChecker yearObj = new LeapYearChecker(2024);
        yearObj.checkLeapYear();
    }
}
