import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author SummerGasaway
 */
public class QuidditchMain 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Random rnd = new Random();
        
        ArrayList<String> teams = new ArrayList<>();//1: create an arraylist
        teams.add("Dragons");
        teams.add("Gryffons");
        teams.add("Wizards");
        teams.add("Goblins");
        teams.add("Elves");
        teams.add("Krackens");
        teams.add("Phoenixes");
        teams.add("Werewolves");
        
        System.out.println("Round #1");
        equals();
        playGame(0, 1, teams);//round 1
        playGame(1,2,teams);
        playGame(2,3,teams);
        playGame(3,4,teams);
        System.out.println();
        
        System.out.println("Teams still remaining");
        stars();
        System.out.println();
        System.out.println(teams.get(0) + ", " + teams.get(1) + ", " + teams.get(2) + ", " + teams.get(3));
        System.out.println();
        
        System.out.println("Round #2");
        equals();
        playGame(0, 1, teams);
        playGame(1, 2, teams);
        System.out.println();
        
        System.out.println("Teams still remaining");
        stars();
        System.out.println();
        System.out.println(teams.get(0) + " and " + teams.get(1));
        System.out.println();
        
        System.out.println("FINAL ROUND");
        equals();    
        System.out.println();
        playGame(0, 1, teams);
        System.out.println();
        
        System.out.println("The Winner IS:");
        System.out.println(teams.get(0) + "!!!!!!!!!");
        System.out.println();
        System.out.println("Thanks for watching!!");
        System.out.println();
        
    }
    public static void playGame(int teamA, int teamB, ArrayList<String>teams)//ints are the locations of the teams in the arraylist
    {
        //teamOne is the SCORE for teamA
        //teamTwo is the SCORE for teamB
        int teamOne = 0;
        int teamTwo = 0;
        int teamOneSc = 0;
        int teamTwoSc = 0;
        System.out.println();
        System.out.println("   " + teams.get(teamA)+" vs. " +teams.get(teamB));//gets names off teamA and teamB
        System.out.print("    ------------------");
        System.out.println();
        for (int cnt = 1; cnt < 5; cnt++)//cycles through each quarter; counting quarters
         {
            teamOne = score();
            teamTwo = score();
            System.out.println("Qtr " + cnt + ":  " + teamOne + "      " + teamTwo);//displays number of goals
            teamOneSc = teamOneSc + teamOne;
            teamTwoSc = teamTwoSc + teamTwo;
             
         }  
         if (snitchGet() == 1 && randomScore() == 1)
         {
            System.out.println(teams.get(teamA) + " win by capturing the golden snitch!");
            System.out.println(teams.get(teamB) + " eliminated.");
            teams.remove(teamB);
         }
         else if (snitchGet() == 1 && randomScore() == 1)
         {
            System.out.println(teams.get(teamB) + " win by capturing the golden snitch!");
            System.out.println(teams.get(teamA) + " eliminated.");
            teams.remove(teamA);
         }
         else if (teamOneSc > teamTwoSc)
         {
            System.out.println(teams.get(teamA) + " win " + teamOneSc + " to " + teamTwoSc);
            System.out.println(teams.get(teamB) + " eliminated.");
            teams.remove(teamB);
         }
         else if (teamOneSc < teamTwoSc)
         {
            System.out.println(teams.get(teamB) + " win " + teamTwoSc + " to " + teamOneSc);
            System.out.println(teams.get(teamA) + " eliminated.");
            teams.remove(teamA);            
         }
         else
         {
            System.out.println("Tie! SUDDEN DEATH!!");
            int done = 1;
            do
            {
            teamOne = score();
            teamTwo = score();                
                if (teamOne > teamTwo)
                {
                    System.out.println(teams.get(teamA) + " win in sudden death!");
                    teams.remove(teamB);
                    done = 0;
                }                 
                else if (teamTwo > teamOne)
                {
                    System.out.println(teams.get(teamB) + " win in sudden death!");
                    teams.remove(teamA);
                    done = 0;
                }
            }while (done == 1);
        }

    }

    private static int score ()//DONE MAKES GOAL IN 4 QUARTERS DISPLAYS ALL 4 JFC
    {
        Random rand = new Random();//makes shit random
        int goalOne = 0;
        int teamScoreOne = 1;
        int scoreTotOne = 1;
        
        goalOne = rand.nextInt(4);
        return goalOne;
    }
    private static int snitchGet ()
    {
        Random rand = new Random();
        int gotSnitch = 0;
        int getSnitch = 0;
        
        getSnitch = rand.nextInt(15);
        
        if (getSnitch == 4)
        {
            gotSnitch = 1;
        }
        return gotSnitch;
    }
    private static int randomScore ()
    {
        Random rand = new Random();
        int teamSnitch = 0;
        
        teamSnitch = rand.nextInt(2)+1;
        
        return teamSnitch;
    }
    private static void stars()
    {
        for (int cnt = 0; cnt < 30; cnt++)
        {
           System.out.print("*"); 
        }
        
    }
    private static void equals()
    {
        for (int cnt = 0; cnt < 30; cnt++)
        {
           System.out.print("="); 
        }         
    }
}
