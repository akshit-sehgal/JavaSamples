package JavaSample;

public class DataTypes2 {
    public static void main(String[] args){
        
        // int has a width of 32 bits
        int myFirstNumber=500_900;
        int secNo=200;
        int myTotal=(myFirstNumber+secNo)/1000;
        System.out.println(myTotal);
        
        // byte has a width of 8 bits (1 byte)
        byte myByte=-128;
        byte newByte=(byte) (myByte/2);        
        System.out.println(newByte);
        
        // short has a width of 16 bits (2 bytes)
        short myShort=(short)2000000090;
        
        // long has width of 64
        long myLong=230_203_109L;
        
        // float has a width of 32 bits (4 bytes)
        float myFloat=5.0f/3; // or (float)(5.0) 7 decimal places precision
        
        // double has a width of 64 bits (8 bytes)
        double myDouble=4.67/3; // or 4.67d 16 decimal places precision
        double pi=3.134_456_9008;
        System.out.println(pi);
        
        // char has a width of 16 bits (2 byte)
        char myChar='\u019D';
        System.out.println(myChar);
        
        // boolean has a wdith of 8 bits (1 byte)
        boolean myBoolean=true;
        System.out.println(myBoolean);
        
        String myString="This is a string";
        myString+="hello"+myLong;
        System.out.println(myString);
    }
}
