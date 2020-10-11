package Problem_19;

public class P_19 {
    public static void main(String[] args) {

        int sundays=0;

        //checking which day of the week is 1 Jan 19001 (sunday=7)
        int currentDayInWeek;

        if(isLeapYear(1900))
            currentDayInWeek = (1+366)%7;
        else
            currentDayInWeek = (1+365)%7;


        for (int year = 1901; year <= 2000 ; year++)
            for (int month = 1; month <= 12 ; month++) {
                currentDayInWeek+=numberOfDaysInAMonth(month,year);
                if(currentDayInWeek%7==0)
                    sundays++;
            }

        System.out.println(sundays);
    }

    static int numberOfDaysInAMonth(int month, int year){

        if((month==1) || (month==3) || (month==5) || (month==7) || (month==8) || (month==10) || (month==12))
            return 31;
        else if (month==4 || month==6 || month==9 || month==11)
            return 30;
        else
            return isLeapYear(year)? 29 : 28;

    }
    static boolean isLeapYear(int year){

        if(year % 100 == 0 )
            return year % 400 ==0;

        return year % 4 == 0;
    }
}

/*


You are given the following information, but you may prefer to do some research for yourself.

    1 Jan 1900 was a Monday.
    Thirty days has September,
    April, June and November.
    All the rest have thirty-one,
    Saving February alone,
    Which has twenty-eight, rain or shine.
    And on leap years, twenty-nine.
    A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.

How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?

 */
