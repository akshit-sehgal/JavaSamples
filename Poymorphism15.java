
package JavaSample;

class Movie{
    private String name;
    public Movie(String name){
        this.name=name;
    }
    public String plot(){
        return "No plot";
    }

    public String getName() {
        return name;
    }
}
class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "A shark eats a lot of people";
    }
}
class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence Day");
    }
    public String plot(){
        return "Aliens attempt to take over the planet";
    }
}
class MazeRunner extends Movie{
    public MazeRunner (){
        super("Maze Runner");
    }
    public String plot(){
        return "Kids try and escape a maze";
    }
}
class StarWars extends Movie{
    public StarWars (){
        super("Star Wars");
    }
    public String plot(){
        return "Imperial forces try to take over the universe";
    }
}
class Forgetable extends Movie{
    public Forgetable (){
        super("Forgetable");
    }
}
public class Poymorphism15 {
    
    public static void main(String[] args){
        Movie m=new Movie("hello"){
            @Override
            public String plot() {
                return "hello";
            }           
            
        };
        for(int i=1;i<11;i++){
            Movie movie=randomMovie();
            System.out.println("Movie #"+i+": "+movie.getName()+" : Plot: "+movie.plot());
        }
    }
    public static Movie randomMovie(){
        int randomNo=(int)(Math.random()*5)+1;
        System.out.println("Random No. "+randomNo);
        switch(randomNo){
            case 1: return new Jaws();
            case 2: return new IndependenceDay();
            case 3: return new MazeRunner();
            case 4: return new StarWars();
            case 5: return new Forgetable();
        }
        return null;
    }
}

