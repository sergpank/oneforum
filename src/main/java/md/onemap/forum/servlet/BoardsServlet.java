package md.onemap.forum.servlet;

import md.onemap.forum.dao.BoardDao;
import md.onemap.forum.entity.Board;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class BoardsServlet extends HttpServlet
{
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException
  {
    try (PrintWriter out = resp.getWriter())
    {
      out.println("<html>");
      out.println("<body>");

      out.println("<h1>ONE_FORUM</h1>");

      out.println("<h2>Boards:</h2>");

      for (Board board : new BoardDao().loadAll())
      {
        out.printf("<h3>%s</h3>\n", board.getName());
      }

      out.println("</body>");
      out.println("</html>");

      out.flush();
    }
  }
}
