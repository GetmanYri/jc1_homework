package part4.task15;

public class Sum {
    public static void main(String[] args) {
        long num = 7_893_823_445L;
        int sum = 0;
        do {
            sum += num % 10;
            num /= 10;
        } while (num > 0);
        System.out.println(sum);
    }
}
