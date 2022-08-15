public class SnakeLadder {

    public static int starPos = 0;
    public static int player = 1;
    public static int winPoints = 100;

    public static int rollingDie(){
        int rollValue = (int)Math.floor(((Math.random() * 10)%6+1));
        return rollValue;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Snake Ladder Program!!!");

        int rollValue = rollingDie();
        System.out.println("Roll Value after rolling is: "+rollValue);
    }
}
