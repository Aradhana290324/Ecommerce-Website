package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Daoimpl.Userdaoimpl;
import Pojo.User;

/**
 * Servlet implementation class UpdateProfile
 */
@WebServlet("/UpdateProfile")
public class UpdateProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid=Integer.parseInt(request.getParameter("pid"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		int contactno=Integer.parseInt(request.getParameter("contactno"));
		String state=request.getParameter("state");
		String city=request.getParameter("city");
		String street=request.getParameter("street");
		int pincode=Integer.parseInt(request.getParameter("pincode"));
		Userdaoimpl uimpl=new Userdaoimpl();
		User u=new User(email, name, contactno, state, city, street, pincode);
		if(uimpl.updateProfilebyid(pid, u)) {
			response.sendRedirect("Profile.jsp?add=a");
		}
		else {
			System.out.println("not updated");
		}
	}

}
