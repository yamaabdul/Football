package Match;

import Players.Player;
import Round.Matchround;

import java.util.ArrayList;

public class MatchController {

    /**
     * get arraylist of player and match rond as an argument
     * return list of winners
     * @param playersList
     * @param round
     * @return
     */
    public static ArrayList<Player> matches(ArrayList<Player> playersList, Matchround round) {
        ArrayList<Player> first = new ArrayList();
        ArrayList<Player> second = new ArrayList();
        ArrayList<Player> winner = new ArrayList();
        for (int i = 0; i < playersList.size(); i = i + 2) {
            first.add(playersList.get(i));
            second.add(playersList.get(i + 1));
        }

        System.out.println("The round " + round.getName() +" winner are : ");
        for(int i = 0; i < second.size(); i++)
        {
            winner.add(getWinner(first.get(i), second.get(i)));
            System.out.println(winner.get(i).getId() + "-"+ winner.get(i).getTeam());
        }

        return winner;
    }

    /**
     * get two argument player and return winner
     * @param p1
     * @param p2
     * @return
     */
    public static Player getWinner(Player p1, Player p2){
        int player1 = (int) (Math.random() *10);
        int player2 = (int) (Math.random() * 10);
        if(player1>player2){
            return p1;
        }
        return p2;

    }


}


