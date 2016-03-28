
/**
 * Main is the main application
 * main() is the main method
 * @args
 */

public class Main {
    public static void main(String[] args) {

        Team team = new Team();
        team.teamName = "Mets";
        team.headCoachName = "Joe";


        System.out.println("my team, " + team.teamName +
         ", and my " + team.coaches[0]+ "  coach is: " + team.headCoachName);
    }
}

