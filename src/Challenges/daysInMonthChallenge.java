package Challenges;

public class daysInMonthChallenge {

    public static void main(String[] args) {

        daysInMonthChallenge printDays = new daysInMonthChallenge();
        System.out.println(printDays.daysOfMonth("February"));
    }

    public int daysOfMonth(String nameOfMonth) {

        int daysInNum = -1;

        switch (nameOfMonth) {
            case "January": case "March": case "May": case "July": case "August": case "October": case "December":
                daysInNum = 31;
                break;

            case "February":
                daysInNum = 28;
                break;

            case "April": case "June": case "September": case "November":
                daysInNum = 31;
                break;

            default:
                return daysInNum;
        }
        return daysInNum;
    }
}
