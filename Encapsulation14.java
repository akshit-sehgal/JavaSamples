
package JavaSample;


public class Encapsulation14 {
    public static void main(String[] args){
        Player player=new Player();
        player.name="Aks";
        player.health=20;
        player.weapon="Sword";
        player.loseHealth(21);
        System.out.println("Remaining Health: "+player.healthRemaining());
        EnhancedPlayer pl=new EnhancedPlayer("Kim",50,"Sword");
        pl.loseHealth(23);
        System.out.println("Health : "+pl.getHealth());
    }
}
