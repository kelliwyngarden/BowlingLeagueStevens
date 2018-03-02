package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Team;

/**
 * Servlet implementation class addTeamServlet
 */
@WebServlet("/addTeamServlet")
public class addTeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addTeamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String teamName = request.getParameter("teamName");
		String teamType = request.getParameter("teamType");
		String preferredNight = request.getParameter("preferredNight");
		
		Team t = new Team(teamName, teamType, preferredNight);
		TeamHelper dao = new TeamHelper();
		dao.addTeam(t);
		
		getServletContext().getRequestDispatcher("/addTeamInfo.html").forward(request, response);
	}

}
