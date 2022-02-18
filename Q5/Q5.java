package Q5;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Q5
 */
@WebServlet("/Q5")
public class Q5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Q5() {
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
		// TODO Auto-generated method stub
//		doGet(request, response);
		String fullName = request.getParameter("fullName");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = initials(fullName);
		out.println(name);
		
	}
	private String initials(String fullName) {
		String name = fullName.trim();
		String initial ;
             initial = name.charAt(0)+"";
                for(int i =0;i<name.length();i++ )
                {
                    if(name.charAt(i)==' ')
                    {initial+=name.charAt(i+1);
                    i++;
                    }
                }

                
		return initial.toUpperCase();
	}
}
