import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You walk down a shady alley and suddenly, a cold, wet hand grabs your leg...");
        System.out.println("Startled, you look down to see a weird man staring back at you");
        System.out.println("??? : Welcome. I am accelerated edward but you can call me fast eddie...");
        System.out.println("Fast eddie: Looking to make a quick buck?");
        String startgame = scanner.nextLine();

        if (startgame.equals("yes")){
            System.out.println("you: sure");
            startcode();}
        else{
            System.out.println("weirdo.. imagine missing out on this great oppurtionity");}

    }
    public static int startcode(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("fast eddie: okay buddy i havent got much time before the cops get me...");
        System.out.println("fast eddie: how much dough do you wanna hand over? oh sorry i mean bet");
        System.out.println("CHOSE HOW MUCH CASH YOU WANT TO BET BETWEEN 1-50$");
        int startingmoney = scanner.nextInt();
        System.out.println("you : i bet " + startingmoney + "$");
        System.out.println("*you plop down your cash infront of fast eddie*");


        if (startingmoney >= 50){
            System.out.println("fast eddie : he he he haw! thats a whole lot of money!!!");
            game(startingmoney);
        }
        else if (startingmoney <= 20)
        {
            System.out.println("fast eddie : cheap skate bum! cant afford more than 20 bucks!!! you shouldnt have said yes!! too late now...");
            game(startingmoney);
        }
        else {
            game(startingmoney);
        }
        return startingmoney;
    }
    public static void game(Integer startingmoney){
        Scanner scanner = new Scanner(System.in);
        //System.out.println("*fast eddie brings out 5 red solo cups from his crusty duffle bag.*");
        //System.out.println("*then he places it on the grimy alley-way floor *");
        System.out.println("*cautiously, you take a seat on the grimy floor, stooping down to edward's level*");
        System.out.println("*fast eddie brings out 5 red solo cups from his crusty duffle bag.*");
        System.out.println("|1| |2| |3| |4| |5|");
        System.out.println("fast eddie: i will place a ping pong ball in the cup. using my incredible cup shuffling skillz, \n" +
                "i will mix the cups up. you will not be able to tell which cup the ball is in. if you do, you get a reward. \n" +
                "if you dont.... you will pay a PRICE!!!!");
        int cup = ((int)(Math.random()* 5) +1 ); //5 is range and 1 is minimum i studied that for the quiz today which i failed
        System.out.println("*cup scraping noises*..... fast eddie: okay i have finished shuffling.");
        System.out.println("what is your guess?");
        Integer guess = scanner.nextInt();
        switch (cup){
            case 1:
                System.out.println("|o| |2| |3| |4| |5|");
                break;
            case 2:
                System.out.println("|1| |o| |3| |4| |5|");
                break;
            case 3:
                System.out.println("|1| |2| |o| |4| |5|");
                break;
            case 4:
                System.out.println("|1| |2| |3| |o| |5|");
                break;
            case 5:
                System.out.println("|1| |2| |3| |4| |o|");
                break;
        }
        if (guess == cup){

            System.out.println("fast eddie: WHAT THE HICKETY-HECK!!!!!!!");
            System.out.println("THIS IS THE FIRST TIME SOMEONE HAS EVER GUESSED CORRECTLY");
            System.out.println("I CALL HACKS!!!");
            System.out.println("you: hand it over, fast- accelerated edward.");
            System.out.println("DONT CALL ME BY MY FULL NAME");
            System.out.println("*accelerated edward jumps up and down and cries. after his tantrum, he sadly gives you $"+ (startingmoney *2));
            int totalmoney = (startingmoney * 2);
            System.out.println("you now have $" + (startingmoney *2));
            playagain(totalmoney, startingmoney);

        }
        else {

            System.out.println("fast eddie: he he he haw! (clash royale reference) you just got #scammed #bamboozled #conned ");
            System.out.println("the answer that could have made you money was: "+ cup);
            System.out.println("pay up" );
            System.out.println("you give fast eddie " + startingmoney * 2 );
            int totalmoney = (0 - startingmoney);
            System.out.println("you now have -" + startingmoney);
            playagain(totalmoney, startingmoney);
        }

    }
    public static void playagain(Integer totalmoney, Integer startingmoney){
        Scanner scanner = new Scanner(System.in);
       System.out.println("lets play again baby");
        System.out.println("|1| |2| |3| |4| |5|");
        System.out.println("*cup scraping noises*..... fast eddie: okay i have finished shuffling. what is your guess?");
        Integer guess = scanner.nextInt();
        int cup = ((int)(Math.random()* 5) +1 );
        switch (cup){
            case 1:
                System.out.println("|o| |2| |3| |4| |5|");
                break;
            case 2:
                System.out.println("|1| |o| |3| |4| |5|");
                break;
            case 3:
                System.out.println("|1| |2| |o| |4| |5|");
                break;
            case 4:
                System.out.println("|1| |2| |3| |o| |5|");
                break;
            case 5:
                System.out.println("|1| |2| |3| |4| |o|");
                break;
        }
        if (guess == cup){
            System.out.println("fast eddie: WHAT THE HICKETY-HECK!!!!!!!");
            System.out.println("Im becoming broke...!");
            System.out.println("*accelerated edward jumps up and down and cries. after his tantrum, he sadly gives you $"+ (totalmoney *2));
            totalmoney = (totalmoney * 2);
            System.out.println("you now have $" + (totalmoney*2));
        }
        else {

            System.out.println("fast eddie: he he he haw! (clash royale reference) you just got #scammed #bamboozled #conned ");
            System.out.println("the answer that could have made you money was: "+ cup);
            System.out.println("pay up" );
            System.out.println("you give fast eddie " + totalmoney * 2 );
            totalmoney = (startingmoney - totalmoney);
            System.out.println("you now have -" + totalmoney);
            System.out.println("you walk away heartbroken and poor ");
        }
       //if (guess == cup)
    }

}