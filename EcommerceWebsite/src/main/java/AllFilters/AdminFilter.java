package AllFilters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdminFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse res=(HttpServletResponse)response;
		HttpSession session=req.getSession();
		String usertype=(String)session.getAttribute("usertype");
		if(usertype.equals("admin")) {
			chain.doFilter(req, res);
		}
		else {
			session.setAttribute("msg","you can't access this page!");
			res.sendRedirect("Login.jsp");
		}
		
	}

}
