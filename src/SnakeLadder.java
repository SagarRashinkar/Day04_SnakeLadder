public class SnakeLadder {

    public static int starPos = 0;
    public static int player = 1;
    public static final int WIN_PONITS = 100;
    public static final int NO_PLAY = 1;
    public static final int LADDER = 2;
    public static final int SNAKE = 3;

    public static int rollingDie(){
        int rollValue = (int)Math.floor((Math.random() * 10)%6+1);
        return rollValue;
    }

    public static int checkOptions(){
        int option = (int)(Math.floor(Math.random() * 10)%3+1);
        return option;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Snake Ladder Program!!!");

        int rollValue = rollingDie();
        int optionValue = checkOptions();
        System.out.println(optionValue);
        switch (optionValue){
            case NO_PLAY:
                System.out.println("No Play");
                break;
            case LADDER:
                System.out.println("Player will move forward by position "+rollValue);
                break;
            case SNAKE:
                System.out.println("Player will move backward by position "+rollValue);
        }
    }
}
