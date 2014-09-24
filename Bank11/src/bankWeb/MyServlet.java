package bankWeb;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Storage storage = Storage.getInstance();
	private static List<Customer> custs = storage.getCusts();
	private static List<Account> accs = storage.getAccs();

    /**
     * Default constructor. 
     */
    public MyServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		InputOutput input = new IODatabase();
		input.read();
		
		response.setContentType("text/html;charset=UTF-8");
	      PrintWriter out = response.getWriter();

	      try {
	         out.println("<!DOCTYPE html>");  // HTML 5
	         out.println("<html><head>");
	         out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
	         out.println("<title>MyBank</title></head>");
	         out.println("<body>");
	         out.println("<h1>Hello, %username%, welcome to MyBank</h1>");  

	     
	        for (Customer cust:custs){
	        	out.println(cust.toString());
	        }
	         
	         
	         
	         
	         
	         out.println("</body></html>");
	      } finally {
	         out.close();
	      }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
 
}
