import java.util.*;
class Main {
  public static void main(String[] args) {
    int coins = 23;
    Scanner myScan = new Scanner(System.in);
    System.out.println("The goal is to not pick up the last coin.\nEnter 1 for user start, enter 2 for computer start: ");
    int startturn = myScan.nextInt();
    boolean compwin = true;
    boolean start = true;
    boolean twocounter = false;
    int a = 0;
    while(coins > 0){
      if(startturn == 2){
        if (start == true){
          coins -= 1;
          start = false;
          System.out.println("Computer removes 1");
          continue;
        }
        if (coins <= 0){
          compwin = true;
          break;
        }
        System.out.println("Coins left: " + coins + ", remove 1 or 2 coins? ");
        int userremove = myScan.nextInt();
        if (userremove == 1){
          coins -= 3;
          System.out.println("Computer removes 2");
        }
        if (userremove == 2){
          coins -= 3;
          System.out.println("Computer removes 1");
        }
      }
      if (startturn == 1){
        int tempcoins = coins;
        System.out.println("Coins left: " + coins + ", remove 1 or 2? ");
        int userremove = myScan.nextInt();
        if (userremove == 1){
          coins -= 3;
          System.out.println("Computer removes 2");
        }
        if (userremove == 2){
          if (twocounter == false){
            twocounter = true;
            coins -= 4;
            System.out.println("Computer removes 2");
            a = 3;
          }
          else{
            coins -= 3;
            System.out.println("Computer removes 1");
          }
        }
        if (coins <= 0){
          if (a == 0){
            compwin = false;
          }
          if (a == 3){
            compwin = true;
          }
        }
        
        
      }


    }
    if (compwin == true){
      System.out.println("You lost");
    }
    else{
      System.out.println("You won");
    }
  }
}
