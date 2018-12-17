package md.onemap.forum.servlet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet
{
  private static final Logger log = LogManager.getLogger(HelloServlet.class);

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException
  {
    String name = req.getParameter("name");
    log.info("User name is: {}", name);

    try (PrintWriter out = resp.getWriter())
    {
      out.printf("Hello %s !", name);
      out.flush();
    }
  }
}
