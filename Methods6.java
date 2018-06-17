
package JavaSample;

public class Methods6 {
    private static final String INVALID_VALUE_MESSAGE="Invalid value";
    public static void main(String[] args){
        int finalScore=calculateScore(true,100,5,100);        
            System.out.println("Game Over.\nYour score is: "+finalScore);
            
            int newScore=calculateScore("Akshit",100);
            System.out.println("New score is: "+newScore);
            newScore=calculateScore(90);
            System.out.println("New score is: "+newScore);
    }
    public static int calculateScore(boolean gameOver, int score,int levelCompleted,int bonus){
       
        if(gameOver){
            int finalScore=score+(levelCompleted*bonus);
            finalScore+=1000;            
            return finalScore;
        }
            return -1;
    }
    public static int calculateScore(String name,int score){
        System.out.println("Player "+name+" scored "+score+" points.");
        return score*1000;
    }
    public static int calculateScore(int score){
        System.out.println("Player  scored "+score+" points.");
        return score*1000;
    }
}
