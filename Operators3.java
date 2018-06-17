package JavaSample;

public class Operators3 {
    public static void main(String[] args){
        int result=1+2;
        System.out.println(result);
        result-=2;
        System.out.println(result);
        result*=8;
        System.out.println(result);
        result/=8;
        System.out.println(result);
        result%=4;
        System.out.println(result);
        result++;
        System.out.println(result);
        
        boolean isHere=false;
        if(isHere==false)
            System.out.println("It is not here");
        int score=70;
        if(score>=50&&score<100)
            System.out.println("hello");
        if(score>90||score<100)
            System.out.println("yaaaa");
        int newValue=50;
        if(newValue==50)
            System.out.println("alright");
        boolean isCar=true;
        if(isCar)
            System.out.println("okayyy");
        boolean wasCar=isCar?true:false;
        System.out.println(wasCar);
    }
}
