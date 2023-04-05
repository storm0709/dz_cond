public class Main {
    public static void main(String[] args) {
        int year = 2014;

        if (year % 4 == 0) {
            System.out.println("цей рік високосний");
        } else if (year % 100 == 0) {
            System.out.println("цей рік високосний");
        } else if (year % 400 == 0) {
            System.out.println("цей рік високосний");
        } else {
            System.out.println("цей рік звичайний");
        }
        color();
    }
    static void color ()
    {
        String color = "green";

        switch (color) {
            case "red":
                System.out.println("stop");
                break;

            case "yellow":
                System.out.println("caution");
                break;

            case "green":
                System.out.println("go");
                break;

            default:
                System.out.println("it's not a traffic light");
        }

    }
}