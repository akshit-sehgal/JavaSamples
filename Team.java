
package JavaSample;

import java.util.ArrayList;

public class Team<T extends GPlayer> implements Comparable<Team<T>> {
    private String name;
    private int played=0;
    private int won = 0, lost = 0, tied = 0;
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName() + " is already on this team");
            return false;
        }
        else{
            members.add(player);
            System.out.println(player.getName()+" picked for team "+name);
            return true;
        }
    }
    public int numPlayers(){
        return this.members.size();
    }
    public void matchResult(Team<T> opponent, int ourScore, int thierScore){
        String msg="";
        if(ourScore > thierScore){
            won++;
            msg=" beat ";
        }
        else if(ourScore==thierScore){
            tied++;
            msg=" drew with ";            
        }
        else{
            lost++;
            msg = " lost to ";
        }
        played++;
        if(opponent != null){
            System.out.println(this.getName()+msg+opponent.getName());
            opponent.matchResult(null, thierScore, ourScore);
        }
    }
    public int ranking(){
        return (won*2)+tied;
    }

    @Override
    public int compareTo(Team<T> o) {
        if(this.ranking()>o.ranking())
            return -1;
        else if(this.ranking()<o.ranking())
        return 1;
        else
        return 0;
    }
}
