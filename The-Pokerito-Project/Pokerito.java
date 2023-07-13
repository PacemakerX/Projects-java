import java.util.Scanner;
public class Pokerito {
    public static String  randomcard()
    {
        int   random =(int)(Math.random()*13);//the value will be scaled to to 0-12.9999
        random+=1;
        String a ="";
        switch(random){
            case 1:
            a=
            "   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n";
            break;
            case 2:
            a=
                "   _____\n"+              
                "  |2    |\n"+ 
                "  |  o  |\n"+
                "  |     |\n"+
                "  |  o  |\n"+
                "  |____Z|\n";
            break;
            case 3:
            a=
            "   _____\n" +
            "  |3    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____E|\n";
            break;
            case 4:
            a=
                   "   _____\n" +
                   "  |4    |\n"+
                   "  | o o |\n"+
                   "  |     |\n"+
                   "  | o o |\n"+
                   "  |____h|\n";
            break;

            case 5:
            a=
                    "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";
            break;
            case 6:
            a="   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";
            break;   
            case 7:
             a= 
                    "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
             break;
            case 8:
            a=
                    "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
            break;  
            case 9:
             a=       "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";
            break;
            case 10:
             a=       "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";
            
            case 11:
            a=
                    "   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";
            break;
            case 12:
                 a=
                    "   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";
            break;  
            case 13: 
            a=
                    "   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";
            break;
        }
        return a;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Let's play Pokerito. Type anything when you're ready.");

        System.out.println("It's like Poker, but a lot simpler.");

        System.out.println("- There are two players, you and the computer.");

        System.out.println("- The dealer will give each player one card.");

        System.out.println("- Then, the dealer will draw five cards (the river)");

        System.out.println("- The player with the most river matches wins!");

        System.out.println("- If the matches are equal, everyone's a winner!");

        System.out.println("- Ready? Type anything if you are.");
        sc.nextLine();
        System.out.println("Here is your card ");
        String yourCard=randomcard();
        System.out.println(yourCard);
        System.out.println("Here's computer's card");
        String compCard=randomcard();
        System.out.println(compCard);
        int cunt=0;
        int lil_cunt=0;
        for (int i=1;i<=5;i++)
        { String comp=randomcard();
            System.out.println("Card "+i);
            System.out.println();
            System.out.println(comp);
            sc.nextLine();
            if(yourCard==comp)
            cunt++;
            if(compCard==comp)
            lil_cunt++;
        }
        System.out.println("Your no. of Matches "+cunt);
        System.out.println("Computer's  no. of Matches "+lil_cunt);
        if(cunt>lil_cunt)
        System.out.println("You won bitch");
        else if(lil_cunt>cunt)
        System.out.println("you lost fucker");
        else if (cunt==lil_cunt)
        System.out.println("Well done Nigga everybody won");
        
        sc.close();
    }
    
}
