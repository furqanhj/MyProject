package Challenges;

public class daysInMonthChallenge {

    public static void main(String[] args) {

        daysInMonthChallenge printDays = new daysInMonthChallenge();
        System.out.println(printDays.daysOfMonth("February"));
    }

    public int daysOfMonth(String nameOfMonth) {

        int numOfDays = -1;

        switch (nameOfMonth) {
            case "January": case "March": case "May": case "July": case "August": case "October": case "December":
                numOfDays = 31;
                break;

            case "February":
                numOfDays = 28;
                break;

            case "April": case "June": case "September": case "November":
                numOfDays = 31;
                break;

            default:
                return numOfDays;
        }
        return numOfDays;
    }
}
