package kr.co.board.dao;

import kr.co.board.vo.Board;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardDao {

    Board getBoardByNo(int bdNo);
}
