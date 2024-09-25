package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Daoimpl.Categorydaoimpl;
import Pojo.CategoryPojo;

/**
 * Servlet implementation class Category
 */
@WebServlet("/Category")
public class Category extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Category() {
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
		
		HttpSession session=request.getSession();
		String cname=request.getParameter("cname");
		String cdesc=request.getParameter("cdesc");
		CategoryPojo cpojo=new CategoryPojo(cname, cdesc);
		Categorydaoimpl cimpl=new Categorydaoimpl();
		if(cimpl.addcategory(cpojo)) {
			session.setAttribute("msg","Category Added Successfully!!");
			response.sendRedirect("admin.jsp");
		}
		else {
			session.setAttribute("msg","Category not Added Successfully!!");
			response.sendRedirect("admin.jsp");
		}
	}

}
