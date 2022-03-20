package fixturegenerator;

import java.util.LinkedList;
import java.util.List;

public class FixtureGenerator{

    public List<List<Match>> getFixtures(List<String> teams, boolean includeReverseFixtures) {

        int numberOfTeams = teams.size();

        if (numberOfTeams % 2 != 0) {
            teams.add("NA");
            numberOfTeams++;
        }

        int totalRounds = numberOfTeams - 1;
        int matchesPerRound = numberOfTeams / 2;
        List<List<Match>> rounds = new LinkedList<>();

        for (int round = 0; round < totalRounds; round++) {
            List<Match> matches = new LinkedList<>();
            for (int match = 0; match < matchesPerRound; match++) {
                int home = (round + match) % (numberOfTeams - 1);
                int away = (numberOfTeams - 1 - match + round) % (numberOfTeams - 1);
                if (match == 0) {
                    away = numberOfTeams - 1;
                }
                matches.add(new Match(teams.get(home), teams.get(away)));
            }
            rounds.add(matches);
        }

        List<List<Match>> interleaved = new LinkedList<>();

        int evn = 0;
        int odd = (numberOfTeams / 2);
        for (int i = 0; i < rounds.size(); i++) {
            if (i % 2 == 0) {
                interleaved.add(rounds.get(evn++));
            } else {
                interleaved.add(rounds.get(odd++));
            }
        }

        rounds = interleaved;

        for (int roundNumber = 0; roundNumber < rounds.size(); roundNumber++) {
            if (roundNumber % 2 == 1) {
                Match match = rounds.get(roundNumber).get(0);
                rounds.get(roundNumber).set(0, new Match(match.getAwayTeam(), match.getHomeTeam()));
            }
        }

        if(includeReverseFixtures){
            List<List<Match>> reverseFixtures = new LinkedList<>();
            for(List<Match> round: rounds){
                List<Match> reverseRound = new LinkedList<>();
                for(Match fixture: round){
                    reverseRound.add(new Match(fixture.getAwayTeam(), fixture.getHomeTeam()));
                }
                reverseFixtures.add(reverseRound);
            }
            rounds.addAll(reverseFixtures);
        }

        return rounds;
    }
}
