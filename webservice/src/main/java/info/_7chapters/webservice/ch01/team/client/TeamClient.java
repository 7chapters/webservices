package info._7chapters.webservice.ch01.team.client;

import java.util.List;

import teamsC.Player;
import teamsC.Team;
import teamsC.Teams;
import teamsC.TeamsService;
class TeamClient {
	public static void main(String args[ ]) throws Exception {
		TeamsService service = new TeamsService();
		Teams port = service.getTeamsPort();
		List<Team> teams = port.getTeams();
		for (Team team : teams) {
			System.out.println("Team name: " + team.getName() +
					" (roster count: " + team.getRosterCount() + ")");
			for (Player player : team.getPlayers())
				System.out.println(" Player: " + player.getNickname());
		}
	}
}