package lesson4;

public class Main {
    public static void main(String[] args) {
        Man man1,man2;
        man1=new Man();
        man2=new Man();

        System.out.println("Man1:"+man1.hairLength);
        man2.grow();
        System.out.println("Man2:"+man2.hairLength);
    }
}
