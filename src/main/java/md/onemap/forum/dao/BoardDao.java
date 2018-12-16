package md.onemap.forum.dao;

import md.onemap.forum.entity.Board;
import md.onemap.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDao
{
  public List<Board> loadAll()
  {
    List<Board> boards = new ArrayList<>();

    try (Connection con = DbUtil.getConnection())
    {
      PreparedStatement pstmt = con.prepareStatement("SELECT * FROM boards");
      ResultSet rs = pstmt.executeQuery();

      while(rs.next())
      {
        int id = rs.getInt("id");
        String name = rs.getString("name");

        boards.add(new Board(id, name));
      }
    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }

    return boards;
  }
}
