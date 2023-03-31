package part3.task12;

public class Schedule {

    public static void main(String[] args) {
        int numberDay = Integer.parseInt(args[0]);
        String schedule = scheduleOnWeek(numberDay);
        System.out.println(schedule);
    }

    public static String scheduleOnWeek(int numberDay) {
        String schedule;
        switch (numberDay) {
            case 1:
            case 4:
                schedule = "Work and go to Alexander to learn java";
                break;
            case 2:
            case 6:
                schedule = "learn Java ";
                break;
            case 3:
                schedule = "Work and learn Java";
                break;

            case 5:
                schedule = "learn java and maybe relax";
                break;
            case 7:
                schedule = "Family and learn Java";
                break;
            default:
                schedule = "Error";
        }

        return schedule;

    }
}

