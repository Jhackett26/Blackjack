public class Player {
    public Card[] hand;

    public Player(){
        hand = new Card[2];
    }
    public void printHand(){
        for(int i = 0;i<hand.length;i++){
            //System.out.println(i);
            hand[i].Info();
        }
    }
}
