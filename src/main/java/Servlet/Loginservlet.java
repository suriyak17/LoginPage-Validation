package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.LoginDAO;
import com.DTO.LoginDTO;


@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
          response.setContentType("text/html");
		
		String username=request.getParameter("username");		
		String password=request.getParameter("password");
		
		System.out.println("username :: "+username);
		System.out.println("password :: "+password);

		
		LoginDTO loginDTO=new LoginDTO();
		
		loginDTO.setUsername(username);
		loginDTO.setPassword(password);
		
		LoginDAO dao = new LoginDAO();
		
		LoginDTO returnLoginDTO = dao.checkLoginUser(loginDTO);
		
		
		System.out.println("DB username :: "+returnLoginDTO.getUsername());
		System.out.println("DB password :: "+returnLoginDTO.getPassword());
		
		if( username.equalsIgnoreCase( returnLoginDTO.getUsername() ) ){
				
			request.getSession().setAttribute("message","Valid User ---- Welcome!!! " );
			
			}else {
				
				
				request.getSession().setAttribute("message", "Invalid User ---- Please try again!!!<br>"
						+ "<br><a href=Login.jsp><button >Try Again</button></a>");
			}
			
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
			
			
			

		
	}
	}


