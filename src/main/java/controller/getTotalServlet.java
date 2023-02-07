package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TotalOfNumbers;

/**
 * Servlet implementation class getTotalServlet
 */
@WebServlet("/getTotalServlet")
public class getTotalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getTotalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userFirstNum = request.getParameter("userFirstNum");
		String userSecondNum = request.getParameter("userSecondNum");
		
		TotalOfNumbers totalNumber = new TotalOfNumbers(Integer.parseInt(userFirstNum),Integer.parseInt(userSecondNum));
		
		request.setAttribute("totalOfTwoNum", totalNumber);
		
		getServletContext().getRequestDispatcher("/resultoftwonum.jsp").forward(request, response);
		
		//PrintWriter writer = response.getWriter();
		//writer.println(totalNumber.toString());
		//writer.println("First number:" + userFirstNum.toString());
		//writer.println("Second number:" + userSecondNum.toString());
		//writer.close();
	}

}
