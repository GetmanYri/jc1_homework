package part3.task9;

public class Ruble {
    public static void main(String[] args) {
        int sum = Integer.parseInt(args[0]);
        String ruble = "Ошибка";
        int pointer = 0;
        if (sum % 100 > 9 && sum % 100 < 21) {
            ruble = "Рублей";
            System.out.println(sum + " " + ruble);
            System.exit(0);
        } else {
            pointer = sum % 10;
        }
        switch (pointer) {
            case 1:
                ruble = "рубль";
                break;
            case 2:
            case 3:
            case 4:
                ruble = "рубля";
                break;
            default:
                ruble = "рублей";
        }
        System.out.println(sum + " " + ruble);
    }

}

