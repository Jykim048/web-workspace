package servlet.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.UserDAO;
import model.vo.UserDTO;

public class SelectUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public SelectUserServlet() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String num = request.getParameter("id");

		try {
			UserDTO dto = UserDAO.getInstance().registerMember(num);
			if(dto!=null) {
				request.setAttribute("dto", dto);
				request.getRequestDispatcher("views/searchSuccess.jsp").forward(request, response);								
			} else {
				response.sendRedirect("views/searchFail.jsp");
			}
		} catch (SQLException e) {}
	}


	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
