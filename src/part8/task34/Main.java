package part8.task34;

public class Main {
    public static void main(String[] args) {
        CreditPlatinum c = new CreditPlatinum();
        OverdraftCard o = new OverdraftCard();
        c.setName("Kate");
        c.setNumberCard("1234 4564 6467 9874");
        System.out.println("Number of Card - "+c.getNumberCard());
        System.out.println(c.getName());
        System.out.println(o.getNameOfBank());
        System.out.println(o.getCard());
    }
}
