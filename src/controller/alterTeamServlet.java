package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Team;

/**
 * Servlet implementation class alterTeamServlet
 */
@WebServlet("/alterTeamServlet")
public class alterTeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public alterTeamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		TeamHelper th = new TeamHelper();
		String act = request.getParameter("doThisToTeam");
		
		if(act == null) {
			getServletContext().getRequestDispatcher("/viewAllTeams.jsp").forward(request, response);
		} else if (act.equals("Delete Team")) {
			Integer id = Integer.parseInt(request.getParameter("id"));
			Team teamToDelete = th.searchForTeamById(id);
			th.deleteTeam(teamToDelete);
			
			getServletContext().getRequestDispatcher("/viewAllTeamsServlet").forward(request, response);
		} else if (act.equals("Add Team")) {
			getServletContext().getRequestDispatcher("/addTeamInfo.html").forward(request, response);
		}
	}

}
