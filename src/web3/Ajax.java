package web3;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ajax
 */
@WebServlet("/Ajax")
public class Ajax extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ajax() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String content = request.getParameter("text");
		MinhaThread m = new MinhaThread();
		m.setTexto(content);
		new Thread(m).start();
		request.getServletContext().setAttribute("thread", m);
		
		//response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("Novo Texto registrado");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MinhaThread m2 = (MinhaThread)request.getServletContext().getAttribute("thread");
		
		if (m2.getFlag() == true) {
			response.getWriter().println(m2.getTexto());
		} else {
			response.getWriter().println("esse texto é antigo");
		}
		
	}

}
