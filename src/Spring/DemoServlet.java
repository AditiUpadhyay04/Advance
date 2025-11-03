package Spring;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class DemoServlet extends HttpServlet
 {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
     {
        response.getWriter().println("Hello from Servlet!");
    }
}
