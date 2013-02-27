package info._7chapters.webservice.ch01.team.ws;

import info._7chapters.webservice.ch01.team.domain.Team;
import info._7chapters.webservice.ch01.team.util.TeamsUtility;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author Jayram
 *
 */
@WebService
public class Teams {
	private TeamsUtility utils;
	public Teams() {
		utils = new TeamsUtility();
		utils.make_test_teams();
	}
	@WebMethod
	public Team getTeam(String name) { return utils.getTeam(name); }
	@WebMethod
	public List<Team> getTeams() { return utils.getTeams(); }
}