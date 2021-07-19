public class Game {
    public static void main(String[]args){
        Player player1 = new Player("Player1" ,20);
        Player player2 = new Player("Player2",30);
        Player player3 = new Player("Player3",40);
        Player player4 = new Player("Player4",45);

        Match quarter1 = new Match();
        quarter1.addPlayer(player1);
        quarter1.addPlayer(player2);

        Match quarter2 = new Match();
        quarter2.addPlayer(player3);
        quarter2.addPlayer(player4);

        Match finalmatch = new Match();
        finalmatch.addPlayer(quarter1);
        finalmatch.addPlayer(quarter2);

        System.out.println("Winner of quarter1: " + quarter1.getWinner());
        System.out.println("Winner of quarter2 " + quarter2.getWinner());
        System.out.println("Winner is: " +finalmatch.getWinner());
    }
}
