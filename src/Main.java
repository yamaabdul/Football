import java.util.ArrayList;
import java.util.Collections;

import Match.MatchController;
import Players.Amateur;
import Players.Player;
import Players.Professional;
import Round.Matchround;

public class Main {


    public static void main(String[] args) {

        ArrayList<Player> playerList = new ArrayList<Player>();

        //load the players
        loadPlayers(playerList);
        //shuffle the teams
        Collections.shuffle(playerList);
        System.out.println("**************Welcome to Football cup*******************");

        for(Player pl: playerList){
            System.out.println("Player  " + pl.getId() +" "+ pl.getTeam() + " " + pl.getTeam());
        }


        Matchround r1 = new Matchround();
        Matchround r2 = new Matchround();
        Matchround r3 = new Matchround();
        r1.setName("one");
        r2.setName("two");
        r3.setName("finals");
        ArrayList<Player> winners1 = new ArrayList<>();
        ArrayList<Player> winners2 = new ArrayList<>();
        ArrayList<Player> winners3 = new ArrayList<>();


        winners1 = MatchController.matches(playerList, r1);
        winners2 = MatchController.matches(winners1, r2);
        winners3 = MatchController.matches(winners2, r3);
        for(int i=0; i<winners3.size(); i++){
            if(winners3.get(i).getSponser().equalsIgnoreCase("budget")){
                System.out.println(" and sponsor is budget ");
            }
            else{
                System.out.println(" and sponsor is mascot");
            }
        }
    }


    /**
     * add to array of player entery
     * @param playerList
     */

    public static void loadPlayers(ArrayList<Player> playerList) {

        Player playe = new Player(1, "professional", "budget");
        playerList.add(playe);
        playe = new Player(2, "professional", "budget");
        playerList.add(playe);
        playe = new Player(3, "professional", "budget");
        playerList.add(playe);
        playe = new Player(4, "professional", "budget");
        playerList.add(playe);
        playe = new Player(5, "amateur", "mascot");
        playerList.add(playe);
        playe = new Player(6, "amateur", "mascot");
        playerList.add(playe);
        playe = new Player(7, "amateur", "mascot");
        playerList.add(playe);
        playe = new Player(8, "amateur", "mascot");
        playerList.add(playe);

    }
}
