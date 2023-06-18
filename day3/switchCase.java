public class switchCase {

    public static void main(String... args) {
        int weekOfDay = 4;
        String weekValue = null;
        switch (weekOfDay) {
            case 1:
                weekValue = "Monday";
                break;
            case 2:
                weekValue = "Tuesday";
                break;
            case 3:
                weekValue = "Wednesday";
                break;
            case 4:
                weekValue = "Thursday";
                break;
            case 5:
                weekValue = "Friday";
                break;
            case 6:
                weekValue = "Saturday";
                break;
            case 7:
                weekValue = "Sunday";
                break;
            default:
                weekValue = "Invalid week";
        }
        System.out.println(weekValue);
    }
}