package part8.task34;

public class Bank {
    private String name;
    private String numberCard;

    private TypeCard card;
    public String getNameOfBank(){
        return "My Bank";
    }

    public TypeCard getCard() {
        return card;
    }

    public Bank(TypeCard card) {
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }


}
