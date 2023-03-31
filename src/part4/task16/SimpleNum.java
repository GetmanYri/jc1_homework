package part4.task16;

public class SimpleNum {
    public static void main(String[] args) {
        int num = 0;
        int count;
        int countTwo = 0;
        for (int i = 50; i <= 70; i++) {
            count=0;
            for (int j = 1; j <= i; j++) {
                if (i % j  == 0) {
                    count++;
                }
                if(count>2){
                    break;
                }
            }
            if (count == 2) {
                num = i;
                countTwo++;
            }

            if (countTwo == 2) {
                System.out.println("second simple number=" + num);
                break;
            }
        }
    }

}
