import java.util.Random;
import java.util.Scanner;

public class ps1{
    public static void main(String[] args) {
        Random randomInt = new Random();
        Scanner user=new Scanner(System.in);
        System.out.print("please enter a player name: ");
        String name= user.next();
        System.out.printf("%s vs system\nwe are going to play 3 round only:\n",name);
        int system_score=0;
        int player_score=0;
        String options[]={"Rock","scissors","paper"};

        for(int i =1;i<=3;i++) {
            System.out.printf("\nround->:%d\n#Menu for Game#\n1:Rock\n2:scissors\n3:Paper\nEnter your choice:",i);
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            int ran = randomInt.nextInt(1,4);
            System.out.printf("\nYou choose: %s\n",options[choice-1]);
            System.out.println("System choose:"+options[ran-1]);
             if (choice==1 && ran==2){
                player_score++;

            } else if (choice==2 && ran ==3) {
                player_score++;

            } else if (choice==3 && ran==1) {
                player_score++;

            }
            else if (choice==1 && ran ==3) {
                system_score++;

            }
            else if (choice==2 && ran ==1) {
                system_score=system_score+1;
            } else if (choice==3 && ran==2) {
                 system_score++;

            }
            System.out.printf("\nsystem score is:%d\nplayer score is:%d\n",system_score,player_score);
        }
        if(system_score>player_score){
            System.out.println("SYSTEM WIN, BETTER LUCK NEXT TIME!");
        }
        else if(system_score==player_score){
            System.out.println("OOPS MATCH TIE! ");
        }
        else{
            System.out.printf("CONGRATULATION %s, YOU WIN!",name.toUpperCase());
        }


    }
}
