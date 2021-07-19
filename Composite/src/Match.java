import java.util.ArrayList;
import java.util.List;

public class Match implements Tournament{
    private List<Tournament> playerList = new ArrayList<>();
    private Player winner;

    public void addPlayer(Tournament player){
        playerList.add(player);
    }
    @Override
    public Tournament getWinner() {
        winner = (Player)playerList.get(0).getWinner();
        for(int i=1 ; i<playerList.size();i++){
            Player player = (Player)playerList.get(i).getWinner();
            if(winner.getScore() < player.getScore()){
                winner = player;
            }
        }
        return winner;
    }
}
