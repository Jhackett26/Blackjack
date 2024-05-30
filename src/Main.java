public class Main {
    public Card[] deck;
    public Player player1;
    public static void main(String[] args) {
        Main m = new Main();
    }
    public Main(){
        player1 = new Player();

        deck = new Card[52];
        int counter = 0;
        for(int s=1;s<=4;s++){
            for (int i = 1; i<=13;i++){
                Card c = new Card(i,s);
                deck[counter] = c;
                counter++;
            }
        }
        shuffle();
//        printDeck();
        deal();

    }
    public void printDeck(){
        for (int i=0;i<deck.length;i++){
            deck[i].Info();
        }
    }
    public void deal(){
        for(int i= 0; i< player1.hand.length;i++) {
            player1.hand[i] = deck[i];
            // isDealt variable if isDealt{i++}
        }
        player1.printHand();
    }
    public void shuffle() {
        for (int i = 0; i < 52; i++) {
            int switchTo = (int) (Math.random() * 52);
            Card temp = deck[i];
            deck[i] = deck[switchTo];
            deck[switchTo] = temp;
        }
    }
}
