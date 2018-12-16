package md.onemap;

import md.onemap.forum.dao.BoardDao;
import md.onemap.forum.entity.Board;

import java.util.List;

public class MAIN
{
  public static void main(String[] args)
  {
    List<Board> boards = new BoardDao().loadAll();
    System.out.println(boards);
  }
}
