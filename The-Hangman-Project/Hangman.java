import java.util.Arrays;
import java.util.Scanner;
public class Hangman
{
    public static Scanner scan = new Scanner(System.in);
    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};
    public static String Word=randomWord();
    public static char [] wordArray=Word.toCharArray();
    public static char[] wordPlace=new char[Word.length()];
    public static void main(String[] args)
    {
        for(int i=0;i<Word.length();i++)
        wordPlace[i]='_';   
        String miss="";
        int count =0;
        for(int i=0;i<(wordPlace.length*6);i++)
        {
            System.out.println(gallows[count]);
            if(count==6)
            {
                System.out.println("RIP  !!!");
                System.out.println("The Word was "+Word);
                System.exit(0);

            }
            System.out.print("Word : ");
            placeHolders();
            System.out.println("\n");
            System.out.println("Misses : "+miss+"\n");
            System.out.print("Guess : ");
            char  guessWord = scan.next().charAt(0);
            if (checkGuess(guessWord))
            {
                updatePlaceHolders(guessWord);
                if(Arrays.equals(wordArray,wordPlace))
                {
                    System.out.println("You won !!!");
                    System.exit(0);
                }
            }
            else
            {
                miss=miss+guessWord;
                count++;
            }
        }

    }
/**
 *  public static void updatePlaceHolders(char ch
 * It update the Place Holders of the Game
 * @param ch
 */
    public static void updatePlaceHolders(char ch)
    {
        for(int k=0;k<wordArray.length;k++)
        {
            char a=wordArray[k];
            if(a==ch)
            wordPlace[k]=ch;
        }

    }
    /**
     * public static boolean checkGuess(char ch)
     * It checks whether the character Inputted by the user is there in the random word or not
     * if the character is there in the word it return true else it return false
     * @param ch
     * @return
     */
    public static boolean checkGuess(char ch)
    {
        for(int k=0;k<wordArray.length;k++)
        {
         char a=wordArray[k];
         if(a==ch)
         return true;
        }
        return false;
    }
    /**
     * public static void placeHolders()
     *  It's only function is to print the place holders where they are Underscore or characters
     * 
     */ 
    public static void placeHolders()
    {
        for(int j=0;j<wordPlace.length;j++)
        {
            System.out.print(wordPlace[j]+" ");
        }

    }
    /**
     *public static String randomWord()
     *It's only function is to return a random Word out of the array of words 
     * @return
     */
    public static String randomWord()
    {
        double index = (Math.random()*words.length);
        return words[(int)index];
    }
    
}