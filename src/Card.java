public class Card {
    public int cardNum;
    public String cardName;
    public String suitName;
    public int suitNum;
    public boolean isDealt;
    public int points;

    public Card(int paramCardNum, int paramSuit){
        cardNum = paramCardNum;
        suitNum = paramSuit;
        if (suitNum==1){
            suitName = "spades";
        }
        if (suitNum==2){
            suitName = "diamonds";
        }
        if (suitNum==3){
            suitName = "clubs";
        }
        if (suitNum==4){
            suitName = "hearts";
        }
        if (cardNum == 1){
            cardName = "Ace";
        }
        else if (cardNum == 11){
            cardName = "Jack";
        }
        else if (cardNum == 12){
            cardName = "Queen";
        }
        else if (cardNum == 13){
            cardName = "King";
        }
        else{
            cardName = String.valueOf(cardNum);
        }

    }
    public void Info(){
        System.out.println(cardName+" of "+suitName);
    }
}
