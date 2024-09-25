package Servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import Daoimpl.Productdaoimpl;
import Pojo.ProductPojo;

/**
 * Servlet implementation class product
 */
@MultipartConfig
@WebServlet("/product")
public class product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public product() {
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
		String pname=request.getParameter("pname");
		String pdesc=request.getParameter("pdesc");
		int price=Integer.parseInt(request.getParameter("price"));
		int discount=Integer.parseInt(request.getParameter("discount"));
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		String category=request.getParameter("category");
		Part img= request.getPart("image");
		String path=request.getRealPath("images")+File.separator+"product"+File.separator+img.getSubmittedFileName();
		System.out.println(path);
		FileOutputStream fis=new FileOutputStream(path);
		InputStream i=img.getInputStream();
		byte[] b=new byte[i.available()];
		i.read(b);
		fis.write(b);
		fis.close();
		ProductPojo p=new ProductPojo(pname, pdesc, price, discount, quantity, category,img.getSubmittedFileName());
		Productdaoimpl pimpl=new Productdaoimpl();
		HttpSession session=request.getSession();
		if(pimpl.addProduct(p)) {
			session.setAttribute("msg","Product Added Successfully!!");
			response.sendRedirect("admin.jsp");
		}
		else {
			session.setAttribute("msg","Product not Added Successfully!!");
			response.sendRedirect("admin.jsp");
		}
		
	}

}
