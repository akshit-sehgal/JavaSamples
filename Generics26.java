
package JavaSample;

import java.util.ArrayList;

public class Generics26 {
    public static void main(String[] args){
            FootballPlayer joe = new FootballPlayer("Joe");
            BaseballPlayer pat = new BaseballPlayer("Pat");
            SoccerPlayer beck = new SoccerPlayer("Beck");
            Team<FootballPlayer> cross = new Team<>("Cross");
            Team<FootballPlayer> cabe= new Team<>("Cabe");

            Team<BaseballPlayer> chicago = new Team<>("Chicago clubs");
            Team<SoccerPlayer> barca = new Team<>("Barcelona FC");
            cross.addPlayer(joe);
            chicago.addPlayer(pat);
            barca.addPlayer(beck);
            cabe.addPlayer(joe);
            cabe.matchResult(cross,40, 20);
            
            System.out.println(cross.getName()+" : "+cross.ranking());
            System.out.println(cabe.getName()+" : "+cabe.ranking());
            System.out.println(cross.compareTo(cabe));
    }
}
