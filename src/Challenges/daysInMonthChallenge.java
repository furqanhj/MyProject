package Challenges;

public class daysInMonthChallenge {

    public static void main(String[] args) {

        daysInMonthChallenge printDays = new daysInMonthChallenge();
        System.out.println(printDays.daysOfMonth("Jan"));
    }


    public int daysOfMonth(String nameOfMonth) {

        int daysInNum = -1;

        switch (nameOfMonth) {
            case "Jan":
                daysInNum = 31;
                break;
            case "Feb":
                daysInNum = 28;
                break;

            case "Mar":
                daysInNum = 31;
                break;

            case "Apr":
                daysInNum = 30;
                break;

            case "May":
                daysInNum = 31;
                break;

            case "Jun":
                daysInNum = 30;
                break;

            case "Jul":
                daysInNum = 31;
                break;

            case "Aug":
                daysInNum = 30;
                break;

            case "Sept":
                daysInNum = 31;
                break;

            case "Oct":
                daysInNum = 30;
                break;

            case "Nov":
                daysInNum = 31;
                break;

            case "Dec":
                daysInNum = 31;
                break;

            default:
                return daysInNum;

        }

        return daysInNum;
    }


}
