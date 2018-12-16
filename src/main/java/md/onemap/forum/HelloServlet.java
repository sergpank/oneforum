package md.onemap.forum;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet
{
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
  {
    String name = req.getParameter("name");

    try (PrintWriter out = resp.getWriter())
    {
      out.printf("Hello %s !", name);
      out.flush();
    }
  }
}
