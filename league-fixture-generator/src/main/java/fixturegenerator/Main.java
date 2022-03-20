package fixturegenerator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of teams: ");
        int numberOfTeams = input.nextInt();

        List<String> teams = new ArrayList<>();

        for (int i=0; i<numberOfTeams; i++) {
            System.out.println("Enter team name: ");
            String team = input.next();
            teams.add(team);
        }

        FixtureGenerator fixtureGenerator = new FixtureGenerator();

        List<List<Match>> rounds = fixtureGenerator.getFixtures(teams, true);

        for(int i=0; i<rounds.size(); i++){
            System.out.println("Round " + (i+1));
            List<Match> round = rounds.get(i);
            for(Match match: round){
                System.out.println(match.toString());
            }
            System.out.println();
        }

    }
}